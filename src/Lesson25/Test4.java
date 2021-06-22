// Polipolymorphism example / Casting examaple
package Lesson25;

public class Test4 {
	public static void main(String[] args) {
		Employee4 emp1 = new Teacher4();
		Employee4 emp2 = new Driver4();
		Employee4 emp3 = new Doctor4();
		Help_less tech = new Teacher4();

		// example of Casting reference data type
		Teacher4 t2 = (Teacher4) emp1; // t2 became emp1
		System.out.println(t2.tt); // now can call varaible String tt

		System.out.println(((Teacher4) emp1).tt); // same as above
		// now emp1 can call varaible from class Teacher4

		((Teacher4) emp1).noHelp(); // method

		// DOWNCASTING
		tech.noHelp(); // tech could call only from interface Help_less
		// here done down casting
		System.out.println(((Teacher4) tech).tt); // now tech can call var from class Teacher4

		// now tech(interface) can call methods from class Teacher4
		((Teacher4) tech).work();

		// classic example of polimorphism
		Employee4[] array4 = { new Driver4(), new Teacher4(), new Doctor4(), new Doctor4() };

		Employee4[] array5 = { emp1, emp2, emp3 };

		// emp1.work();
		// emp1.help();
		// tech.noHelp();
		// emp2.work();
		// emp3.work();

		// FOREACH
		for (Employee4 employee : array4) {
			System.out.println(employee);
		}

		for (Employee4 employee : array4) {
			employee.work();
		}

		// if between (e) and object (Driver) has relationship (IS A) then do
		// (e) became step by step in foreach loop from array[] data of reference
		// emp1,emp2,...
		// in this example (e) connected to (emp2)
		// use (instanceof) save us from error runtime casting exeption
		for (Employee4 e : array5) {
			if (e instanceof Driver4) {
				Driver4 drv = (Driver4) e; // here we did casting because it is
				// usefull to use (drv) instead of (e) as drv association with driver

				System.out.print(((Driver4) drv).carName + " ");
				((Driver4) drv).drive();
			}

		}

	}
}

abstract class Employee4 implements Help_able4 {
	void sleep() {
		System.out.println("Employee sleeps");
	}

	abstract void work();

	public void help() {
		System.out.println(" teacher helps");
	}
}

class Teacher4 extends Employee4 implements Help_less {
	String tt = "teaching people";

	void work() {
		System.out.println("Teacher works");
	}

	public void noHelp() {
		System.out.println("teacher does not help");
	}

}

class Driver4 extends Employee4 {
	String carName = "Citroen c4";

	void work() {
		System.out.println("Driver works");
	}

	void drive() {
		System.out.println("Driver drives");
	}
}

class Doctor4 extends Employee4 {
	void work() {
		System.out.println("Doctor works");
	}
}

interface Help_able4 {
	void help();
}

interface Help_less {
	void noHelp();
}