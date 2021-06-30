package Lesson17;

import java.util.Arrays;

public class Test2 {

	// #1 finding min, max arg but array has to be sorted.
	void maxMin(int array1[]) {
		Arrays.sort(array1);
		int min = array1[0];
		int max = array1[array1.length - 1];
		System.out.println(" #1 " + "min arg :" + min + " max arg :" + max);
	}

	// #2 finding min, max arg without sorting by using For-each loop
	void maxMin2(int array1[]) {
		int min = array1[0];
		int max = array1[0];

		for (int i : array1) {  
			System.out.print(i + " ");
			if (i > max) {max = i;}
			if (i < min) {min = i;}
		}
				System.out.println(" #2 " + "max :" + max + " min :" + min);
	}

	 // #3 finding min, max arg without sorting by using For loop
void maxMin3(int array1[]){
	int min = array1[0];
	int max = array1[0];
	
	// we can start from (i=1) because we already assign min max [0]
	for ( int i = 1; i < array1.length ; i++)	{  
		if (array1[i] < min){ min = array1[i];}
		if (array1[i] > max){ max = array1[i];} 	}

			System.out.println("#3 " + "min = " + min + " max = " + max);
}


	public static void main(String[] args) {

		int[] array1 = { 2, 1, -3, 5, 4, 7, 9, 10, 15, -1 };

		Test2 ar = new Test2();
		ar.maxMin(array1);
		ar.maxMin2(array1);
		ar.maxMin3(array1);

		ar.maxMin2(new int[] { 2, 5, -4, 2, 8, 22, 2, 100 }); // passing args into the method

	}

}
