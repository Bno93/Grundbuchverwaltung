package grundbuch.abteilungIII;

/**
 * Contains a {@link Grundpfandrecht}
 * @author da5254
 *
 */
public class AbteilungIII {
	private Grundpfandrecht grundpfandrecht;

	/**
	 * Creats a {@link AbteilungIII}
	 * @param grundpfandrecht {@link Grundpfandrecht}
	 */
	public AbteilungIII(Grundpfandrecht grundpfandrecht) {
		this.grundpfandrecht = grundpfandrecht;
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
		AbteilungIII other = (AbteilungIII) obj;
		if (this.grundpfandrecht == null) {
			if (other.grundpfandrecht != null) {
				return false;
			}
		} else if (!this.grundpfandrecht.equals(other.grundpfandrecht)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the grundpfandrecht
	 */
	public Grundpfandrecht getGrundpfandrecht() {
		return this.grundpfandrecht;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.grundpfandrecht == null) ? 0 : this.grundpfandrecht.hashCode());
		return result;
	}

	/**
	 * @param grundpfandrecht the grundpfandrecht to set
	 */
	public void setGrundpfandrecht(Grundpfandrecht grundpfandrecht) {
		this.grundpfandrecht = grundpfandrecht;
	}


}
