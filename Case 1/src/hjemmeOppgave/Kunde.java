/*
 * Skrevet av Sandra Moen 8 februar 2018
 * 
 * 
 */


package hjemmeOppgave;

import java.util.ArrayList;

public class Kunde {

	Long id;
	String navn;
	ArrayList<String> bestillt;
	ArrayList<String> bestilltOgLevert;
	
	
	public Kunde(String navn) {
		this.navn = navn;
	}
	
	public void setId(Long id) { this.id = id; }
	
	// TODO: Skal disse funksjonen heller være i registeret?
	public void leggTilBestilling(String nyKake) { bestillt.add(nyKake); }	
	public void levert(String levertKake) {	bestillt.remove(levertKake); }
	// ----------------------------------------------------
	
	public Long getId() { return id; }
	public String getNavn() { return navn; }
	public ArrayList<String> getBestilling() { return bestillt; }
	public ArrayList<String> getBestilltOgLevert() { return bestilltOgLevert; }

}
