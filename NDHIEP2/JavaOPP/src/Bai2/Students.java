package Bai2;

import java.util.ArrayList;

public class Students {
	private String nameStudent;
	private String nameClass;
	ArrayList<Disciplines> listMh = new ArrayList<>();

	public Students(String nameStudent, String nameClass, ArrayList<Disciplines> listMh) {
		this.nameStudent = nameStudent;
		this.nameClass = nameClass;
		this.listMh = listMh;
		
	}
	public Students(){
		
	}
	
	public ArrayList<Disciplines> addMh(Disciplines discipline){
		listMh.add(discipline);
		return listMh;
		
	}
	
	
	public ArrayList<Disciplines> removeMh(Disciplines discipline){
		listMh.remove(discipline);
		return listMh;
	}
	public int sumNumberOfLecture(){
		int sum = 0;
		for (int i = 0; i < listMh.size(); i++) {
			sum+=listMh.get(i).getNumbersOfLecture();
		}
		return sum;
	}
	public int sumNumberOfEx(){
		int sum = 0;
		for (int i = 0; i < listMh.size(); i++) {
			sum+=listMh.get(i).getNumberOfEx();
		}
		return sum;
	}
	public int sumMH(){
		int sum = 0;
		for (int i = 0; i < listMh.size(); i++) {
			sum++;
			
		}
		return sum;
	}
	@Override
	public String toString() {
		return "Students [nameStudent=" + nameStudent + ", nameClass=" + nameClass + ", listMh=" + listMh + "]";
	}
	
	

}
