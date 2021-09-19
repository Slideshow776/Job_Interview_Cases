package hjemmeOppgave;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

public class PersonRegister {

	private HashMap<Long, Person> register;
	private AtomicLong id;

	public PersonRegister() {
		register = new HashMap<Long, Person>();
		id = new AtomicLong();		
	}

	public Long leggTilPerson(String navn, int formue, String fødselsdato) {		
		String[] splitStr = fødselsdato.split("\\.");		
		Calendar dato = Calendar.getInstance();
		dato.set(
				Integer.parseInt(splitStr[2]),
				Integer.parseInt(splitStr[1]) - 1, // offset. Months count from 0, not 1
				Integer.parseInt(splitStr[0])
				);

		Long personId = id.incrementAndGet();
		Person person = new Person(
				navn,
				formue,
				dato.getTime(),
				personId
				);
		register.put(personId, person);
		return person.getId();
	}

	public void leggTilForeldrerelasjon(Long idForelder, Long idBarnet) {
		Person forelder = hentPerson(idForelder);
		Person barnet = hentPerson(idBarnet);
		if (barnet.getForeldre().size() < 2 && barnet.getFødselsdato().after(forelder.getFødselsdato())) {
			barnet.setForeldre(forelder);
			forelder.setBarn(barnet);
		}
		else {
			System.err.println("Feil: " + barnet.getNavn() +
					" med id: " + barnet.getId() + " kan ikke ha mer enn to foreldre!");
		}
	}

	public ArrayList<String> printPersonregisteretAlfabetisk() {
		ArrayList<String> values = new ArrayList<String>();
		if (register.size() > 0) {
			for (Long key: register.keySet()) {
				values.add(register.get(key).getNavn());
			}
			Collections.sort(values);
		}
		else {
			throw new EmptyStackException();
		}
		return values;
	}
	
	public Person hentPerson(Long id) { return register.get(id); }
	public HashMap<Long, Person> getRegister() { return register; }

	public void registrerDød(Long personId) {
		Person person = hentPerson(personId);
		person.setLevende(false);
		arv(person);
	}
	
	private void arv(Person person) {
		int arv = person.getFormue();
		person.setFormue(0);
		ArrayList<Person> barna = person.getBarn();
		
		int delarv = arv / barna.size(); // avrundet ører går til banken.		
		if (delarv > 100000) { delarv *= .75; } // skatt på arv mer enn 100k
		
		for (Person barn: barna) {
			barn.setFormue(barn.getFormue() + delarv);
		}
	}
}
