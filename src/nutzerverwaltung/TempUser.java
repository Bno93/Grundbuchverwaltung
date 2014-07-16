package nutzerverwaltung;

import java.util.Date;

public class TempUser extends User{

	private Date ablaufdatum;

	public TempUser(String userName, boolean admin, Date ablaufdatum) {
		super(userName, admin);
		this.ablaufdatum = ablaufdatum;
	}

	/**
	 * @return the ablaufdatum
	 */
	public Date getAblaufdatum() {
		return this.ablaufdatum;
	}

	/**
	 * @param ablaufdatum the ablaufdatum to set
	 */
	public void setAblaufdatum(Date ablaufdatum) {
		this.ablaufdatum = ablaufdatum;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TempUser [ablaufdatum=" + this.ablaufdatum + ", name=" + this.name
				+ ", admin=" + this.admin + "]";
	}



}
