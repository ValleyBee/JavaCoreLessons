package Lesson25;

public class Test3 {
	public static void main(String[] args) {
		Help_able h = new Driver();
		Employee em = new Driver();
		Driver d = new Driver();
		h.someHelp();
		d.someHelp();
		d.driverRelax();
		// em.driverRelax();
		em.eat();

		System.out.println(((Driver) em).casdriver);

		// example of relation between two classes Human and Animal
		// by interface Jumpable they are connedted
		Jumpable j1 = new Human();
		Jumpable j2 = new Animal();
		j1.jump();
		j2.jump();
	}
}

class Employee {
	// public void driverRelax() {
	// System.out.println("class Employee - Driver relaxing");
	// }

	void eat() {
		System.out.println("eating");
	}

	void sleep() {
		System.out.println("sleeping");
	}
}

class Driver extends Employee implements Help_able {
	String casdriver = "casting reference";

	void drive() {
		System.out.println("driving");
	}

	public void driverRelax() {
		System.out.println("class Driver - Driver relaxing");
	}

	public void someHelp() {
		System.out.println("helping");
	}

	public void tushitPozar() {
		System.out.println("tushu pozar");
	}

}

interface Help_able {
	public abstract void someHelp();

	public abstract void tushitPozar();
}

// example of relation between two classes Human and Animal
// by interface Jumpable they are connedted
class Human implements Jumpable {
	void speak() {
		System.out.println("speaking");
	}

	public void jump() {
		System.out.println("Human jumping");
	}
}

class Animal implements Jumpable {
	void bark() {
		System.out.println("barking");
	}

	public void jump() {
		System.out.println("Animal jumping");
	}
}

interface Jumpable {
	public void jump();
}
