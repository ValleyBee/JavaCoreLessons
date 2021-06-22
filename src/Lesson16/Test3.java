// everything about method String, in Test1 - 6
package Lesson16;

public class Test3 {

	public static void main(String[] args) {
		// char array to a string
		char[] array = { 'p', 'r', 'i', 'v', 'e', 't', '!', '!', '!' };
		String s = new String(array);
		// ---append use array to add in its string
		StringBuilder sb = new StringBuilder("Hello World");
		StringBuilder sb1 = new StringBuilder("Hello World!");
		sb.append(array, 2, 3); // only StringBuilder has method append

		sb1.insert(1, array, 0, 4);
		int a = 5;
		int b = 6;
		String c = "ok";

		System.out.println(a + b + c); // output 11ok as additions result
		System.out.println("" + a + b + c); // output 5_6_ok in case no need to add a + b
		System.out.println("" + (a + b) + c);// outout 11ok.
		// ---char
		System.out.println("converts char array to string : " + s);
		// --- append & insert
		System.out.println(sb);
		System.out.println(sb1);
	}

}
