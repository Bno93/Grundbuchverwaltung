package grundbuch.bestandsverzeichnis;

/**
 * Contains a {@link String} with the zustehendeRechte.
 * @author da5254
 *
 */
public class ZustehendeRechte {
	private String zustehendeRechte;

	/**
	 * Create a {@link ZustehendeRechte} with the given {@link String}
	 * @param zustehendeRechte
	 */
	public ZustehendeRechte(String zustehendeRechte) {
		if(zustehendeRechte== null) {
			throw new IllegalArgumentException("zustehendeRechte can not be null!");
		}
		this.zustehendeRechte=zustehendeRechte;
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
		ZustehendeRechte other = (ZustehendeRechte) obj;
		if (this.zustehendeRechte == null) {
			if (other.zustehendeRechte != null) {
				return false;
			}
		} else if (!this.zustehendeRechte.equals(other.zustehendeRechte)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the zustehendeRechte
	 */
	public String getZustehendeRechte() {
		return this.zustehendeRechte;
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
				+ ((this.zustehendeRechte == null) ? 0 : this.zustehendeRechte.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ZustehendeRechte [zustehendeRechte=" + this.zustehendeRechte + "]";
	}


}
