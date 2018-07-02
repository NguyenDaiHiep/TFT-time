package Bai3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {

		ArrayList<Students> students = new ArrayList<>();
		ArrayList<Workers> works = new ArrayList<>();
		ArrayList arrayNew = new ArrayList<>();
		Students st1 = new Students("Nguyen", "Hiep", 12);
		Students st2 = new Students("Le", "A", 6);
		Students st3 = new Students("Tran", "B", 9);
		Students st4 = new Students("Hoang", "C", 1);
		Students st5 = new Students("trinh", "D", 5);
		Workers wk1 = new Workers("Nong", "E", 560, 8);
		Workers wk2 = new Workers("Pham", "F", 1400, 10);
		Workers wk3 = new Workers("Hoang", "G", 1400, 8);
		Workers wk4 = new Workers("Nguyen", "L", 1680, 8);
		Workers wk5 = new Workers("Tran", "y", 1460, 12);

		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		Collections.sort(students);
		for (Students students2 : students) {
			System.out.println(
					students2.getFirstName() + " " + students2.getLastname() + " " + students2.getNumberClass());
		}
		System.out.println();
		works.add(wk1);
		works.add(wk2);
		works.add(wk3);
		works.add(wk4);
		works.add(wk5);
		Collections.sort(works);
		for (Workers workers : works) {
			System.out.println(workers.getFirstName() + " " + workers.getLastname() + " " + workers.MoneyPerHours());
		}
		arrayNew.addAll(students);
		arrayNew.addAll(works);
		Collections.sort(arrayNew,new Comparator<Human>() {

			@Override
			public int compare(Human o1, Human o2) {
				int sort = o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
				if(sort!=0)
					return sort;
				return o1.getLastname().compareToIgnoreCase(o2.getLastname());
			}
		});
		System.out.println(arrayNew);
		
		

	}

}
