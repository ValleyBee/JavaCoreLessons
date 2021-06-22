//HIDING METHODS
// WITH ACCESS MOD STATIC,FINAL,PRIVATE, METHODS CAN'T BE OVERRIDING
// STATIC,FINAL BECAME HIDING METHODS
//PRIVATE METHOD CAN'T BE HIDING, because it not extends in child classes
//static and final methods calls by type of var.
package Lesson23;

public class Test3 {

	public static void main(String[] args) {
		Employee2 emp2 = new Doctor2();
		Employee2 emp = new Employee2();
		Doctor2 doc = new Surgeon2();
		emp2.eat(); // output "eatig Employee"
		// because type of var is Employee.
		// in Test1 same code output "eatig Doctor"
		// bacause Test1 these method overriding

	}
}

class Employee2 {
	String name = "name Employee";

	// ACCESS MOD STATIC MAKES METHOD HIDING

	static void eat() {
		System.out.println("eatig Employee");
	}

	void relax() {
		System.out.println("relaxing Employee");
	}

}

class Doctor2 extends Employee2 {
	String name = "name Doctor";

	void treat() {
		System.out.print("Doc treating people");
	}

	// ACCESS MOD STATIC or FINAL MAKES METHOD HIDING
	final void eat() {
		System.out.println("eatig Doctor");
	}

	// OVERLOADED METHOD
	void relax() {
		System.out.println("relaxing Doctor");
	}

}

class Surgeon2 extends Doctor2 {
	static String name = "name Surgeon";

	static void eat() {
		System.out.println("eatig Surgeon");
	}

	void skalp() {
		System.out.println(" surgical operation");
	}
}
