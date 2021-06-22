// How to manage exceptions. with blocks Try.Catch.Final

package Lesson27;

import java.io.*;

public class Test4 {
	void abc() {
		int[] array = { 0, 1, 2, 3 };
		System.out.println(array[5]);
	}

	void def() throws ArrayIndexOutOfBoundsException {
		abc();
	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		try {
			t.def();
		} catch (ArrayIndexOutOfBoundsException Er) {
			System.out.println("Sorry: ");
			System.out.println(Er.getMessage());
			Er.printStackTrace();
		}
	}
}
