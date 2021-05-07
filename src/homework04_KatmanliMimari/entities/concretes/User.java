package homework04_KatmanliMimari.entities.concretes;

import homework04_KatmanliMimari.entities.abstracts.Entity;

public class User implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	boolean verified;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String password,String email, boolean verified) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email=email;
		this.verified=verified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
