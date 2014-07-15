package grundbuch.abteilungI;
/**
 * Contains {@link Eigentuemer}, {@link Eigentumsverhaeltnis} and {@link Erwerbsgrundlage}.
 * @author da5254
 *
 */
public class AbteilungI {
	private Eigentuemer eigentuemer;
	private Eigentumsverhaeltnis eigentumsverhaeltnis;
	private Erwerbsgrundlage erwerbsgrundlage;

	/**
	 * Create a new {@link AbteilungI}
	 * @param eigentuemer The {@link Eigentuemer}
	 * @param eigentumsverhaeltnis The {@link Eigentumsverhaeltnis}
	 * @param erwerbsgrundlage The {@link Erwerbsgrundlage}
	 */
	public AbteilungI(Eigentuemer eigentuemer, Eigentumsverhaeltnis eigentumsverhaeltnis, Erwerbsgrundlage erwerbsgrundlage) {
		this.eigentuemer = eigentuemer;
		this.eigentumsverhaeltnis = eigentumsverhaeltnis;
		this.erwerbsgrundlage = erwerbsgrundlage;
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
		AbteilungI other = (AbteilungI) obj;
		if (this.eigentuemer == null) {
			if (other.eigentuemer != null) {
				return false;
			}
		} else if (!this.eigentuemer.equals(other.eigentuemer)) {
			return false;
		}
		if (this.eigentumsverhaeltnis == null) {
			if (other.eigentumsverhaeltnis != null) {
				return false;
			}
		} else if (!this.eigentumsverhaeltnis.equals(other.eigentumsverhaeltnis)) {
			return false;
		}
		if (this.erwerbsgrundlage == null) {
			if (other.erwerbsgrundlage != null) {
				return false;
			}
		} else if (!this.erwerbsgrundlage.equals(other.erwerbsgrundlage)) {
			return false;
		}
		return true;
	}

	/**
	 * Get {@link Eigentuemer}
	 * @return {@link Eigentuemer}
	 */
	public Eigentuemer getEigentuemer() {
		return this.eigentuemer;
	}

	/**
	 * Get {@link Eigentumsverhaeltnis}
	 * @return {@link Eigentumsverhaeltnis}
	 */
	public Eigentumsverhaeltnis getEigentumsverhaeltnis() {
		return this.eigentumsverhaeltnis;
	}

	/**
	 * Get {@link Erwerbsgrundlage}
	 * @return {@link Erwerbsgrundlage}
	 */
	public Erwerbsgrundlage getErwerbsgrundlage() {
		return this.erwerbsgrundlage;
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
		result = prime
				* result
				+ ((this.eigentumsverhaeltnis == null) ? 0 : this.eigentumsverhaeltnis
						.hashCode());
		result = prime
				* result
				+ ((this.erwerbsgrundlage == null) ? 0 : this.erwerbsgrundlage.hashCode());
		return result;
	}

	/**
	 * Set {@link Eigentuemer}
	 * @param eigentuemer {@link Eigentuemer}
	 */
	public void setEigentuemer(Eigentuemer eigentuemer) {
		this.eigentuemer = eigentuemer;
	}

	/**
	 * Set {@link Eigentumsverhaeltnis}
	 * @param eigentumsverhaeltnis {@link Eigentumsverhaeltnis}
	 */
	public void setEigentumsverhaeltnis(
			Eigentumsverhaeltnis eigentumsverhaeltnis) {
		this.eigentumsverhaeltnis = eigentumsverhaeltnis;
	}

	/**
	 * Set {@link Erwerbsgrundlage}
	 * @param erwerbsgrundlage {@link Erwerbsgrundlage}
	 */
	public void setErwerbsgrundlage(Erwerbsgrundlage erwerbsgrundlage) {
		this.erwerbsgrundlage = erwerbsgrundlage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbteilungI [eigentuemer=" + this.eigentuemer
				+ ", eigentumsverhaeltnis=" + this.eigentumsverhaeltnis
				+ ", erwerbsgrundlage=" + this.erwerbsgrundlage + "]";
	}


}
