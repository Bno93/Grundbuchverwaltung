package grundbuch.bestandsverzeichnis;

/**
 * Contains a {@link Float} with the groesse.
 * @author da5254
 *
 */
public class Groesse {
	private float groesse;

	/**
	 * Create a {@link Groesse} with the given float.
	 * @param groesse groesse
	 */
	public Groesse(float groesse) {
		if(groesse <= 0){
			throw new IllegalArgumentException("Can not be 0 or negative!");
		}
		this.groesse = groesse;
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
		Groesse other = (Groesse) obj;
		if (Float.floatToIntBits(this.groesse) != Float
				.floatToIntBits(other.groesse)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the groesse
	 */
	public float getGroesse() {
		return this.groesse;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(this.groesse);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Groesse [groesse=" + this.groesse + "]";
	}


}
