package Lesson20;

import java.util.*;

public class HomeWork20 {

	public static ArrayList abc(String... s) {
		ArrayList<String> list2 = new ArrayList<>();

		// method #1, convert to List and add args without checking dublicats
		// List<String> list = Arrays.asList(s);

		// method #2, checking if (list2) have already args from (...s)
		// if not add arg to list2
		for (String s1 : s) {
			if (!list2.contains(s1)) // method (contains)returns true if found arg
				list2.add(s1);
		}
		Collections.sort(list2);
		return list2;

	}

	public static void main(String[] args) {

		String s1 = "B";
		String s2 = "D";
		String s3 = "F";
		String s4 = "A";
		String s5 = "C";
		String s6 = "Privet";

		System.out.println(abc("Y", s1, s2, s3, s4, s5, s6, "Y", new String("M")));

	}
}
