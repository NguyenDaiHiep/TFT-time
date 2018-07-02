package Bai3;

import java.util.ArrayList;

public abstract class Human{
	private String firstName;
	private String Lastname;

	public Human(String firstName, String lastname) {
		this.firstName = firstName;
		Lastname = lastname;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastname() {
		return Lastname;
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", Lastname=" + Lastname + "]";
	}
	
	

}
