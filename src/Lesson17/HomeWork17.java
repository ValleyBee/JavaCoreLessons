// HomeWork 17 I have two methods for task solution
package Lesson17;

public class HomeWork17 {

	static boolean ravenstvo(StringBuilder s1, StringBuilder s2) {

		// #1
		// String s3 = new String(s1);
		// String s4 = new String(s2);

		CharSequence s5 = (s1.subSequence(0, s1.length()));
		CharSequence s6 = (s2.subSequence(0, s2.length()));

		System.out.println("s5=" + s5 + " s6=" + s6);

		// boolean result = s1.equals(s2); //#1

		boolean result = s5.equals(s6);
		return result;

	}

	public static void main(String[] args) {

		StringBuilder s1 = new StringBuilder("provkit World");
		StringBuilder s2 = new StringBuilder("provkit World");

		System.out.println(ravenstvo(s1, s2));

	}

}
