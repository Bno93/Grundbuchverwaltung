package grundbuch.abteilungI;

/**
 * Contains a {@link String} with the Eigentumsverhaeltnis
 * @author da5254
 *
 */
public class Eigentumsverhaeltnis {
	private String eigentumverhaeltnis;

	/**
	 * Create a new Eigentumsverhaeltnis
	 * @param eigentumverhaeltnis Name of the Eigentumsverhaeltnis
	 */
	public Eigentumsverhaeltnis(String eigentmsverhaeltnis) {
		if (eigentmsverhaeltnis == null|| eigentmsverhaeltnis.isEmpty()) {
			throw new IllegalArgumentException("Eigentumsverhaeltnis ca not be");
		}
		this.eigentumverhaeltnis = eigentmsverhaeltnis;
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
		Eigentumsverhaeltnis other = (Eigentumsverhaeltnis) obj;
		if (this.eigentumverhaeltnis == null) {
			if (other.eigentumverhaeltnis != null) {
				return false;
			}
		} else if (!this.eigentumverhaeltnis.equals(other.eigentumverhaeltnis)) {
			return false;
		}
		return true;
	}

	/**
	 * Get Eigentumsverhaeltnis
	 * @return eigentumsverhaeltnis
	 */
	public String getEigentumsverhaeltnis() {
		return this.eigentumverhaeltnis;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((this.eigentumverhaeltnis == null) ? 0 : this.eigentumverhaeltnis
						.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Eigentumsverhaeltnis [eigentumverhaeltnis="
				+ this.eigentumverhaeltnis + "]";
	}
}
