package grundbuch.bestandsverzeichnis;


/**
 * Contains a {@link String} with the Wirtschaftsart.
 * @author da5254
 *
 */
public class Wirtschaft {
	private String wirtschaftsart;

	/**
	 * Create a new {@link Wirtschaft}.
	 * @param wirtschaftsart
	 */
	public Wirtschaft(String wirtschaftsart) {
		if(wirtschaftsart == null||wirtschaftsart.isEmpty()) {
			throw new IllegalArgumentException("Wirtschaftsart can not be null or empty!");
		}
		this.wirtschaftsart = wirtschaftsart;
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
		Wirtschaft other = (Wirtschaft) obj;
		if (this.wirtschaftsart == null) {
			if (other.wirtschaftsart != null) {
				return false;
			}
		} else if (!this.wirtschaftsart.equals(other.wirtschaftsart)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the wirtschaftsart
	 */
	public String getWirtschaftsart() {
		return this.wirtschaftsart;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.wirtschaftsart == null) ? 0 : this.wirtschaftsart.hashCode());
		return result;
	}


}
