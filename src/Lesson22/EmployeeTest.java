//#Examples. access modifiers
	//here and Lesson22.P1.Test3
	//file Test3 is a child, EmployeeTest Surepclass 
package Lesson22;

public class EmployeeTest {
	

	protected String name2 = ("EmployeeTest var name2");
	protected int age2;
	protected int wage2 = 100;

	public int experience2 = 2;

	// PUBLIC
	public void eat2() {
		System.out.println("eatig time2");
	}

	// PROTECTED
	protected void relax2() {
		System.out.println("relaxing time2 from EmployeeTest");
	}

	// DEFAULT
	void sleep2() {
		System.out.println("sleeping time2");
	}

	// PRIVATE
	private void relax3() {
		System.out.println("relaxing for V.I.P. people");
	}

	// Encapsulation method gets data from Child class from not Parent package.
	protected void getDoctors() {
		Doctors2 doc = new Doctors2();
		doc.treat2();
	}

 

	public static void main(String[] args) {
//# Class Doctors is a child
		// has access to protected var and method.
		Doctors2 doc2 = new Doctors2();
		doc2.name2 = "Korolkov Alexandr";
		System.out.println(doc2.name2);
		System.out.println(" EXAMPLE I.to Parent from child");
		doc2.treat2();
		

		System.out.println("EXAMPLE II to Child from Subclass");
		Surgeons2 sur2 = new Surgeons2();
		sur2.improvSkill(doc2);
		System.out.println();
//# Class Drive is not a child
		// has no access to protected var and method.
		System.out.println("EXAMPLE III");
		Driver2 dr = new Driver2();
		dr.drive2(); // method form Drive class. access ok.
		// dr.name = "Teacherkov Maxim"; // (String name) prorected. no access
//# Private method relax3()
		EmployeeTest emp = new EmployeeTest();
		emp.relax3();
//# Procected method relax2()	
		// no access through Object child class
		// dr2.relax2(); //no access method is protected. 
			// EmployeeTest emp = new EmployeeTest();
			//emp.relax3();
		
	}

}

// ---- EXAMPLE I "Is-a"
// creating Extends class can aslo be called(Derived
// classes,Subclasses,Child classes)

class Doctors2 extends EmployeeTest {
	
	String skill = " Doctor skilled";
		// for Child class no needed create (new Employee)
	// to access any var and methods in Parent class
	// name2,wage2,age2,eat2()
	
	void treat2() {
		System.out.print("treating people2 + ");
		System.out.print("Doctor: ");
		System.out.println(name2 + " " + wage2 + " " + age2);
		eat2(); // public
		sleep2(); // default
		relax2(); // protected @ Override method

	
	}
	
// # Override protected method relax2() Superclass EmployeeTest.
//	access modifier must be same or less restricted. public or protected. 
	@Override
	protected void relax2(){
		System.out.println("relaxing time2 from Doctor");
	}



}

// ----- EXAMPLE II "Has-a"
// creating subclass of Extended class
// all var and methods of Extended class Doctor will be accessable
class Surgeons2 extends Doctors2 {
	// for subclass no needed create (new object)
	void improvSkill(EmployeeTest e) {
		System.out.println(e.name2 + " call from subclass");
		System.out.println(skill); // var from extends Doctros class

	}
}

// ---- EXAMPLE III
class Driver2 {
	// create new Object (dr2 Employee)
	// to access public var (experience)
	// to acess public method eat2()
	EmployeeTest dr2 = new EmployeeTest();

	void drive2() {
		System.out.print("driving a car2" + " + experience = " + dr2.experience2 + " ");
		dr2.eat2();
	}
}






