//Example how creat a child class when Parent class has a user constructrer 
package Lesson22;

public class Test4 {

}

class Human3 { // Step III

	Human3(String n) {
		this(n, null); // go IV
		System.out.println("Hello III");

		// Step VII. ends.
	}

	Human3(String n, String s) { // Step IV
		// V go into Objec superclass, than come back.
		// System.out.println("Hello IV");
		name = n;
		surname = s;
		System.out.println("Hello IV");
		// Step VI ends.
	}

	String name;
	String surname;
}

// Hunam3(Parent) has user contructor
// Because of it we can't creat Child class TestHuman without constructor.
// we can ignore it
class TestHuman extends Human3 {

	// I step
	TestHuman() {
		this(5); // go II
		System.out.println("Hello I");
		// Step IX ends.
	}

	// II step
	TestHuman(int i) {
		super("petja"); // go into III contructor with String n,
		System.out.println("Hello II");
		// super class Human
	} // Step VIII ends.

	public static void main(String[] args) {
		// before creating object th = new TestHuman() the following steps
		// passes throught constructors of all classes.
		// watch IX steps

		TestHuman th = new TestHuman();

		// only after IX steps come back here to creat.

	}
}
