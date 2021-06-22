// example of down casting varaibles 
// how to call methods of super class form subclass
// how to call varaible by same object using casting
package Lesson25;

import java.util.function.DoubleToIntFunction;

public class Test5 {
	public static void main(String[] args) {
		Test30 t3 = new Test30();
		t3.abc();
		System.out.println(((Test10) t3).a);

		// Primitive data types casting

		// example narrowing without casting if int -> byte -> shor -> chart
		byte a1 = 2;
		int b2 = a1;

		int b3 = 3;
		short a2 = (short) b3;

		// loosing data during casting
		int i10 = 99999;
		short s10 = (short) i10; // short can have from -32.768 to 32.767
		System.out.println(s10); // output 31073

		int i20 = 32767;
		short s20 = (short) i20; // short can have from -32.768 to 32.767
		System.out.println(s20);

		int i30 = (int) 3.14;
		System.out.println(i30); // loosing 3.14 output 3

		// promotion numeric. less became more. during culculation i40 and l, int i40
		// becaming long i40
		int i40 = 5;
		long l = 10;
		// i = i * l; // we cannot do this but
		i40 = (int) (i40 * l); // we can do this or
		i40 *= l; // we can do this . tasks : first multi i*l then = (int
		// converting to a long
		// during task then i became again int = result);

	}

}

class Test10 {

	int a = 5;

	void abc() {
		System.out.println("ok1");
	}
}

class Test20 extends Test10 {
	int a = 10;

	void abc() {
		System.out.println("ok2");
	}
}

class Test30 extends Test20 {
	int a = 15;

	void abc() {
		super.abc();
		System.out.println("ok3");
	}

}