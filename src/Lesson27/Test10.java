// Sequenc of (try catch) and action when (throw new) 
package Lesson27;

import java.io.*;

public class Test10 {
	static String abc() {
		String s1 = "";
		String s2 = null;

		OUTTER: try {
			INNER: try {
				s1 += "1";
				s2.charAt(3); // here out an exception NullPointer... and code jumps to catch NULLPOINTER
				s1 += "2";
			} // INNER FINISH
			catch (NullPointerException e) {
				s1 += "3";
				throw new RuntimeException();
				// System.out.println("catch an excep null " + e.getMessage());
			} finally {
				s1 += "4";
				throw new Exception();
			}
		} // OUTTER FINISH
		catch (Exception e) {
			s1 += "5";
		}
		return s1;
	}

	public static void main(String[] args) {
		System.out.println(abc()); // out 1345
	}
}
