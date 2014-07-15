package grundbuch.abteilungIII;

/**
 * Contains a Grundpfandrecht as {@link String}
 * @author da5254
 *
 */
public class Grundpfandrecht {
	private String grundpfandrechte;

	/**
	 * Create a {@link Grundpfandrecht}
	 * @param grundpfandrechte
	 */
	public Grundpfandrecht(String grundpfandrechte) {
		if( grundpfandrechte == null) {
			throw new IllegalArgumentException("Can not be null!");
		}
		this.grundpfandrechte = grundpfandrechte;
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
		Grundpfandrecht other = (Grundpfandrecht) obj;
		if (this.grundpfandrechte == null) {
			if (other.grundpfandrechte != null) {
				return false;
			}
		} else if (!this.grundpfandrechte.equals(other.grundpfandrechte)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the grundpfandrechte
	 */
	public String getGrundpfandrechte() {
		return this.grundpfandrechte;
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
				+ ((this.grundpfandrechte == null) ? 0 : this.grundpfandrechte.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Grundpfandrecht [grundpfandrechte=" + this.grundpfandrechte + "]";
	}


}
