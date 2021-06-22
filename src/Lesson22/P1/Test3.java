//Test3 is a child of Lesson22.EmployeeTest
//we can access to Public and Proteced var and methods
//

package Lesson22.P1;

import Lesson22.EmployeeTest;

public class Test3 extends EmployeeTest {
	String t3 = "public class Test3";

	public static void main(String[] args) {
		Test3 em = new Test3();
		em.name2 = "Oskar Jacub";// var form Superclass
		System.out.println(em.name2);

		em.relax2();// method (protected) form Superclass
		em.eat2();// method (public) form Superclass
		// em.sleep(); // method (default) form Superclass. can't

		em.getDoctors(); // access method treat2() in Child of Superclass
		// Superclass (Lesson22.EmployeeTest) has child
		// (protected class Doctors)
		// access data only by method inside SuperClass

		// Creat object for not a child class
		// to access public method eat2(); in Superclass
		Test4 t = new Test4("privet from default Test4");

	}
}

class Test4 {
	Test4(String s) {
		Test3 em1 = new Test3();
		System.out.println(s + " + " + em1.t3 + " + from SuperClass public var exper" + em1.experience2);
		System.out.print("public Method eat() from SuperClass ");
		em1.eat2();
	}
}
