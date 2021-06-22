package Lesson25;

public class HomeWork24 {
	public static void main(String[] args) {
		Mechenosec mech = new Mechenosec("riba mechenisec");
		System.out.println(mech.name);
		mech.eat(); // mtd from own class
		mech.swim(); // mtd from own class
		mech.sleep(); // mtd from fish class

		// interface
		Speakable peng = new Pingvin("pingvin Gesha");
		// System.out.println(peng.name);
		peng.speak(); // mtd form own class overrids mtd from interface
		Pingvin peng1 = new Pingvin("pingvin Alex");
		System.out.println(peng1.name);
		peng1.speak(); // mtd form own class overrids mtd from interface
		Bird peng2 = new Pingvin("pingvin Dima");

		System.out.println(peng1.nikename2);
		System.out.println(peng2.nikename);

		Mammal lev = new Lev("Big Leva");
		System.out.println(lev.name);
		lev.eat();
		lev.run();
		lev.sleep();
		lev.speak(); // mtd from interface
		Animal2 lev1 = new Lev("small Leva");
		lev1.eat();
		lev1.sleep();
		Speakable lev2 = new Lev("low leva");
		lev2.speak(); // mtd from interface

	}
}

abstract class Animal2 {
	Animal2(String name) {
		this.name = name;
	}

	String name;

	abstract void eat();

	abstract void sleep();

}

abstract class Fish extends Animal2 {
	Fish(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void sleep() {
		System.out.println("vsegda interesno nabludat kak spit - " + name);
	}

	abstract void swim();

}

abstract class Bird extends Animal2 implements Speakable {
	Bird(String name) {
		super(name);
		this.name = name;
	}

	String nikename = "Pingvin is a Bird";

	abstract void fly();

	public void speak() {
		System.out.println(name + " - sings");
	}
}

abstract class Mammal extends Animal2 implements Speakable {
	Mammal(String name) {
		super(name);
		this.name = name;
	}

	abstract void run();
}

abstract interface Speakable {
	public default void speak() {
		System.out.println("somebody speaks");
	}

}

class Mechenosec extends Fish {
	Mechenosec(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void swim() {
		System.out.println(name + "-  krasivo plavaet");
	}

	@Override
	public void eat() {
		System.out.println(name + "- ne chishnia ");
	}
}

class Pingvin extends Bird {
	Pingvin(String name) {
		super(name);
		this.name = name;
	}

	String nikename2 = "Pingvin is a Pingvin";

	@Override
	public void eat() {
		System.out.println(name + "  - lybit est rybu!");
	}

	@Override
	public void sleep() {
		System.out.println(name + " - spyt prijavshis drug k  drugu");
	}

	@Override
	public void fly() {
		System.out.println(name + "  - ne umeet letat");
	}

	public void speak() {
		System.out.println(name + " - ne umeet pet kak solovei");
	}

}

class Lev extends Mammal {
	Lev(String name) {
		super(name);
		this.name = name;
	}

	public void eat() {
		System.out.println(name + "  - tak lubit miaso");
	}

	public void sleep() {
		System.out.println(name + " - lubit spat");
	}

	public void run() {
		System.out.println(name + " - eto same bistraya koshka");
	}
}