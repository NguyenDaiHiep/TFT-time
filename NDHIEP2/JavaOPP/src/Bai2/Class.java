package Bai2;

import java.util.ArrayList;

public class Class {
	private String ClassName;
	ArrayList<Students> listStudent = new ArrayList<>();

	public Class(String className, ArrayList<Students> listStudent) {
		ClassName = className;
		this.listStudent = listStudent;
	}
	public int sumStudent(){
		int sum = 0;
		for (int i = 0; i < listStudent.size(); i++) {
			sum++;
		}
		return sum;
	}
	public String toString(){
		return "Lớp: " + ClassName + "có " + sumStudent() + "học sinh";
	}
	public ArrayList<Students> addStudent(Students stu){
		listStudent.add(stu);
		return listStudent;
		
	}
	public int siSo(){
		int siso = 0;
		for (int i = 0; i < listStudent.size(); i++) {
			siso = listStudent.size();
		}
		return siso;
	}

}
