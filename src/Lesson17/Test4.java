//SORTING ARRAY
package Lesson17;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {

		int[] array1 = { 8, 2, -3, 6, 5, 0, 7, 8 };
		int[] array2 = { 8, 2, -3, 6, 5, 0, 7, 8 };

		int index = Arrays.binarySearch(array1, -3); // asign unsorted array

		for (int i : array1) {
			System.out.print(i + " ");
		}
		Arrays.sort(array1); // Sorted
		System.out.println();
		for (int i : array1) {
			System.out.print(i + " "); // output after sorted
		}
		System.out.println();
		int index2 = Arrays.binarySearch(array1, -3); // return index of arg
		// binary search search correctly only with sorted array
		System.out.println(index2); // sorted. output for(-3) is 0, correct.

		index2 = Arrays.binarySearch(array1, 3);
		System.out.println(index2); // sorted. output for (3) is -4
		// actuly we don't have arg 4 but binsearch consider if it was it would be
		// on position -4, cut minus arg(4) on posit. 4 between -3 0 2(4)5.

		System.out.println(index); // unsorted allways returns -1 even arg exists.

		// --------------
		array1[array1.length - 1] = 10;

		// ----- (equals or ==) don't work even array sorted.
		Arrays.sort(array2);
		System.out.println(array1.equals(array2));
		System.out.println(array1 == array2);

	}

}
