package Bai4;

import java.util.ArrayList;

public abstract class Animal {
	private String name;
	private int age;
	private Sex sex;
	public static ArrayList<Animal> animal = new ArrayList<>();

	public Animal(String name, int age, Sex sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	

	public Animal() {
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public Sex getSex() {
		return sex;
	}


	public ArrayList<Animal> getAnimal() {
		return animal;
	}
	public ArrayList<Animal> addAnimal(Animal a){
		animal.add(a);
		return animal;
	}
	public static void avarage(){
		double sum = 0;
		double sum1= 0;
		double sum2 = 0;
		int b = 0; int b1= 0; int b2=0;
		
		for (Animal animal2 : animal) {
			if(animal2 instanceof Dog){
				sum+=animal2.getAge();
				b++;
			}else if(animal2 instanceof Frog){
				sum1+=animal2.getAge();
				b1++;
			}else{
				sum2+=animal2.getAge();
				b2++;
			}
		}
		System.out.println("so tuoi tb cua cho la: " + sum/b);
		System.out.println("so tuoi tb cua ech la: " + sum1/b1);
		System.out.println("so tuoi tb cua meo la: " + sum2/b2);
		
	}
	

}
