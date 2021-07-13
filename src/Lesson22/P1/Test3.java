//#Test3 is a child of Lesson22.EmployeeTest
package Lesson22.P1;

import Lesson22.EmployeeTest;

public class Test3 extends EmployeeTest {
	String t3 = "public class Test3";

	public static void main(String[] args) {
		Test3 em = new Test3(); // Object child class
 		EmployeeTest emp2 = new EmployeeTest(); // Object SuperClass

//#example 1: Accassability varaibles
	// name2 is var form Superclass
		Test5 t5 = new Test5();	
		Test5 t51 = new Test5();

		System.out.println("t5.name2 " + t5.name2);
		System.out.println("em.name2 " + em.name2);
		System.out.println("#1 Is equals (em.name2 to t5.name2) = " + em.name2.equals(t5.name2));

		em.name2 = "Oskar Jacub"; 
		t5.name2 = "NOT Oskar JACOB";

		System.out.println("em.name2 " + em.name2);
		System.out.println("t5.name2 " + t5.name2);
		System.out.println("#2 Is equals (em.name2 to t5.name2) = " + em.name2.equals(t5.name2));

//#1 we got access to var name2 form sub-sub class by extend class sub class Test5
//#2 varaible (name2) from Superclass assigned new arg "Oscar jacub" by em.name2
//#3 changed value by t5.name2 = "NOT Oskar JACOB"  
//#4 result: value only changed in object t5.name, original value name2 didn't change. 
//#5 because during creating a new object it gets original value of var. name2 Superclass

		
	System.out.println("em.name2 " + em.name2);
	System.out.println("t51.name2 " + t51.name2);
	System.out.println();


//#example 2: Accassability methods

	System.out.println();
	//# Example access protected methods .
	//# because class Test3 extends EmployeeTest we can access the following methods :
	//# EmployeeTest methods:
	System.out.println("class EmployeeTest protected methods:");
	
//# Public method form Superclass
		//can accessable by Object Superclass emp1 or Object Child class em
		em.eat2(); 
		emp2.eat2(); 

//# Default method from Superclass
		// em.sleep(); not accessable

		em.getDoctors(); // access method treat2() in Child of Superclass
		// Superclass (Lesson22.EmployeeTest) has child
		// (protected class Doctors)
		// access data only by method inside SuperClass

		// Creat object for not a child class
		// to access public method eat2(); in Superclass
		 System.out.println();
	// Geting data	 
		 Test4 t4 = new Test4("privet from default Test4");

//# Procected method relax2() form Superclass
	// not accessable by Object Superclass
		EmployeeTest emp1 = new EmployeeTest();
		// emp1.relax2(); 
		// access only Object child class
		em.relax2();
	
	}


}

class Test5 extends Test3 {

}

  
class Test4 {

	Test4(String s) {
		Test3 em1 = new Test3();
		System.out.println(s + " + " + em1.t3 + " + from SuperClass public var exper" + em1.experience2);
		System.out.print("public Method eat() from SuperClass ");
		em1.eat2();
	  	}

	
}
