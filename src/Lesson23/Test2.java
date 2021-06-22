// OVERRIDING & HIDING METHODS
// COMPILE(STATIC) AND RUNTIME BINDINGS
package Lesson23;

public class Test2 {
	void abc(Animal a) {
		System.out.println("A");
	}

	void abc(Mouse m) {
		System.out.println("M");
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		Animal an1 = new Animal(); // runtime decision is Animal
		Mouse an2 = new Mouse(); // runtime decision is Mouse
		Animal an = new Mouse(); // runtime decision is Mouse but
		// output depens how you call method

		t.abc(an); // output A

		// ---- EXAMPLE Compile binding

		// (an,an2) reference varaibles
		// all varaibles binding compile
		an.getName(an); // output Animal. an.(an) refers to (Animal)
		an.getName(an2); // output Animal. even (an2) refers to (Mouse)
		// if need call
		an2.getName(an2); // output Mouse.if all vars an2.(an2) refers to (Mouse)
		an1.getName(an1); // output Animal.all vars an2.(an2) refers to (Animal)
	}

}

class Animal {

	void getName(Animal a) {
		System.out.println("Animal");

	}

}

class Mouse extends Animal {

	void getName(Mouse a) {
		System.out.println("Mouse");

	}
}
