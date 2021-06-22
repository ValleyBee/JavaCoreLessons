package Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test5 {
	public static void main(String[] args) {
		String s = "A";
		String s1 = "B";
		String s2 = "C";
		String s3 = "D";
		ArrayList<String> list = new ArrayList<>();
		list.add(s3);
		list.add(s);
		list.add(s2);
		list.add(s1);
		ArrayList<String> list2 = list;
		ArrayList<String> list3 = new ArrayList<>(list);
		System.out.println(list);

		Collections.sort(list); // Sorting strings
		System.out.println(list);
		System.out.println(list.equals(list2));
		// equls in ArrayList works correctly, true, but elemets have to be in
		// the same order 1,2,3,4 etc...
		System.out.println(list.equals(list3));

		// Iterrator is as repiter
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

	}
}
