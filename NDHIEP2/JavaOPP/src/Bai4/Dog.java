package Bai4;

public class Dog extends Animal implements ISound{

	public Dog(String name, int age, Sex sex) {
		super(name, age, sex);
	}

	@Override
	public void display() {
		System.out.println("gau gau");
		
	}

	@Override
	public String toString() {
		return "Dog: " + getName() + " " + getAge() + " " + getSex() + "\n";
	}
	
	

}
