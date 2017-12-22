package model;

public class User {

	public int id;
	public String username, email, contacto;
	public int password;
	public int ranksystem, gender;
	public boolean systemstat;
	
	public User(int id, String username, int password, String email, String contacto, int ranksystem, int gender,
			boolean systemstat) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contacto = contacto;
		this.ranksystem = ranksystem;
		this.gender = gender;
		this.systemstat = systemstat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public int getRanksystem() {
		return ranksystem;
	}

	public void setRanksystem(int ranksystem) {
		this.ranksystem = ranksystem;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public boolean isSystemstat() {
		return systemstat;
	}

	public void setSystemstat(boolean systemstat) {
		this.systemstat = systemstat;
	}	
}
