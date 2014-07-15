package grundbuch.abteilungII;

public class AbteilungII {
	private Lasten lasten;
	private Beschraenkungen beschraenkungen;
	private Wiedersprueche wiedersprueche;

	public AbteilungII(Lasten lasten, Beschraenkungen beschraenkungen, Wiedersprueche wiedersprueche) {
		this.lasten = lasten;
		this.beschraenkungen = beschraenkungen;
		this.wiedersprueche = wiedersprueche;
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
		AbteilungII other = (AbteilungII) obj;
		if (this.beschraenkungen == null) {
			if (other.beschraenkungen != null) {
				return false;
			}
		} else if (!this.beschraenkungen.equals(other.beschraenkungen)) {
			return false;
		}
		if (this.lasten == null) {
			if (other.lasten != null) {
				return false;
			}
		} else if (!this.lasten.equals(other.lasten)) {
			return false;
		}
		if (this.wiedersprueche == null) {
			if (other.wiedersprueche != null) {
				return false;
			}
		} else if (!this.wiedersprueche.equals(other.wiedersprueche)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the beschraenkungen
	 */
	public Beschraenkungen getBeschraenkungen() {
		return this.beschraenkungen;
	}

	/**
	 * @return the lasten
	 */
	public Lasten getLasten() {
		return this.lasten;
	}

	/**
	 * @return the wiedersprueche
	 */
	public Wiedersprueche getWiedersprueche() {
		return this.wiedersprueche;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.beschraenkungen == null) ? 0 : this.beschraenkungen.hashCode());
		result = prime * result + ((this.lasten == null) ? 0 : this.lasten.hashCode());
		result = prime * result
				+ ((this.wiedersprueche == null) ? 0 : this.wiedersprueche.hashCode());
		return result;
	}

	/**
	 * @param beschraenkungen the beschraenkungen to set
	 */
	public void setBeschraenkungen(Beschraenkungen beschraenkungen) {
		this.beschraenkungen = beschraenkungen;
	}

	/**
	 * @param lasten the lasten to set
	 */
	public void setLasten(Lasten lasten) {
		this.lasten = lasten;
	}

	/**
	 * @param wiedersprueche the wiedersprueche to set
	 */
	public void setWiedersprueche(Wiedersprueche wiedersprueche) {
		this.wiedersprueche = wiedersprueche;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbteilungII [lasten=" + this.lasten + ", beschraenkungen="
				+ this.beschraenkungen + ", wiedersprueche=" + this.wiedersprueche + "]";
	}


}
