package hjemmeOppgave;

import java.util.ArrayList;

public class PersonRegister {

	ArrayList<Person> register = new ArrayList<Person>();
	
	public static void main(String[] args) {		
		//Person p = new Person("Sandra", 150, "031185");
		//p.registrerForeldre(new Person("Tone", 200, "031182"));
		
	}
	
	public int lagrePerson(String navn, int formue, String fodselsnummer) {
		Person p = new Person(navn, formue, fodselsnummer);
		register.add(p);
		return p.getId();
	}
	
	public Person getPerson(int id) {
		for(int i = 0; i < register.size(); i++) {
			if(id == register.get(i).getId()) {
				return register.get(i);
			}
		}
		return null; // returnerer null om person-id input ikke finnes. TODO: lag skikkelig "feil-melding"
	}

	public void registrerForeldre(int barnId, int forelderId) {
		for(int i = 0; i < register.size(); i++) {
			if(barnId == register.get(i).getId()) {
				register.get(i).registrerForeldre(register.get(forelderId));
			}
		}
	}

	public ArrayList<Person> listOppPersonerRegistrertSortertAlfabetiskPaaNavn() {
		ArrayList<Person> sortertListe;
		
		if(register.size() > 0) {
			sortertListe
		}
		return null; //TODO: maa ha skikkelig feil-melding.. 
	}
}
