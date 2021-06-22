// Example: Constator,Method and Var have same name, it is allowed.
// but not good practice.

// Object created in contructor and in method.
package Lesson21;

public class Test2 {

	Test2(int a) { // Constructor
		System.out.println("Object created by constator " + a);
		// Test2 t3 = new Test2(4); call constructor inside constructor will
		// create infinite loop

	}

	void Test2(int Test2) { // Method create new Object
		Test2 t2 = new Test2(2);
		System.out.println("Object created by method " + Test2);
		System.out.println(t2);

	}
}

class Employee {
	Employee manage = new Employee();

}

class A {
	public static void main(String[] args) {
		Test2 t = new Test2(1); // code always leads into its class (Test2)
		// to run construction, user's or default.
		System.out.println(t);
		t.Test2(3);

		// Example.Test2 is var type Object(class Test2) var name also Test2;
		// it is allowed
		Test2 Test2;

		// Example.Code create object of (Class) which already
		// has inside code to create object
		Employee e = null;
		// e = new Employee();//this code will create inf-te loop
		// bacause (Class Employee) already has inside code to create an object.
		// Employee e = null;e = new Employee(); separeted statament Dec and Aloc.
		// Employee e = .........new Employee(); the same as above all in one.

	}

}
