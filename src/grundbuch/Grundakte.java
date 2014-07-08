package grundbuch;

import java.util.Date;

/**
 * Contains a Grundakte with a Eingangsdatum, Bearbeitungsdatum and a refference to a Grundbuchblatt
 * @author da5254
 *
 */
public class Grundakte {
	private Date eingangssatum;
	private Date bearbeitungsdatum;
	private Grundbuchblatt grundbuchBlatt;

	/**
	 * Change the last working Date of the Grundakte
	 * @param bearbeitungsdatum Bearbeitungsdatum
	 */
	public void change(Date bearbeitungsdatum){
		if(bearbeitungsdatum == null){
			throw new IllegalArgumentException("Bearbeitungsdatum can not be null!");
		}
		this.bearbeitungsdatum = bearbeitungsdatum;
	}

	/**
	 * Create a new Grundakte with a Eingangsdatum and a reference to a Grundbuchblatt
	 * @param eingangsdatum Eingansdatum der Akte
	 * @param grundbuchBatt Blatt der Akte
	 */
	public void create(Date eingangsdatum, Grundbuchblatt grundbuchBatt){
		if (eingangsdatum == null) {
			throw new IllegalArgumentException("Date can not be null!");
		}
		if (grundbuchBatt == null){
			throw new IllegalArgumentException("Grundbuchblatt can not be null!");
		}
		this.eingangssatum = eingangsdatum;
		this.grundbuchBlatt = grundbuchBatt;
	}

	/**
	 * Get last Bearbeitungsdatum
	 * @return Bearbeitungsdatum
	 */
	public Date getBearbeitungsdatum() {
		return this.bearbeitungsdatum;
	}

	/**
	 * Get Eingangsdatum
	 * @return Eingangsdatum
	 */
	public Date getEingangssatum() {
		return this.eingangssatum;
	}

	/**
	 * Get Grundbuchblatt
	 * @return {@link Grundbuchblatt}
	 */
	public Grundbuchblatt getGrundbuchBlatt() {
		return this.grundbuchBlatt;
	}
}
