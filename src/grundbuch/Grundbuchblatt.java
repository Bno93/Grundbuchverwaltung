package grundbuch;

import grundbuch.abteilungI.AbteilungI;
import grundbuch.abteilungI.Eigentuemer;
import grundbuch.abteilungI.Eigentumsverhaeltnis;
import grundbuch.abteilungI.Erwerbsgrundlage;
import grundbuch.abteilungII.AbteilungII;
import grundbuch.abteilungII.Beschraenkungen;
import grundbuch.abteilungII.Lasten;
import grundbuch.abteilungII.Wiedersprueche;
import grundbuch.abteilungIII.AbteilungIII;
import grundbuch.abteilungIII.Grundpfandrecht;
import grundbuch.aufschrift.Amtsgericht;
import grundbuch.aufschrift.Aufschrift;
import grundbuch.aufschrift.Blattnummer;
import grundbuch.aufschrift.BuchNummer;
import grundbuch.aufschrift.Gemarkung;
import grundbuch.bestandsverzeichnis.Bestandsverzeichnis;
import grundbuch.bestandsverzeichnis.Groesse;
import grundbuch.bestandsverzeichnis.Lage;
import grundbuch.bestandsverzeichnis.Wirtschaft;
import grundbuch.bestandsverzeichnis.ZustehendeRechte;


public class Grundbuchblatt {
	private Blattnummer blattnummer;
	private AbteilungI abteilungI;
	private AbteilungII abteilungII;

	private AbteilungIII abteilungIII;
	private Aufschrift aufschrift;
	private Bestandsverzeichnis bestandsverzeichnis;
	//TODO: Mach Grundbuchblatt fertig
	public Grundbuchblatt(Blattnummer blattnummer, AbteilungI abteilungI, AbteilungII abteilungII, AbteilungIII abteilungIII, Aufschrift aufschrift, Bestandsverzeichnis bestandsverzeichnis) {
		this.blattnummer = blattnummer;
		this.abteilungI = abteilungI;
		this.abteilungII = abteilungII;
		this.abteilungIII = abteilungIII;
		this.aufschrift = aufschrift;
		this.bestandsverzeichnis = bestandsverzeichnis;

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
		Grundbuchblatt other = (Grundbuchblatt) obj;
		if (this.abteilungII == null) {
			if (other.abteilungII != null) {
				return false;
			}
		} else if (!this.abteilungII.equals(other.abteilungII)) {
			return false;
		}
		if (this.abteilungI == null) {
			if (other.abteilungI != null) {
				return false;
			}
		} else if (!this.abteilungI.equals(other.abteilungI)) {
			return false;
		}
		if (this.abteilungIII == null) {
			if (other.abteilungIII != null) {
				return false;
			}
		} else if (!this.abteilungIII.equals(other.abteilungIII)) {
			return false;
		}
		if (this.aufschrift == null) {
			if (other.aufschrift != null) {
				return false;
			}
		} else if (!this.aufschrift.equals(other.aufschrift)) {
			return false;
		}
		if (this.bestandsverzeichnis == null) {
			if (other.bestandsverzeichnis != null) {
				return false;
			}
		} else if (!this.bestandsverzeichnis.equals(other.bestandsverzeichnis)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the abetilungII
	 */
	public AbteilungII getAbetilungII() {
		return this.abteilungII;
	}

	/**
	 * @return the abteilungI
	 */
	public AbteilungI getAbteilungI() {
		return this.abteilungI;
	}

	/**
	 * @return the abteilungIII
	 */
	public AbteilungIII getAbteilungIII() {
		return this.abteilungIII;
	}

	/**
	 * @return
	 * @see grundbuch.aufschrift.Aufschrift#getAmtsgericht()
	 */
	public Amtsgericht getAmtsgericht() {
		return this.aufschrift.getAmtsgericht();
	}

	/**
	 * @return the aufschrift
	 */
	public Aufschrift getAufschrift() {
		return this.aufschrift;
	}

	/**
	 * @return
	 * @see grundbuch.abteilungII.AbteilungII#getBeschraenkungen()
	 */
	public Beschraenkungen getBeschraenkungen() {
		return this.abteilungII.getBeschraenkungen();
	}

	/**
	 * @return the bestandsverzeichnis
	 */
	public Bestandsverzeichnis getBestandsverzeichnis() {
		return this.bestandsverzeichnis;
	}

	/**
	 * @return
	 * @see grundbuch.aufschrift.Aufschrift#getBlattnummer()
	 */
	public Blattnummer getBlattnummer() {
		return this.aufschrift.getBlattnummer();
	}

	/**
	 * @return
	 * @see grundbuch.aufschrift.Aufschrift#getBuchNummer()
	 */
	public BuchNummer getBuchNummer() {
		return this.aufschrift.getBuchNummer();
	}

	/**
	 * @return
	 * @see grundbuch.abteilungI.AbteilungI#getEigentuemer()
	 */
	public Eigentuemer getEigentuemer() {
		return this.abteilungI.getEigentuemer();
	}

	/**
	 * @return
	 * @see grundbuch.abteilungI.AbteilungI#getEigentumsverhaeltnis()
	 */
	public Eigentumsverhaeltnis getEigentumsverhaeltnis() {
		return this.abteilungI.getEigentumsverhaeltnis();
	}

	/**
	 * @return
	 * @see grundbuch.abteilungI.AbteilungI#getErwerbsgrundlage()
	 */
	public Erwerbsgrundlage getErwerbsgrundlage() {
		return this.abteilungI.getErwerbsgrundlage();
	}

	/**
	 * @return
	 * @see grundbuch.aufschrift.Aufschrift#getGemarkung()
	 */
	public Gemarkung getGemarkung() {
		return this.aufschrift.getGemarkung();
	}

	/**
	 * @return
	 * @see grundbuch.bestandsverzeichnis.Bestandsverzeichnis#getGroesse()
	 */
	public Groesse getGroesse() {
		return this.bestandsverzeichnis.getGroesse();
	}

	/**
	 * @return
	 * @see grundbuch.abteilungIII.AbteilungIII#getGrundpfandrecht()
	 */
	public Grundpfandrecht getGrundpfandrecht() {
		return this.abteilungIII.getGrundpfandrecht();
	}

	/**
	 * @return
	 * @see grundbuch.bestandsverzeichnis.Bestandsverzeichnis#getLage()
	 */
	public Lage getLage() {
		return this.bestandsverzeichnis.getLage();
	}

	/**
	 * @return
	 * @see grundbuch.abteilungII.AbteilungII#getLasten()
	 */
	public Lasten getLasten() {
		return this.abteilungII.getLasten();
	}

	/**
	 * @return
	 * @see grundbuch.abteilungII.AbteilungII#getWiedersprueche()
	 */
	public Wiedersprueche getWiedersprueche() {
		return this.abteilungII.getWiedersprueche();
	}

	/**
	 * @return
	 * @see grundbuch.bestandsverzeichnis.Bestandsverzeichnis#getWirtschaft()
	 */
	public Wirtschaft getWirtschaft() {
		return this.bestandsverzeichnis.getWirtschaft();
	}

	/**
	 * @return
	 * @see grundbuch.bestandsverzeichnis.Bestandsverzeichnis#getZustehendeRechte()
	 */
	public ZustehendeRechte getZustehendeRechte() {
		return this.bestandsverzeichnis.getZustehendeRechte();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.abteilungII == null) ? 0 : this.abteilungII.hashCode());
		result = prime * result
				+ ((this.abteilungI == null) ? 0 : this.abteilungI.hashCode());
		result = prime * result
				+ ((this.abteilungIII == null) ? 0 : this.abteilungIII.hashCode());
		result = prime * result
				+ ((this.aufschrift == null) ? 0 : this.aufschrift.hashCode());
		result = prime
				* result
				+ ((this.bestandsverzeichnis == null) ? 0 : this.bestandsverzeichnis
						.hashCode());
		return result;
	}

	/**
	 * @param abetilungII the abetilungII to set
	 */
	public void setAbetilungII(AbteilungII abetilungII) {
		this.abteilungII = abetilungII;
	}

	/**
	 * @param abteilungI the abteilungI to set
	 */
	public void setAbteilungI(AbteilungI abteilungI) {
		this.abteilungI = abteilungI;
	}

	/**
	 * @param abteilungIII the abteilungIII to set
	 */
	public void setAbteilungIII(AbteilungIII abteilungIII) {
		this.abteilungIII = abteilungIII;
	}

	/**
	 * @param amtsgericht
	 * @see grundbuch.aufschrift.Aufschrift#setAmtsgericht(grundbuch.aufschrift.Amtsgericht)
	 */
	public void setAmtsgericht(Amtsgericht amtsgericht) {
		this.aufschrift.setAmtsgericht(amtsgericht);
	}

	/**
	 * @param aufschrift the aufschrift to set
	 */
	public void setAufschrift(Aufschrift aufschrift) {
		this.aufschrift = aufschrift;
	}

	/**
	 * @param beschraenkungen
	 * @see grundbuch.abteilungII.AbteilungII#setBeschraenkungen(grundbuch.abteilungII.Beschraenkungen)
	 */
	public void setBeschraenkungen(Beschraenkungen beschraenkungen) {
		this.abteilungII.setBeschraenkungen(beschraenkungen);
	}

	/**
	 * @param bestandsverzeichnis the bestandsverzeichnis to set
	 */
	public void setBestandsverzeichnis(Bestandsverzeichnis bestandsverzeichnis) {
		this.bestandsverzeichnis = bestandsverzeichnis;
	}

	/**
	 * @param blattnummer
	 * @see grundbuch.aufschrift.Aufschrift#setBlattnummer(grundbuch.aufschrift.Blattnummer)
	 */
	public void setBlattnummer(Blattnummer blattnummer) {
		this.aufschrift.setBlattnummer(blattnummer);
	}

	/**
	 * @param buchNummer
	 * @see grundbuch.aufschrift.Aufschrift#setBuchNummer(grundbuch.aufschrift.BuchNummer)
	 */
	public void setBuchNummer(BuchNummer buchNummer) {
		this.aufschrift.setBuchNummer(buchNummer);
	}

	/**
	 * @param eigentuemer
	 * @see grundbuch.abteilungI.AbteilungI#setEigentuemer(grundbuch.abteilungI.Eigentuemer)
	 */
	public void setEigentuemer(Eigentuemer eigentuemer) {
		this.abteilungI.setEigentuemer(eigentuemer);
	}

	/**
	 * @param eigentumsverhaeltnis
	 * @see grundbuch.abteilungI.AbteilungI#setEigentumsverhaeltnis(grundbuch.abteilungI.Eigentumsverhaeltnis)
	 */
	public void setEigentumsverhaeltnis(
			Eigentumsverhaeltnis eigentumsverhaeltnis) {
		this.abteilungI.setEigentumsverhaeltnis(eigentumsverhaeltnis);
	}

	/**
	 * @param erwerbsgrundlage
	 * @see grundbuch.abteilungI.AbteilungI#setErwerbsgrundlage(grundbuch.abteilungI.Erwerbsgrundlage)
	 */
	public void setErwerbsgrundlage(Erwerbsgrundlage erwerbsgrundlage) {
		this.abteilungI.setErwerbsgrundlage(erwerbsgrundlage);
	}

	/**
	 * @param gemarkung
	 * @see grundbuch.aufschrift.Aufschrift#setGemarkung(grundbuch.aufschrift.Gemarkung)
	 */
	public void setGemarkung(Gemarkung gemarkung) {
		this.aufschrift.setGemarkung(gemarkung);
	}

	/**
	 * @param groesse
	 * @see grundbuch.bestandsverzeichnis.Bestandsverzeichnis#setGroesse(grundbuch.bestandsverzeichnis.Groesse)
	 */
	public void setGroesse(Groesse groesse) {
		this.bestandsverzeichnis.setGroesse(groesse);
	}

	/**
	 * @param grundpfandrecht
	 * @see grundbuch.abteilungIII.AbteilungIII#setGrundpfandrecht(grundbuch.abteilungIII.Grundpfandrecht)
	 */
	public void setGrundpfandrecht(Grundpfandrecht grundpfandrecht) {
		this.abteilungIII.setGrundpfandrecht(grundpfandrecht);
	}

	/**
	 * @param lage
	 * @see grundbuch.bestandsverzeichnis.Bestandsverzeichnis#setLage(grundbuch.bestandsverzeichnis.Lage)
	 */
	public void setLage(Lage lage) {
		this.bestandsverzeichnis.setLage(lage);
	}

	/**
	 * @param lasten
	 * @see grundbuch.abteilungII.AbteilungII#setLasten(grundbuch.abteilungII.Lasten)
	 */
	public void setLasten(Lasten lasten) {
		this.abteilungII.setLasten(lasten);
	}

	/**
	 * @param wiedersprueche
	 * @see grundbuch.abteilungII.AbteilungII#setWiedersprueche(grundbuch.abteilungII.Wiedersprueche)
	 */
	public void setWiedersprueche(Wiedersprueche wiedersprueche) {
		this.abteilungII.setWiedersprueche(wiedersprueche);
	}

	/**
	 * @param wirtschaft
	 * @see grundbuch.bestandsverzeichnis.Bestandsverzeichnis#setWirtschaft(grundbuch.bestandsverzeichnis.Wirtschaft)
	 */
	public void setWirtschaft(Wirtschaft wirtschaft) {
		this.bestandsverzeichnis.setWirtschaft(wirtschaft);
	}

	/**
	 * @param zustehendeRechte
	 * @see grundbuch.bestandsverzeichnis.Bestandsverzeichnis#setZustehendeRechte(grundbuch.bestandsverzeichnis.ZustehendeRechte)
	 */
	public void setZustehendeRechte(ZustehendeRechte zustehendeRechte) {
		this.bestandsverzeichnis.setZustehendeRechte(zustehendeRechte);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Grundbuchblatt [blattnummer=" + this.blattnummer + ", abteilungI="
				+ this.abteilungI + ", abteilungII=" + this.abteilungII
				+ ", abteilungIII=" + this.abteilungIII + ", aufschrift="
				+ this.aufschrift + ", bestandsverzeichnis=" + this.bestandsverzeichnis
				+ "]";
	}



}
