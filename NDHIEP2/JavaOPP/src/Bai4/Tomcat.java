package Bai4;

public class Tomcat extends Cat{
	public static final Sex sex = Sex.MALE;

	public Tomcat(String name, int age) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("meo00 meo00");
		
	}

	@Override
	public String toString() {
		return "Tomcat: " + getName() + " " + getAge() + " " + getSex() + "\n";
	}
	
	

}
