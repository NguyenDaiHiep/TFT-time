package demo;

class Demo {
	int rollno;
	String name;
	static String college = "BachKhoa";

	static void change() {
		college = "QuocGia";
	}

	Demo(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		Demo.change();

		Demo s1 = new Demo(111, "Hoang");
		Demo s2 = new Demo(222, "Thanh");
		Demo s3 = new Demo(333, "Nam");

		s1.display();
		s2.display();
		s3.display();
	}
}
