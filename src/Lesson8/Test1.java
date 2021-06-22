// #1 Non Access modifier (final) turns instance variable to a constant.

// #2 if an object has modifier FINAL a reference of varaible can't be reassigned

package Lesson8;

public class Test1 {
	public final int id; // Non Access modifier (final) turn instance variable to a constant.

	String color = "red";
	String engine = "V0";

	Test1() { // we can also assing a constant from a constractor.
		id = 10;
	}
}

class Car {
	String name = "Ivan";
	final Test1 t1 = new Test1(); // an Object has Non Access modifier FINAL

	public static void main(String[] args) {
		// this example #1 for constant varible
		Test1 t = new Test1();
		System.out.println(t.id);

		// this example #2 for an object
		Car c = new Car();

		// if an object has FINAL a reference of varaible can't be reassigned.
		// c.t1 = new Test1(); // won't work

		System.out.println(c.t1.engine); // arg before
		c.t1.engine = "VV"; // but even an object has modifier FINAL you can change arguments of varaibles.
		System.out.println(c.t1.engine);// arg after

	}

}
