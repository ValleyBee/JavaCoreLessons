// Any array, let's imagine a building with Y-ROWS(Floors), X-COLUMNS(Apartments), Z-adds(Rooms) to X-apartments. 

package Lesson17;

public class Test3 {

	public static void main(String[] args) {

		int[][][] array1; // 3D array.
		int y = 5;
		int x = 7;
		int z = 3;
		array1 = new int[y][x][z]; // 4-floors building, with 5-apartments each has 8 rooms.
		int count = 1;

		// regular FOR LOOP
		int l1 = array1[y - 1].length;
		System.out.println("lenght " + l1);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < z; k++) {
					array1[i][j][k] = i + j + k;
					System.out.print(" f" + i + ",a" + j + ",r" + k + ":" + array1[i][j][k]);

					// output 0,0,0 - 1st floor, 1st apartment, room n:1
					// output 0,0,1 - same floor,same apartment but room n:2
				}

			}
			System.out.println(" < ROW :" + count);
			System.out.println();
			count++;
		}

		// FOR-EACH LOOP
		count = 1;

		for (int[][] i : array1) {
			// System.out.print(" y");
			for (int[] j : i) {
				// System.out.print(j + " ");
				for (int k : j) {

					System.out.print(k + " ");
				}

			}
			System.out.println(" < row :" + count);
			count++;

		}
	}
}
