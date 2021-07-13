// Any array, let's imagine a building with Y-ROWS(Floors), X-COLUMNS
//(Apartments), Z-adds(Rooms) to X-apartments. 
// expamle of ARRAY I prefer to use Y,X intead of i, j. 
// 	X column
// Y |--------------
//   |0 1 2 3 4
// r |1
// o |2
// w |3
//   |4

package Lesson17;

public class Test1 {

	int[] qwe = new int[] { 2, 3, 4 }; // only by this way you can create an
	// array inside class, usualy array must be created inside method.

	void creatingArrays() {

		// -------------- 3 STAGES CREATING ARRAY
		// any array before use must pass 3 stages creating.
		// Declaration,Allocation and Initialization.
		// 3 stages can be done in deferent ways:

		// 1.Declaration
		String[] array2;
		// 2.Allocation
		array2 = new String[3];
		// 3.Initialization
		array2[0] = "prob";
		array2[1] = "test";
		array2[2] = "make";

		// CREATING ARRAY, MIXED or all in one. Decl.Allo.Init.
		int[] array5 = new int[7]; // mixed, creating Declaration and Allocation.

		int[] array6; // Dec. then need Aloc and Init
		array6 = new int[] { 4, 5, 6 }; // This Aloc and Init.

		int array7 = { 1, 2, 3 }; // all in one. creating Decl.Allo.Init.

		// --------------------interesting thigs -----------
		String[] array10, a; // this will create two arrays with name array10,a.

		// this will create two deferent things,int[] array b; var int c;
		int b[], c;
		c = 5;

		int[] d, e[][]; // this will create int[]d; int[][][] e;
		// -------------------------------------------

		// ALLOWED BUT NO NEED
		int[] array8 = new int[] { 8, 9, 0 }; // it is allowed to careate by this
		// way but no needed.
		// String[] array1; or String array9[];
		// int[][] array1; or int array1[][]; or int[] array1[];

		// --- EXAMPLE HOW CAN NOT!!
		// int[] array1; array1={1,2,3}; <--------- CAN NOT BE!!!
		// if started with Declaration(int []) then must be finish with
		// correct Allocation ( = new int)

		// int[] array1 = new int[3]{3,4,5}; // <---- CAN NOT BE!!!
		// error, double initialization int[3] and {3,4,5} even it seem
		// correct not allowed double initializ.

	}

	public static void main(String[] args) {

		// 1.Declaration
		int[][] array3;
		int[] array4;
		// 2.Allocation
		array4 = new int[2];
		// 3.Initialization
		array4[0] = 8;
		array4[1] = 9;

		// EXAMPLES
		array3 = new int[4][2]; // 2D array includes 4 simple arrays. 4 rows with 2 columns.
		array3[0][0] = 1; // row 0
		array3[0][1] = 2; // row 0
		array3[1][0] = 3; // row 1
		array3[1][1] = 4; // row 1

		System.out.println(array3[1][0] + " " + array3[1][1]);

		array3[1] = array4; // rewright args in entire row
		// before agrs of array3 of index [1][0]=3 [1][1]=4; now 8 9
		System.out.println(array3[1][0] + " " + array3[1][1]);
		// output 34<89

		// 2D ARRAY 3X3
		int[][] array = { { 1, 2, 3 }, { 6, 5, 4 }, { 9, 0, 9 } };
		System.out.println(array.length); // output 3 floors
		System.out.println(array[0].length); // output 3 apartmens

		// 3D ARRAY
		int[][][] array6 = { { { 1, 2, 3 }, { 6, 5, 4 }, { 9, 0, 9 } } };

		System.out.println("how many floors = " + array6.length); // output 1 floor
		System.out.println("apartmens = " + array6[0].length); // 3 apartments
		System.out.println("rooms = " + array6[0][0].length); // 3 rooms

		// Arrays can be with deferent numbers of apartm
		// array5 has 3 rows/floors
		// 1st row, 5 ap
		// 2ns row, 2 ap.
		// 3rd row, 7 ap.
		int[][] array5 = { { 1, 2, 4, 4, 5 }, { 1, 2 }, { 7, 6, 5, 4, 3, 2, 1 } };


//#Example creating array with ouput arg
System.out.println();
int i = 2;
String s = new String [] {"a","b","c","d","e"} [i]; // output "c", element of index [i]
System.out.println(s);
	}

}
