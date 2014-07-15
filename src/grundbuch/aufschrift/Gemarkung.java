package grundbuch.aufschrift;

public class Gemarkung {
	private String gemarkung;

	public Gemarkung(String gemarkung) {
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
		Gemarkung other = (Gemarkung) obj;
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
	 * @return the gemarkung
	 */
	public String getGemarkung() {
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
				+ ((this.gemarkung == null) ? 0 : this.gemarkung.hashCode());
		return result;
	}

	/**
	 * @param gemarkung the gemarkung to set
	 */
	public void setGemarkung(String gemarkung) {
		this.gemarkung = gemarkung;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gemarkung [gemarkung=" + this.gemarkung + "]";
	}
}
