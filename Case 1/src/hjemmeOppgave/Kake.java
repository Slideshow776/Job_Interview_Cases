/*
 * Skrevet av Sandra Moen 8 februar 2018
 * 
 * 
 */



package hjemmeOppgave;

import java.util.Calendar;
import java.util.Date;

public class Kake {
	
	String kakeType;
	Calendar calendar;
	Date bestillt, levert;
	Long kundeId;
	// enum kaketyper {Kransekaker, Sjokoladekaker, Bløtkaker};
	
	public Kake(String kakeType, int time, int minutt, int sekund) {
		this.kakeType = kakeType;
		
		// type = kaketyper.Bløtkaker;
		
		calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, time);
		calendar.set(Calendar.MINUTE, minutt);
		calendar.set(Calendar.SECOND, sekund);

		bestillt = calendar.getTime();
	}
	
	public void setKundeId(Long id) { kundeId = id; }
	
	public String getType() { return kakeType; }
	public Long getKundeId() { return kundeId; }
	public Date getBestilltTidspunkt() { return bestillt; }
}
