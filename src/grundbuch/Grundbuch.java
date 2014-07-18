package grundbuch;

import java.util.ArrayList;
import java.util.List;

/**
 * Class contains a Grundbuch with a List of all Blaettern.
 * @author da5254
 *
 */
public class Grundbuch {
	List<Grundbuchblatt> blaetter = new ArrayList<Grundbuchblatt>();
	private String grundbuchName;
	private int grundbuchNummer;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Grundbuch other = (Grundbuch) obj;
		if (this.grundbuchName == null) {
			if (other.grundbuchName != null) {
				return false;
			}
		} else if (!this.grundbuchName.equals(other.grundbuchName)) {
			return false;
		}
		return true;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.grundbuchName == null) ? 0 : this.grundbuchName.hashCode());
		return result;
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
