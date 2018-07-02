package Bai3;

import java.util.ArrayList;

public class Students extends Human implements Comparable<Students>{
	private int numberClass;

	public Students(String firstName, String lastname, int numberClass) {
		super(firstName, lastname);
		this.numberClass = numberClass;
	}

	public int getNumberClass() {
		return numberClass;
	}
	

	
public int compareTo(Students student){
	if(numberClass == student.numberClass)
		return 0;
	else if(numberClass>student.numberClass)
		return 1;
	else return -1;
		
	}

@Override
public String toString() {
	return "Student: " + getFirstName() + " " + getLastname() + " " + numberClass +"\n";
}

	

}
