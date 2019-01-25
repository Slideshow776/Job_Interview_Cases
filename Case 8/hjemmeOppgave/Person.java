package hjemmeOppgave;

import java.util.ArrayList;

public class Person {

	private int id;
	private int formue;
	private String navn;
	private String fodselsnummer;
	private boolean levende;
	private int antallForeldre;
	private ArrayList<Person> foreldre;
	
	public Person(String navn, int formue, String fodselsnummer) {
		this.navn = navn;
		this.formue = formue;
		this.fodselsnummer = fodselsnummer;
		
		id++;
		levende = true;
		antallForeldre = 0;
		foreldre = new ArrayList<Person>();
	
	}
	
	public void registrerForeldre(Person forelder) {		
		int foreldreAar = Integer.parseInt(forelder.getFodselsnummer().substring(4, 6));
		int barnAar = Integer.parseInt(getFodselsnummer().substring(4, 6));

		if(foreldreAar > barnAar) { //TODO: denne fungerer ikke ved aartusenskifte.
			System.out.println("Feil: Barn kan ikke vaere eldre enn foreldre");
			return;
		}
		
		if (antallForeldre < 2) {
			foreldre.add(forelder);
			antallForeldre++;
		}
		else {
			System.out.println("Feil: Kan ikke ha flere enn 2 foreldre");
		}		
	}
	
	public ArrayList<Person> getForeldre() {
		return foreldre;
	}
	
	public boolean getLevende() {
		return levende;
	}
	
	public String getFodselsnummer() {
		return fodselsnummer;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public int getFormue() {
		return formue;
	}
	
	public int getId() {
		return id;
	}
}