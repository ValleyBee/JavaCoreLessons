// Examp. (Import), all var and method reachable 
// only from (public class Lesson22.Test1)
// others methods (Protected) not reachable so they are more secured
package Lesson22.P1;

import Lesson22.Test1;

public class Test2 {

	public static void main(String[] args) {
		// Exmp.I - using imported public method getWage() we got some data
		// method getWage() getting some data from not public classes
		// and it can run not public methods
		Test1 doc = new Test1();
		System.out.println(doc.getWage());

		// Exmp. II method getExperience() has protected access.
		// it can't be called here. so it is more secured
		// doc.getExperience();

	}

}
