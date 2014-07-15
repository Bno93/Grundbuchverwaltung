package grundbuch.abteilungI;

/**
 * Contains a {@link String} with the Erwerbsgrundlage
 * @author da5254
 *
 */
public class Erwerbsgrundlage {
	private String erwerbsgrundlage;

	/**
	 * Create a new Erwerbsgrundlage
	 * @param erwerbsgrundlage Name of the Erwerbsgrundlage
	 */
	public Erwerbsgrundlage(String erwerbsgrundlage) {
		if(erwerbsgrundlage== null|| erwerbsgrundlage.isEmpty()) {
			throw new IllegalArgumentException("Can not be null!");
		}
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
		Erwerbsgrundlage other = (Erwerbsgrundlage) obj;
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
	 * Get Erwerbsgrundlage
	 * @return Erwerbsgrundlage
	 */
	public String getErwerbsgrundlage() {
		return this.erwerbsgrundlage;
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
				+ ((this.erwerbsgrundlage == null) ? 0 : this.erwerbsgrundlage.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Erwerbsgrundlage [erwerbsgrundlage=" + this.erwerbsgrundlage + "]";
	}
}
