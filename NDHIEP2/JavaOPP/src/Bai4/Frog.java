package Bai4;

public class Frog extends Animal implements ISound{

	public Frog(String name, int age, Sex sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("op op");
	}

	@Override
	public String toString() {
		return "Frog: " + getName() + " " + getAge() + " " + getSex() + "\n";
	}
	

}
