package ndhiep.demoIOC.entities;

import java.util.ArrayList;

public class Student extends People{
	private Country country;
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	public Student(String name, int age, Country country, ArrayList<Subject> subjects) {
		super(name, age);
		this.country = country;
		this.subjects = subjects;
	}
	
	public Student() {
	}

	public Country getCountry() {
		return country;
	}
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
	public void print() {
		System.out.println("Student " + getName() + "tuoi= " + getAge() + "\t" + country + subjects);
	}
	
	
	
	
	

}
