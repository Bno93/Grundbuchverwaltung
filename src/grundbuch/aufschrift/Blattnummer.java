package grundbuch.aufschrift;

/**
 * Contains the Number of a Blatt
 * @author da5254
 *
 */
public class Blattnummer {
	private int blattnummer;

	/**
	 * Create a new Blattnummer
	 * @param blattnummer
	 */
	public Blattnummer(int blattnummer) {
		this.blattnummer = blattnummer;
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
		Blattnummer other = (Blattnummer) obj;
		if (this.blattnummer != other.blattnummer) {
			return false;
		}
		return true;
	}

	/**
	 * Get Blattnummer
	 * @return the Number of the Blatt
	 */
	public int getBlattnummer() {
		return this.blattnummer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.blattnummer;
		return result;
	}

	/**
	 * @param blattnummer the blattnummer to set
	 */
	public void setBlattnummer(int blattnummer) {
		this.blattnummer = blattnummer;
	}


}
