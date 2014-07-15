package grundbuch.aufschrift;

public class Amtsgericht {
	private String amtsgericht;

	public Amtsgericht(String amtsgericht) {
		this.amtsgericht = amtsgericht;
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
		Amtsgericht other = (Amtsgericht) obj;
		if (this.amtsgericht == null) {
			if (other.amtsgericht != null) {
				return false;
			}
		} else if (!this.amtsgericht.equals(other.amtsgericht)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the amtsgericht
	 */
	public String getAmtsgericht() {
		return this.amtsgericht;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.amtsgericht == null) ? 0 : this.amtsgericht.hashCode());
		return result;
	}

	/**
	 * @param amtsgericht the amtsgericht to set
	 */
	public void setAmtsgericht(String amtsgericht) {
		this.amtsgericht = amtsgericht;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Amtsgericht [amtsgericht=" + this.amtsgericht + "]";
	}


}
