package Lesson21;

public class Test3 {

	static void abc(int c) {
		int a = 1;
		System.out.println(a + c); // output 100
		if (a + c < 101) {
			a++;
			return; // return works as brake;
		}
		// unreachable statement after return no any code will run
		System.out.println(a);

	}

	static int abc2(int i) {
		if (i > 10) {
			return 5; // return can be also a statement
		} else {
			return 10; // return can be also a statement
			// if remove return , error
		}

	}

	public static void main(String[] args) {
		abc('c'); // char 'c' has number 99 so it can be int var

		System.out.println(abc2(4));
	}
}
