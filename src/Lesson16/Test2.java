// everything about method String, in Test1 - 6
package Lesson16;

public class Test2 {

	public static void main(String[] args) {
		String s1 = new String("apraivetarai  ");

		String s10 = s1.substring(2); // assing to s10 string starting form index 2.
		System.out.println(s10);

		String s11 = s1.substring(1, 4); // assing to s11 starting 1 and ending 4 by index but last idx not included.
		System.out.println(s11);

		String s12 = s1.trim();
		System.out.println(s12); // cuts spaces outside of string.

		String s13 = s1.replace('a', 'x');
		System.out.println(s13);

		String s14 = s1.replace("rai", "iar");
		System.out.println(s14);

		// Exeption for only char. can be on EXAMEN QUESTION
		String s2 = "poka";
		String s3 = s2.replace('k', 'k'); // char return same object
		System.out.println(s2 == s3); // true

		String s4 = s2.replace("k", "k");
		System.out.println(s2 == s4); // in early version JDK 8 return false, in JDK 15 true. need to check.

		String s5 = "Privet";
		String s6 = "drug";
		System.out.println(s5.concat(s6)); // same as s5 + s6

	}

}
