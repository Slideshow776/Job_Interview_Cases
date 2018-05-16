package hjemmeOppgave;

import java.util.ArrayList;
import java.util.Date;

public class Person {
	
	private final Long ID;
	
	private int formue;
	private String navn;
	private Date fødselsdato;
	private Boolean levende;
	private ArrayList<Person> foreldre;
	private ArrayList<Person> barn;
	
	public Person(String navn, int formue, Date fødselsdato, Long ID) {
		this.navn = navn;
		this.formue = formue;
		this.fødselsdato = fødselsdato;		
		this.ID = ID;
		
		levende = true;
		foreldre = new ArrayList<Person>();
		barn = new ArrayList<Person>();
	}
	
	public void setLevende(Boolean iLivet) { levende = iLivet; }
	public void setBarn(Person barnet) { barn.add(barnet); }
	public void setForeldre(Person forelder) { foreldre.add(forelder); }
	public void setFormue(int nyFormue) { formue = nyFormue; }
	
	public ArrayList<Person> getForeldre() { return foreldre; }
	public ArrayList<Person> getBarn() { return barn; }
	public Long getId() { return ID; }
	public String getNavn() { return navn; }
	public Date getFødselsdato() { return fødselsdato; }
	public Boolean getLevende() { return levende; }
	public int getFormue() { return formue; }
}
