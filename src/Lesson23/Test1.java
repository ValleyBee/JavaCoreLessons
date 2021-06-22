// OVERRIDING & HIDING METHODS
// COMPILE(STATIC) AND RUNTIME BINDINGS
package Lesson23;

public class Test1 {
	public static void main(String[] args) {

		Doctor doc = new Doctor();
		Employee emp1 = new Employee();

		emp1.eat(); // OVERRIDING METHOD
		doc.eat();// OVERRIDING METHOD
		// emp2.eat();

		emp1.watch();// OVERRIDING METHOD deferent return type
		doc.watch();// OVERRIDING METHOD deferent return type

		// RUNTIME BINDING // Methods calls by where var refers.

		Employee emp2 = new Doctor(); // Var emp2 refers to (Doctor class)
		emp2.eat(); // runtime binding calls method eat() Output "eating Doctor"
		Doctor doc2 = new Surgeon();// var doc2 refers to (Surgeon class)
		doc2.eat();// runtime binding calls method eat() Output "eating Surgeon"

		// emp1.relax(); // OVERLOADED METHOD class Employee
		// doc.relax(null); // OVERLOADED METHOD CLass Doctor
		// doc.relax(); // OVERLOADED METHOD class Employee
		System.out.println(emp2.name);

	}
}

class Employee {

	String name = "name Employee";
	int age;
	int wage = 100;
	int experience = 2;

	// OVERRIDING METHOD

	void eat() {
		System.out.println("eatig Employee");
	}

	void relax() {
		System.out.println("relaxing Employee");
	}

	// OVERRIDING METHOD deferent return type
	// return type Parent class
	EmpRoom watch() {
		EmpRoom er = new EmpRoom();
		System.out.println(er.s + " watching Tv");
		return er;
	}
}

// Examp.deferent return type
class EmpRoom {
	String s = "Employee";
}

// Examp. deferent return type
class RoomTv extends EmpRoom {
	String s1 = "Doctor";
}

class Doctor extends Employee {
	String name = "name Doctor";

	void treat() {
		System.out.print("Doc treating people + ");
	}

	// OVERRIDING METHOD
	@Override
	void eat() {
		System.out.println("eatig Doctor");
	}

	// OVERLOADED METHOD
	void relax(String a) {
		System.out.println("relaxing Doctor");
	}

	// OVERRIDING METHOD deferent return type
	// return type subclass
	RoomTv watch() {
		RoomTv r = new RoomTv();
		System.out.println(r.s1 + " watching Tv");
		return r;
	}
}

class Surgeon extends Doctor {
	// OVERRIDING METHOD
	@Override
	void eat() {
		System.out.println("eatig Surgeon");
	}

	void skalp() {
		System.out.println(" surgical operation");
	}
}