//Using Exceptions in class,constructors,methods 
// I. In Subclass we can use Check Exception same or more wider than used in super class
//II. In Overrided methods abc(); we Can Not Use Check Exception more wider than used origin method abc(); used and it is not neccessary wright again exception in overrided methods
// III. Overloaded methods: abc (int a); can use any exceptions

package Lesson27;

import java.io.*;

public class Test13 {

	public static void main(String[] args) {
		try {
			Animal a = new Mouse();
		} catch (IOException er) {
		}
	}
}

class Animal {
	String a = "ss";

	Animal() throws FileNotFoundException, IndexOutOfBoundsException {
		System.out.println("super Animal");
	}

}

// in subclass we can use Exception more wider than used in super class
class Mouse extends Animal {
	String a = "string";

	Mouse() throws IOException {// exception wider than super class
		super();
		System.out.println("subclass Mouse " + a);
	}
}
