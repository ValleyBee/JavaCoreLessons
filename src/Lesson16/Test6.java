package Lesson16;

public class Test6 {

	public static void main(String[] args) {

		String s1 = new String("ok");
		String s2 = new String("ok");
		System.out.println(s1 == s2); // output false, because was created new object
		System.out.println(s1.equals(s2)); // output true, bacause method equals used for compare an object

		String s3 = "ok";
		String s4 = "ok";
		System.out.println(s3 == s4);
		// output true, because no new object. s3 put in a String pool arg "ok"
		// and s4 checked "ok" already exists no need put in pool, so s4
		// simple linked to same string in pool.

		String s5 = "How Are You";
		String s6 = "how are you";
		System.out.println(s5 == s6); // false
		System.out.println(s5.equals(s6)); // fasle becase UpperCase
		System.out.println(s5.equalsIgnoreCase(s6)); // true

	}

}
