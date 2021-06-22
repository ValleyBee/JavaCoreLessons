// VARAGS METHOD 
///varags method (int ... a) or (int[]... array) is more flaxible than just array

package Lesson19;

public class Test2 {

	// varags method (int ... a) is more flaxible than array
	static void summa(String s, int... a) { // same as array int[] a
		int summa = 0;
		for (int i = 0; i < a.length; i++) {
			summa += a[i];

		}
		System.out.println(s + summa);
	}

	// example of output varags arrays
	static void abc(int[]... array) {
		for (int[] i : array) {
			for (int j : i) {

				System.out.print(" " + j);
			}
		}
	}

	// we even can change the main method instead of [] use varags ...
	public static void main(String... args) {

		// we can put as much numbers as we needed.
		summa(" this is total = ", 12, 12, 3, -25);

		// same as above but this is array inpute
		summa(" this is total = ", new int[] { 12, 12, 3, -25 });

		// any numbers of arrays can be used in varags method
		abc(new int[] { 5, 5 }, new int[] { 10, 10 });
	}
}
