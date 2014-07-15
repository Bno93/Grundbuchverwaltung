package grundbuch.abteilungII;

/**
 * Contains Wiedersprueche as {@link String}
 * @author da5254
 *
 */
public class Wiedersprueche {
	private String wiederstrueche;

	/**
	 * Create {@link Wiedersprueche}
	 * @param wiedersprueche Wiedersprueche
	 */
	public Wiedersprueche(String wiedersprueche) {
		this.wiederstrueche = wiedersprueche;
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
		Wiedersprueche other = (Wiedersprueche) obj;
		if (this.wiederstrueche == null) {
			if (other.wiederstrueche != null) {
				return false;
			}
		} else if (!this.wiederstrueche.equals(other.wiederstrueche)) {
			return false;
		}
		return true;
	}

	/**
	 * Get {@link Wiedersprueche} as {@link String}
	 * @return wiedersprueche
	 */
	public String getWiederstrueche() {
		return this.wiederstrueche;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.wiederstrueche == null) ? 0 : this.wiederstrueche.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Wiedersprueche [wiederstrueche=" + this.wiederstrueche + "]";
	}
}
