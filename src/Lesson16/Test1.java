// everything about method String, in Test1 - 6
package Lesson16;

public class Test1 {

	public static void main(String[] args) {

		String s1 = new String("aprtaiveta");

		int a = s1.length();
		System.out.println(a);

		char c = s1.charAt(5);
		System.out.println(c);

		int i1 = s1.indexOf('t'); // // find match string then output index of this symbol
		System.out.println(i1);

		int i2 = s1.indexOf("vet"); // find match string then output index of first simbol
		System.out.println(i2);

		int i3 = s1.indexOf("z"); // if not found then output always -1
		System.out.println(i3);

		int i4 = s1.indexOf("t", 4); // start search from index 1
		System.out.println(i4);

		boolean b1 = s1.startsWith("apr"); // return true if string starts with 'apr' or fasle if not.
		System.out.println(b1);

		boolean b2 = s1.startsWith("apr", 2); // return true if string in index 2 starts with 'apr' or false if it not.
		System.out.println(b2);

		boolean b3 = s1.endsWith("eta"); // return true if string ends with 'eta'. can be also with index.
		System.out.println(b3);

	}
}
