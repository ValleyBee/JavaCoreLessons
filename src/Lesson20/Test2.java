// ArrayList everything about it here!
package Lesson20;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add(0, "zero");// add arg "" to 0 index
		list.set(1, "setted!"); // same as replace

		list.remove(new String("third")); // method remove, removes element from all objects even just created and from
		// arrayslist.because method use equals for searching elements

		for (int i = 0; i < list.size(); i++) {
			System.out.print(" " + list.get(i)); // returns arg of index
		}
		System.out.println();
		System.out.println("---       PART II add,get,remove       ---");
		ArrayList<StringBuilder> list2 = new ArrayList<>();

		StringBuilder sb1 = new StringBuilder("first word1");
		StringBuilder sb2 = new StringBuilder("second word2");
		StringBuilder sb3 = new StringBuilder("third word3");

		list2.add(sb1);
		list2.add(sb2);
		list2.add(sb3);

		// add "!!!" at the end of each elemets sb1,sb2,sb3
		for (int i = 0; i < list2.size(); i++) {
			list2.get(i).append("!!!");
			System.out.print(" " + list2.get(i));
		}
		System.out.println();
		System.out.print("removing whole Object,output without sb1 -> ");
		list2.remove(sb1); // remove use name or index, name elements or objects
		// remove by object returns boolean;

		for (int i = 0; i < list2.size(); i++) {
			list2.get(i);
			System.out.print(" " + list2.get(i));
		}

		System.out.println();
		// remove by index returns datatype of that element
		System.out.println(list.remove(1));

		// PART III addAll
		ArrayList<String> list3 = new ArrayList<>();
		String sb4 = new String("add_all");
		list3.add(sb4);
		list3.add("add_all2");

		list.addAll(list3); // can be object
		list.addAll(1, list3); // can use index to add
		System.out.println();

		for (String string : list) {
			System.out.println(string);
		}

		list.clear(); // clears arrayList
		System.out.println();
		for (String string : list) {
			System.out.println(string);
		}

	}

}
