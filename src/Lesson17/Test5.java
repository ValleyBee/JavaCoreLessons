package Lesson17;

// array receiving in parameter other arrays sb1,sb2,sb3

public class Test5 {

	public static void main(String[] args) {

		String sb1 = new String("first word1");
		String sb2 = new String("second word2");
		String sb3 = new String("third word3");
		String[] arraySb = { sb1, sb2, sb3 };
		for (String string : arraySb) {
			System.out.println(string);
		}

	}

}
