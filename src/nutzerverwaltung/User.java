package nutzerverwaltung;

/**
 * Class which contains a User by name and a flag if he is a admin or not.
 * @author da5254
 *
 */
public class User {
	public String name;
	public boolean admin;

	public User(String userName, boolean admin) {
		this.name = userName;
		this.admin = admin;
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
		User other = (User) obj;
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	/**
	 * @return the admin
	 */
	public boolean isAdmin() {
		return this.admin;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + this.name + ", admin=" + this.admin + "]";
	}


}
