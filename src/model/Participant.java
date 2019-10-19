package model;



public class Participant {
	
	private String id;
	private String name;
	private String lastname;
	private String email;
	private String gender;
	private String country;
	private String birthday;
	
	public Participant(String id, String name, String lastname, String email, String gender, String country,
			String  birthday) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.country = country;
		this.birthday = birthday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String  getBirthday() {
		return birthday;
	}

	public void setBirthday(String  birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Participant [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
