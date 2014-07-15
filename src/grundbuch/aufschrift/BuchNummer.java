package grundbuch.aufschrift;

public class BuchNummer {
	private int buchNummer;

	public BuchNummer(int buchNummer) {
		this.buchNummer = buchNummer;
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
		BuchNummer other = (BuchNummer) obj;
		if (this.buchNummer != other.buchNummer) {
			return false;
		}
		return true;
	}

	/**
	 * @return the buchNummer
	 */
	public int getBuchNummer() {
		return this.buchNummer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.buchNummer;
		return result;
	}

	/**
	 * @param buchNummer the buchNummer to set
	 */
	public void setBuchNummer(int buchNummer) {
		this.buchNummer = buchNummer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BuchNummer [buchNummer=" + this.buchNummer + "]";
	}
}
