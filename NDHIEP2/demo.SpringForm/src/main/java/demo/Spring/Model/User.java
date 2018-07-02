package demo.Spring.Model;

import java.util.Date;

public class User {
	private String username;
    private String password;
    private String email;
    private Date birthDate;
    private String profession;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public String getProfession() {
		return profession;
	}
    

}
