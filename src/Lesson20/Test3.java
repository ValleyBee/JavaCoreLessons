// ArrayList everything about it here!
package Lesson20;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {

		ArrayList<StringBuilder> list = new ArrayList<>();
		list.add(new StringBuilder("first word1"));
		list.add(new StringBuilder("second word2"));
		list.add(new StringBuilder("third word3"));

		ArrayList<String> list2 = new ArrayList<>();
		list2.add(new String("first word1"));
		list2.add(new String("second word2"));
		list2.add(new String("first word1"));
		list2.add(new String("third word3"));

		// "first word1" not found
		// #equals StringBuilder compers refers  to the objects
		// cause, in StringBuilder it compers object but not elements
		System.out.println(list.indexOf(new StringBuilder("first word1")));
		System.out.println(list.indexOf("first word1"));
		// output -1 not found

		// "first word1" found
		// #equals String compers elements of the objects
		System.out.println(list2.indexOf(new String("first word1")));
		System.out.println(list2.indexOf("first word1"));
		// output 0, string found in index 0

		System.out.println(list2.lastIndexOf("first word1"));
		// lastindex of string if have copyies

		System.out.println(list2.contains("first word1"));
		// returns true if contains. works only method with String
		// usful method for checking dublicats args

		// System.out.println(list2.isEmpty()); // false not empty
		// list2.clear();
		// System.out.println(list2.isEmpty()); // true, empty after clear
		System.out.println(list2.toString()); // shows array with good view
		// works for String and Builder
	}

}
