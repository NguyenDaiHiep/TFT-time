package Bai2;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Disciplines> listMH = new ArrayList<>();
		ArrayList<Students> listStu  = new ArrayList<>();
		ArrayList<Class> listClass =new ArrayList<>();
		Teachers t1 = new Teachers("A");
		Teachers t2 = new Teachers("b");
		Teachers t3 = new Teachers("C");
		Teachers t4 = new Teachers("D");
		
		Disciplines d1 = new Disciplines("Toan", 100, 100, t1);
		Disciplines d2 = new Disciplines("Van", 100, 20, t2);
		Disciplines d3 = new Disciplines("Anh", 100, 200, t3);
		Disciplines d4 = new Disciplines("Ly", 100, 100, t4);
		listMH.add(d1);
		listMH.add(d2);
		listMH.add(d3);
		listMH.add(d4);
		
		Students st1 = new Students("Hiep", "12a1", listMH);
		Students st2 = new Students("Hoang", "12a1", listMH);
		Students st3 = new Students("Huy", "12a1", listMH);
		Students st4 = new Students("Hung", "12a1", listMH);
		listStu.add(st1);
		listStu.add(st2);
		listStu.add(st3);
		listStu.add(st4);
		Class cl1 = new Class("12a1", listStu);
		Class cl2 = new Class("12a2", listStu);
		Class cl3 = new Class("12a3", listStu);
		Class cl4 = new Class("12a4", listStu);
		Class cl5 = new Class("12a5", listStu);
		listClass.add(cl1);
		listClass.add(cl2);
		listClass.add(cl3);
		listClass.add(cl4);
		listClass.add(cl5);
		School s1 = new School("THPT Hung Vuong", listClass);
		System.out.println(d1);
		System.out.println("Mot hoc sinh hoc " + st1.sumMH()+ "\t" + "mon");
		System.out.println("Mot lop co " +cl1.siSo() + "\t" + "hoc sinh");
		System.out.println("Mot truong co " + s1.sumClass()+ "\t" + "lop");
		
		
		
		
		
	}

}
