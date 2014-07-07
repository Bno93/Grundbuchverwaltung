package grundbuch;

import java.util.Date;

public class Grundakte {
	private Date eingangssatum;
	private Date bearbeitungsdatum;
	private Grundbuchblatt grundbuchBlatt;
	
	public void create(Date eingangsdatum, Grundbuchblatt grundbuchBatt){
		this.eingangssatum = eingangsdatum;
		this.grundbuchBlatt = grundbuchBatt;
	}
	
	public void change(Date bearbeitungsdatum){
		this.bearbeitungsdatum = bearbeitungsdatum;
	}
	
	public Date getBearbeitungsdatum() {
		return bearbeitungsdatum;
	}
	
	public Date getEingangssatum() {
		return eingangssatum;
	}
	
	public Grundbuchblatt getGrundbuchBlatt() {
		return grundbuchBlatt;
	}
}
