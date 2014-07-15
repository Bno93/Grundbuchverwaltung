package grundbuch.abteilungI;

/**
 * Contains a {@link String} with the {@link Eigentuemer}
 * @author da5254
 *
 */
public class Eigentuemer {
	private String eigentuemer;

	/**
	 * Create a neu Eigentuemer
	 * @param eigentuemer Name of the Eigentümer
	 */
	public Eigentuemer(String eigentuemer) {
		if(eigentuemer == null || eigentuemer.isEmpty()) {
			throw new IllegalArgumentException("String can not be null!");
		}
		this.eigentuemer = eigentuemer;
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
		Eigentuemer other = (Eigentuemer) obj;
		if (this.eigentuemer == null) {
			if (other.eigentuemer != null) {
				return false;
			}
		} else if (!this.eigentuemer.equals(other.eigentuemer)) {
			return false;
		}
		return true;
	}

	/**
	 * Get Eigentuemer
	 * @return eigentuemer
	 */
	public String getEigentuemer() {
		return this.eigentuemer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.eigentuemer == null) ? 0 : this.eigentuemer.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Eigentuemer [eigentuemer=" + this.eigentuemer + "]";
	}
}
