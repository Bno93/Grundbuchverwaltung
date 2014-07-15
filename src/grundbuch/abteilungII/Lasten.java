package grundbuch.abteilungII;

/**
 * Conatins a {@link String} with Lasten.
 * @author da5254
 *
 */
public class Lasten {
	private String lasten;

	/**
	 * Create {@link Lasten} with a String
	 * @param lasten Lasten
	 */
	public Lasten(String lasten) {
		if(lasten == null) {
			throw new IllegalArgumentException("Can not be null!");
		}
		this.lasten = lasten;
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
		Lasten other = (Lasten) obj;
		if (this.lasten == null) {
			if (other.lasten != null) {
				return false;
			}
		} else if (!this.lasten.equals(other.lasten)) {
			return false;
		}
		return true;
	}

	/**
	 * Get {@link Lasten} as {@link String}
	 * @return Lasten
	 */
	public String getLasten() {
		return this.lasten;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.lasten == null) ? 0 : this.lasten.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Lasten [lasten=" + this.lasten + "]";
	}
}
