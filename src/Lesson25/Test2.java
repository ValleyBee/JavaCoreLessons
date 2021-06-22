// This example shows the sequence of calling construtors, methods and varables 
// during creating an Object t2,t3,t4 which are extended. 
package Lesson25;

import Lesson24.*; // calling class Test1

public class Test2 extends Test1 {
	public int tt = 2;

	Test2(int c) {
		System.out.println("test2 cons2");
	}

	Test2() {
		System.out.println("test2 cons1 default");
	}

	public void abc() {
		System.out.println("method from Test2");
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2(2);
		Test1 t3 = new Test2(2);
		Test1 t4 = new Test1(2);
		// Test1 t5 = new Test1();
		t2.abc();
		t3.abc();
		t4.abc();
		System.out.println(t2.tt);
		System.out.println(t3.tt);
		System.out.println(t4.tt);
	}

}
