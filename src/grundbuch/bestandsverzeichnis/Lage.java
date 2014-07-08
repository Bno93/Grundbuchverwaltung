package grundbuch.bestandsverzeichnis;

/**
 * Contains Ort, PLZ, hausnummer and strasse.
 * @author da5254
 *
 */
public class Lage {
	private String ort;
	private int plz;
	private String hausnummer;
	private String strasse;

	/**
	 * Create {@link Lage} with the given ort, plz, hausnummer, plz
	 * @param ort Ort
	 * @param plz PLZ
	 * @param hausnummer Hausnummer
	 * @param strasse Strasses
	 */
	public Lage(String ort, int plz, String hausnummer, String strasse) {
		if(ort == null || ort.isEmpty()) {
			throw new IllegalArgumentException("Ort can not be null or Empty!");
		}
		if(plz <0 || plz >99999) {
			throw new IllegalArgumentException("PLZ musst between 0 and 99999");
		}
		if(hausnummer == null || hausnummer.isEmpty()) {
			throw new IllegalArgumentException("hausnummer can not be null or Empty!");
		}
		if(strasse == null || strasse.isEmpty()) {
			throw new IllegalArgumentException("Strasse can not be null or Empty!");
		}
		this.ort = ort;
		this.plz = plz;
		this.hausnummer = hausnummer;
		this.strasse = strasse;
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
		Lage other = (Lage) obj;
		if (this.hausnummer == null) {
			if (other.hausnummer != null) {
				return false;
			}
		} else if (!this.hausnummer.equals(other.hausnummer)) {
			return false;
		}
		if (this.ort == null) {
			if (other.ort != null) {
				return false;
			}
		} else if (!this.ort.equals(other.ort)) {
			return false;
		}
		if (this.plz != other.plz) {
			return false;
		}
		if (this.strasse == null) {
			if (other.strasse != null) {
				return false;
			}
		} else if (!this.strasse.equals(other.strasse)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the hausnummer
	 */
	public String getHausnummer() {
		return this.hausnummer;
	}

	/**
	 * @return the ort
	 */
	public String getOrt() {
		return this.ort;
	}

	/**
	 * @return the plz
	 */
	public int getPlz() {
		return this.plz;
	}

	/**
	 * @return the strasse
	 */
	public String getStrasse() {
		return this.strasse;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.hausnummer == null) ? 0 : this.hausnummer.hashCode());
		result = prime * result + ((this.ort == null) ? 0 : this.ort.hashCode());
		result = prime * result + this.plz;
		result = prime * result + ((this.strasse == null) ? 0 : this.strasse.hashCode());
		return result;
	}

}
