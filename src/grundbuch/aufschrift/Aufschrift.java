package grundbuch.aufschrift;

public class Aufschrift {
	private Amtsgericht amtsgericht;
	private BuchNummer buchNummer;
	private Gemarkung gemarkung;
	private Blattnummer blattnummer;

	public Aufschrift(Amtsgericht amtsgericht, BuchNummer buchNummer, Blattnummer blattnummer, Gemarkung gemarkung) {
		this.amtsgericht = amtsgericht;
		this.buchNummer = buchNummer;
		this.blattnummer = blattnummer;
		this.gemarkung = gemarkung;
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
		Aufschrift other = (Aufschrift) obj;
		if (this.amtsgericht == null) {
			if (other.amtsgericht != null) {
				return false;
			}
		} else if (!this.amtsgericht.equals(other.amtsgericht)) {
			return false;
		}
		if (this.blattnummer == null) {
			if (other.blattnummer != null) {
				return false;
			}
		} else if (!this.blattnummer.equals(other.blattnummer)) {
			return false;
		}
		if (this.buchNummer == null) {
			if (other.buchNummer != null) {
				return false;
			}
		} else if (!this.buchNummer.equals(other.buchNummer)) {
			return false;
		}
		if (this.gemarkung == null) {
			if (other.gemarkung != null) {
				return false;
			}
		} else if (!this.gemarkung.equals(other.gemarkung)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the amtsgericht
	 */
	public Amtsgericht getAmtsgericht() {
		return this.amtsgericht;
	}

	/**
	 * @return the blattnummer
	 */
	public Blattnummer getBlattnummer() {
		return this.blattnummer;
	}

	/**
	 * @return the buchNummer
	 */
	public BuchNummer getBuchNummer() {
		return this.buchNummer;
	}

	/**
	 * @return the gemarkung
	 */
	public Gemarkung getGemarkung() {
		return this.gemarkung;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.amtsgericht == null) ? 0 : this.amtsgericht.hashCode());
		result = prime * result
				+ ((this.blattnummer == null) ? 0 : this.blattnummer.hashCode());
		result = prime * result
				+ ((this.buchNummer == null) ? 0 : this.buchNummer.hashCode());
		result = prime * result
				+ ((this.gemarkung == null) ? 0 : this.gemarkung.hashCode());
		return result;
	}

	/**
	 * @param amtsgericht the amtsgericht to set
	 */
	public void setAmtsgericht(Amtsgericht amtsgericht) {
		this.amtsgericht = amtsgericht;
	}

	/**
	 * @param blattnummer the blattnummer to set
	 */
	public void setBlattnummer(Blattnummer blattnummer) {
		this.blattnummer = blattnummer;
	}

	/**
	 * @param buchNummer the buchNummer to set
	 */
	public void setBuchNummer(BuchNummer buchNummer) {
		this.buchNummer = buchNummer;
	}

	/**
	 * @param gemarkung the gemarkung to set
	 */
	public void setGemarkung(Gemarkung gemarkung) {
		this.gemarkung = gemarkung;
	}


}
