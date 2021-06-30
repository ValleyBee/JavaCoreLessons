package Lesson17;

import java.util.Arrays;

public class HomeWork18 {

	public static int[] sortirovka(int[] array1) {

		//{ 4, 1, -3, 0, 64, 12, 7, -1 }
		OUTTER: for (int i = 0; i < array1.length; i++) {

			int min = array1[i];
			int idx = i;

			INNER: for (int j = 1 + i; j < array1.length; j++) {

				if (array1[j] < min) {
					min = array1[j];
					idx = j;  		}									
					}

			if (i != idx) { // works fine without (if), is not necessary. It is possible (i) = (idx) only when value of (min) stays unchanged. This happend when (min) stayed smallest at the end of loop. 
				
				array1[idx] = array1[i]; // replace args { array [idx=0](arg 4) to array [i=2](arg -3) }
				array1[i] = min; // assign  {array [i=2]-3 to }
			
			}
																	}

		return array1;

	}

	public static void showArray(String array2[][]) {
		System.out.print("{ ");

		for (int i = 0; i < array2.length; i++) {

			System.out.print("{");

			for (int j = 0; j < array2[i].length; j++) {

				System.out.print(array2[i][j]);

				if (j != array2[i].length - 1) {
					System.out.print(",");
				}

			}
			if (i != (array2.length - 1)) {
				System.out.print("},");
			} else {
				System.out.print("}");
			}

		}
		System.out.print(" }");

	}

	public static void main(String[] args) {
		int[] array1 = { -7 ,-3, -1, 1, 0, 64, 12, 8, 2 };
		sortirovka(array1);
		for (int k : array1) {
			System.out.print(k + " ");
		}
		System.out.println();

		// String[][] array2;
		// array2 = new String[3][];
		// array2[0][0] = "q00";
		// array2[0][1] = "w01";
		// array2[1][0] = "e10";
		// array2[2][0] = "r20";

		String[][] array2 = { { "q", "w", "y", "j" }, { "e" }, { "r", "t" } };
		// String[][][] array3 = { { "q", "w", "y", "j" }, { "e" }, { "r", "t" }, { "s"
		// } };
		int[][][] array3 = new int[7][6][5];

		
		
		
		
		
		

		showArray(array2);
		showArray(new String[][] { { "F", "O" }, { "R", "E" }, { "V", "A" } });

		System.out.println();
		System.out.println(array2.length);
		System.out.println(array3[1][1].length); // output 5. first floor, first apartment has 5 rooms
	}
}
