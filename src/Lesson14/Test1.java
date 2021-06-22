package Lesson14;

public class Test1 {
	static int i = 1;
	static int a = 10;
	static int b = 15;
	static int n = 3;

	static void abc(int n) {
		System.out.println("loop four n " + n);
		i++;
	}

	public static void main(String[] args) {

		// regular for
		for (i = 1; i <= 10; i++) {
			System.out.println("first loop " + i);
		}
		// for works without some parameters
		for (; i <= 20;) {
			System.out.println("second loop " + i);
			i++;

		}
		// for with Logical operators
		for (i = 1; i <= 150 || a <= 150 || b <= 150; i++, a++, b++) {
			System.out.println("loop three i" + i + " a " + a + " b " + b);
		}
		// for with methods
		for (i = 1; i <= 10; abc(n)) {
			n++;
			System.out.println("loop four i " + i);

		}

	}

}
