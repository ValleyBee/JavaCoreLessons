// Inheritance classes 
// Parent classes also named (Base class,Super class)
// Extends classes also named (Derived
// classes,Subclasses,Child classes)

//Relationship of classes 
// "Is-a" and "Has a"

// Here we have exp: relationship of classes "Is-a"
// it meens Doctors is a Employee

// Employee class(parent)
// Doctors class (Child of Employee)  
// Surgeons class (sublass of Doctors)

package Lesson22;

public class Test1 {
	public static void payrise(Employee e) {
		e.wage = e.wage + 100;
	}

	// Examp.public method gets data inside current classes and
	// return data into packages where it been called.
	public int getWage() {
		Doctors doc2 = new Doctors();
		// method eat() isn't public,inside child class without public access
		doc2.eat();
		return doc2.wage;
	}

	// Examp.access protected. method visible only inside and child classes
	// so it's more secured
	protected static int getExperience() {
		Doctors doc2 = new Doctors();
		// doc2.experience();
		return doc2.experience;
	}

	public static void main(String[] args) {

		Doctors doc = new Doctors();
		Surgeons s = new Surgeons();

		doc.age = 45;
		doc.experience = 24;
		doc.name = "Vasil Vasilevich";
		doc.skill = "surgeon";
		System.out.println(doc.name);
		System.out.println(doc.skill);
		System.out.println(doc.wage);
		doc.treat();
		payrise(doc);
		System.out.println(doc.wage);
		doc.eat();
		doc.relax();
		s.improvSkill(doc);
		// calling method getExperience(). inside package and child classes no problem.
		System.out.println(getExperience());

	}
}

// this is Parent class(Base class,Super class)
// after compilation java add here:
// class Employee extends java.lang.Object
class Employee {
	String name;
	int age;
	int experience;
	int wage = 100;

	void eat() {
		System.out.println("eatig time");
	}

	void relax() {
		System.out.println("relaxing time");
	}

}

// creating Extends classes they can aslo be called(Derived
// classes,Subclasses,Child classes)

class Doctors extends Employee {
	String skill;

	void treat() {
		System.out.println("treating people");
	}
}

// creating subclass of Extended class
// all var and methods of Extended class Doctor accessable
// for subclasses
class Surgeons extends Doctors {
	String skill;

	void improvSkill(Employee e) {
		System.out.println(e.name + " is improving skills, call from subclass");
	}
}

class Teacher {

	void teach() {
		System.out.println("teaching students ");
	}
}

class Driver extends Employee {
	String skill;

	void drive() {
		System.out.println("driving a car");
	}
}
