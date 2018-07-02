package ndhiep.demoIOC.entities;

public abstract class People {
	protected String name;
	protected int age;
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public People() {
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print(){
		System.out.println("ten " + name + "tuoi " + age);
	}
	
	
	
}
