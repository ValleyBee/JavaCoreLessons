// Creating overloading constructors
package Lesson5;

public class Employee {
	// ------------------------- overloading constructor 1
	Employee(int id1, String name1, String surname1, String position1, String doh1, int salary1, double bonus1) {
		// this(id1, name1, surname1); // use 'THIS' go into constractor #3 get id,

		id = id1;
		name = name1;
		surname = surname1;
		position = position1;
		doh = doh1;
		salary = salary1;
		bonus = bonus1;

	}

	// -------------------- overloading constructor 2
	Employee(int id2, String name2, String surname2, String position2, String doh2) {
		id = id2;
		name = name2;
		surname = surname2;
		position = position2;
		doh = doh2;

	}

	// --------------------- overloading constructor 3
	Employee(int id4, String name4, String surname4) {
		// this(position4, doh4); // go into constructor #2
		id = id4;
		name = name4;
		surname = surname4;

	}

	// -------- Access modifier public of constructor #4 allows get it from any
	// packages and classes

	public Employee(int id5) {
		id = id5;

	}

	// ----------------------- variables of class Employee
	public int id; // public varaible can be readen from anywhere
	String name;
	String surname;
	String position;
	String doh;
	int salary;
	double bonus;

	public void show() { // public mathod can be readen from anywhere
		System.out.println(id + " " + name + " " + surname + " " + position + " " + doh + " " + salary + " " + bonus);
	}

	void showIt(int a, String b, String c) {
		System.out.println(a + b + c);
	}

}

class EmployeeTest {
	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "PEtrov", "Much");
		emp1.show();
		Employee emp3 = new Employee(2, "Vasyl", "Mikolajovich", " handyman", "10.01.1978");
		emp3.show();
		Employee emp2 = new Employee(3, "Luke", "karluk", "skywalker", "11.11.3000", 44, 1.5);

		emp1.showIt(77, "77", "77");

	}

}
