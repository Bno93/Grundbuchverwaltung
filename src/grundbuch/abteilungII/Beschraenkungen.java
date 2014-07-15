package grundbuch.abteilungII;

/**
 * Contains a {@link String} with Beschraenkungen.
 * @author da5254
 *
 */
public class Beschraenkungen {
	private String beschraenkungen;

	/**
	 * Create {@link Beschraenkungen} with a {@link String}.
	 * @param beschraenkungen Beschraenkungen
	 */
	public Beschraenkungen(String beschraenkungen) {
		if(beschraenkungen == null) {
			throw new IllegalArgumentException("Can not be null!");
		}
		this.beschraenkungen = beschraenkungen;
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
		Beschraenkungen other = (Beschraenkungen) obj;
		if (this.beschraenkungen == null) {
			if (other.beschraenkungen != null) {
				return false;
			}
		} else if (!this.beschraenkungen.equals(other.beschraenkungen)) {
			return false;
		}
		return true;
	}

	/**
	 * Get {@link Beschraenkungen}
	 * @return Beschraenkungen
	 */
	public String getBeschraenkungen() {
		return this.beschraenkungen;
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
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Beschraenkungen [beschraenkungen=" + this.beschraenkungen + "]";
	}
}
