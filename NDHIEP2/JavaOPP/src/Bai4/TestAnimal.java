package Bai4;

public class TestAnimal {
	public static void main(String[] args) {
		Dog d1 = new Dog("lu", 3, Sex.MALE);
		Dog d2 = new Dog("heo", 5,Sex.FEMALE);
		Dog d3 = new Dog("pull", 2,Sex.MALE);
		Frog f1 = new Frog("ech", 1, Sex.MALE);
		Frog f2 = new Frog("op", 2, Sex.FEMALE);
		Frog f3 = new Frog("ec", 3, Sex.MALE);
		Kitten k1 = new Kitten("Mun", 2);
		Tomcat t1 = new Tomcat("boss", 3);
		Kitten k3 = new Kitten("mun1", 3);
		System.out.println(k1);
		k1.display();
		Animal a = new Animal() {
		};
		a.addAnimal(d1);
		a.addAnimal(d3);
		a.addAnimal(d2);
		a.addAnimal(f1);
		a.addAnimal(f2);
		a.addAnimal(f3);
		a.addAnimal(k1);
		a.addAnimal(t1);
		a.addAnimal(k3);
		a.avarage();
		
		
	}

}
