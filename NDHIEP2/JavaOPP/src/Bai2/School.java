package Bai2;

import java.util.ArrayList;

public class School {
	private String schoolName;
	ArrayList<Class> listClass = new ArrayList<>();

	public School(String schoolName, ArrayList<Class> listClass) {
		this.schoolName = schoolName;
		this.listClass = listClass;
	}
	public int sumClass(){
		int sum = 0;
		for (int i = 0; i < listClass.size(); i++) {
			sum++;
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Trường: " + schoolName + "Có " + sumClass() + "lớp";
	}
	public ArrayList<Class> addClass(Class cl){
		listClass.add(cl);
		return listClass;
	}
	
	

}
