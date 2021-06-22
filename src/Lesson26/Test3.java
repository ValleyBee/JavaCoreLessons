// Overloading methods and priority of calling them

package Lesson26;

public class Test3 {
	void abc(int a) {
		System.out.println("int");
	}

	void abc(byte a) {
		System.out.println("byte");
	}

	void abc(long a) {
		System.out.println("long");
	}

	void def(Object o) {
		System.out.println("Object");
	}

	void def(String o) {
		System.out.println("String");
	}

	// PRIORITY
	// 1.EXACT MATCH 2.OVERALL DATA 3.Autoboxed data 4.Varags

	// Exact match
	void ghi(int a, int b) {
		System.out.println("hello 1");
	}

	// overall
	void ghi(long a, long b) {
		System.out.println("hello 2");
	}

	// Autoboxed
	void ghi(Integer a, Integer b) {
		System.out.println("hello 3");
	}

	// Varags
	void ghi(int... a) {
		System.out.println("hello 4");
	}

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.abc(5); // output int because default all numbers int
		t.def("hello string"); // output String,because more appropriate
		// for this arg is def(String)
		t.def(new StringBuilder("Hellp builder")); // output Object

		// priority
		t.ghi(1, 2); // output first priority hello 1

	}
}