package Lesson22.HomeWork;

public class Animal {
	void Animal() {
		System.out.println("I am animal");
	}

	protected int eyes;

	void eat() {
		System.out.println("Animal is eating");
	}

	void drink() {
		System.out.println("Animal is drinking");
	}

}

class Pet extends Animal {
	Pet() {
		System.out.println("I am pet");
		this.eyes = 2;
	}

	protected String name;
	protected int tail = 1;
	protected int paw = 4;

	void run() {
		System.out.println("pet runs");
	}

	void jump() {
		System.out.println("pet jumps");
	}

}

class Dog extends Pet {

	Dog(String name) {
		this.name = name;
		System.out.println("I am dog and my name is " + name);
	}

	void play() {
		System.out.println("dog plays");
	}

}

class Cat extends Pet {

	Cat(String name) {
		this.name = name;
		System.out.println("I am cat and my name is " + name);
	}

	void sleep() {
		System.out.println("cat sleeps");
	}
}

class Test {

	public static void main(String[] args) {
		Dog dogy = new Dog("Bayron");
		System.out.println("I have " + dogy.paw + " paws");
		Cat kity = new Cat("Barsik");
		kity.sleep();
		Pet pets = new Pet();

		pets.name = " I am monster";
		pets.eyes = 12;
		pets.paw = 8;
		pets.tail = 4;
		System.out.println(pets.name + " I have " + pets.eyes + " big eyes " + "I have huge " + pets.paw + " paws"
				+ " and very long " + pets.tail + " tails");
	}
}
