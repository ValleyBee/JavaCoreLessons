package Lesson20;

import java.util.*;
import java.util.Arrays;

public class Test4 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("A");
		StringBuilder sb2 = new StringBuilder("B");
		StringBuilder sb3 = new StringBuilder("C");
		ArrayList<StringBuilder> list = new ArrayList<>();
		list.add(sb1);
		list.add(sb2);
		list.add(sb3);

		System.out.println("with out fore" + list);

		// cloning arraylist with elements. after cloning
		// elements linked to same object
		ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list.clone();

		// output true. object linked to same elements
		System.out.print("Is objects linked to same elements ? ");
		System.out.print(list.get(0) == list2.get(0));
		System.out.println();

		// --- PART II Convert ArrayList to Array
		// also this method returns array type Object
		Object[] array1 = list.toArray();
		for (Object object : array1) {
			System.out.print(" " + object);
		}
		System.out.println();

		// creating new array, lenght 10 with elments of ArratList
		// use method toArray.
		// This method returns array type which we assigned in parameter.?

		StringBuilder[] array2 = list.toArray(new StringBuilder[10]);
		// even you put [0]capacity, less then qtty of args it will extpand by itself

		System.out.println("lenght = " + array2.length);
		for (StringBuilder stringBuilder : array2) {
			System.out.print(" " + stringBuilder); // output A B C null ... null

		}
		System.out.println();
		// Converts Array[] to List. no need use loop for output
		List<StringBuilder> list4 = Arrays.asList(array2);
		System.out.println(list4);

	}
}
