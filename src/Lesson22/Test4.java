//Example how creat a child class when Parent class has a user constructrer 
package Lesson22;

public class Test4 {

}

class Human3 { // Step III

	Human3(){
		System.out.println("Hello def.cons.without arg"); // Default constr.
	}

	Human3(String n) {
		this(n, null); // go IV,  this(n,null) -> calls Overloaded constructor
		System.out.println("Hello III");

		// Step VII. ends.
	}

//OVERLOADED CONSTRUCTOR:
	Human3(String n, String s) { // Step IV
		// V, compiler adds by default go into constructor Grand Class Object, than come back. 
		// System.out.println("Hello IV");
		this.name = n;
		this.surname = s;
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
		this(5); // go II, calls Overloaded constructor 
		System.out.println("Hello I");
		// Step IX ends.
	}
//OVERLOADED CONSTRUCTOR:
	// II step
	TestHuman(int i) {
		super("petja"); // go into III contructor SuperClass with String n,
		System.out.println("Hello II");
		// super class Human
	}  // Step VIII ends.

	public static void main(String[] args) {
		// before creating object th = new TestHuman() the following steps
		// passes throught constructors of all classes.
		// watch IX steps

		TestHuman th = new TestHuman(11);
		System.out.println("----------------");
		Human3 hm3= new Human3("Human");
		System.out.println("----------------");
		System.out.println(th.name + " " + th.surname);

		// only after IX steps come back here to creat.

	}
}

