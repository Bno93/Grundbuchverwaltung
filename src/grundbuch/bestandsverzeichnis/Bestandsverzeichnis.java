package grundbuch.bestandsverzeichnis;

public class Bestandsverzeichnis {
	private Groesse groesse;
	private Lage lage;
	private Wirtschaft wirtschaft;
	private ZustehendeRechte zustehendeRechte;

	public Bestandsverzeichnis(Groesse groesse, Lage lage, Wirtschaft wirtschaft, ZustehendeRechte zustehendeRechte) {
		this.groesse = groesse;
		this.lage = lage;
		this.wirtschaft = wirtschaft;
		this.zustehendeRechte = zustehendeRechte;
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
		Bestandsverzeichnis other = (Bestandsverzeichnis) obj;
		if (this.groesse == null) {
			if (other.groesse != null) {
				return false;
			}
		} else if (!this.groesse.equals(other.groesse)) {
			return false;
		}
		if (this.lage == null) {
			if (other.lage != null) {
				return false;
			}
		} else if (!this.lage.equals(other.lage)) {
			return false;
		}
		if (this.wirtschaft == null) {
			if (other.wirtschaft != null) {
				return false;
			}
		} else if (!this.wirtschaft.equals(other.wirtschaft)) {
			return false;
		}
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
	 * @return the groesse
	 */
	public Groesse getGroesse() {
		return this.groesse;
	}

	/**
	 * @return the lage
	 */
	public Lage getLage() {
		return this.lage;
	}

	/**
	 * @return the wirtschaft
	 */
	public Wirtschaft getWirtschaft() {
		return this.wirtschaft;
	}

	/**
	 * @return the zustehendeRechte
	 */
	public ZustehendeRechte getZustehendeRechte() {
		return this.zustehendeRechte;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.groesse == null) ? 0 : this.groesse.hashCode());
		result = prime * result + ((this.lage == null) ? 0 : this.lage.hashCode());
		result = prime * result
				+ ((this.wirtschaft == null) ? 0 : this.wirtschaft.hashCode());
		result = prime
				* result
				+ ((this.zustehendeRechte == null) ? 0 : this.zustehendeRechte.hashCode());
		return result;
	}

	/**
	 * @param groesse the groesse to set
	 */
	public void setGroesse(Groesse groesse) {
		this.groesse = groesse;
	}

	/**
	 * @param lage the lage to set
	 */
	public void setLage(Lage lage) {
		this.lage = lage;
	}

	/**
	 * @param wirtschaft the wirtschaft to set
	 */
	public void setWirtschaft(Wirtschaft wirtschaft) {
		this.wirtschaft = wirtschaft;
	}

	/**
	 * @param zustehendeRechte the zustehendeRechte to set
	 */
	public void setZustehendeRechte(ZustehendeRechte zustehendeRechte) {
		this.zustehendeRechte = zustehendeRechte;
	}


}
