package Lesson17;

import java.util.Arrays;

public class Test2 {

	// #1 finding min, max arg but array will be sorted.
	void maxMin(int array1[]) {
		Arrays.sort(array1);
		int min = array1[0];
		int max = array1[array1.length - 1];
		System.out.println(" #1 " + "min arg :" + min + " max arg :" + max);
	}

	// #1 finding min, max arg without sorting by using For-each
	void maxMin2(int array1[]) {
		int min = array1[0];
		int max = array1[0];

		for (int i : array1) {
			System.out.print(i + " ");

			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}

		}
		System.out.println(" #2 " + "max :" + max + " min :" + min);

	}

	public static void main(String[] args) {

		int[] array1 = { 2, 1, -3, 5, 4, 7, 9, 10, 15, -1 };

		Test2 ar = new Test2();
		ar.maxMin(array1);
		ar.maxMin2(array1);

		ar.maxMin2(new int[] { 2, 5, -4, 2, 8, 22, 2, 100 }); // passing args calling method

	}

}
