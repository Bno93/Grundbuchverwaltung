package grundbuch;

import java.util.ArrayList;
import java.util.List;

/**
 * Class contains a Grundbuch with a List of all Blaettern.
 * @author da5254
 *
 */
public class Grundbuch {
	private String grundbuchName;
	private int grundbuchNummer;
	List<Grundbuchblatt> blaetter = new ArrayList<Grundbuchblatt>();
	public Grundbuch(String grundbuchName, List<Grundbuchblatt> blaetter) {
		this.grundbuchName = grundbuchName;
		this.blaetter = blaetter;
	}
	/**
	 * Check is Blatt exists in Grundbuch.
	 * @param blatt Gruchbuchblatt
	 * @return <code>true</code> if the Blatt exists, otherwise <code>false</code>.
	 */
	public boolean blattExists(Grundbuchblatt blatt){
		if(blatt == null) {
			throw new IllegalArgumentException ("Blatt can not be null!");
		}
		return this.blaetter.contains(blatt);
	}
	/**
	 * Add a Blatt to the Grundbuch.
	 * @param blatt Grundbuchblatt
	 */
	public void createNewBlatt(Grundbuchblatt blatt){
		if(blatt == null) {
			throw new IllegalArgumentException("Blatt can not be null!");
		}
		if(!this.blattExists(blatt)){
			this.blaetter.add(blatt);
		}
	}

	/**
	 * @return the grundbuchName
	 */
	public String getGrundbuchName() {
		return this.grundbuchName;
	}

	/**
	 * @return the grundbuchNummer
	 */
	public int getGrundbuchNummer() {
		return this.grundbuchNummer;
	}
	/**
	 * @param grundbuchName the grundbuchName to set
	 */
	public void setGrundbuchName(String grundbuchName) {
		this.grundbuchName = grundbuchName;
	}

	/**
	 * @param grundbuchNummer the grundbuchNummer to set
	 */
	public void setGrundbuchNummer(int grundbuchNummer) {
		this.grundbuchNummer = grundbuchNummer;
	}
}
