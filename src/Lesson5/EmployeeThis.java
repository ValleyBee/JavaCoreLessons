// Creating overloading constructors and use 'THIS' to jumps between them.

package Lesson5;

public class EmployeeThis {
	// ------------------------- overloading constructor 1
	EmployeeThis(String name1, String surname1, String position1, String doh1, String dob1) {
		// this(name1, surname1, position1); // get vars use 'THIS' go into constractor
		// #3
		name = name1;
		surname = surname1;
		position = position1;
		doh = doh1;
		dob = dob1;
	}

	// -------------------- overloading constructor 2
	EmployeeThis(String position2) {
		this(null, null, position2, null, null);
		position = position2;

	}

	// --------------------- overloading constructor 3
	EmployeeThis(String name4, String surname4, String position4) {
		this(position4); // to get a var go into constructor #2
		name = name4;
		surname = surname4;

	}

	// ----------------------- Instant variables
	String name;
	String surname;
	String position;
	String doh;
	String dob;

	void show() { // #1 method
		System.out.println(" - " + name + " - " + surname + " - " + position + " - " + doh + " - " + dob);
	}

} // end class EmployeeThis

class EmployeeTest2 {
	public static void main(String[] args) {

		// object go to constructor #1 with three patameters
		EmployeeThis emp1 = new EmployeeThis("Petrov", "Much", "wiper"); // obj
		emp1.show(); // calling method #1

		// object go to constructor #2 with one patameter
		EmployeeThis emp3 = new EmployeeThis("Vasyl"); // obj
		emp3.show(); // calling method #3

		// object go to constructor #1 with six patameters
		EmployeeThis emp2 = new EmployeeThis("Luke", "karluk", "skywalker", "11.11.3000", "20.12.1944"); // obj
		emp2.show(); // calling method #1

	}

} // end class EmployeeTest2
