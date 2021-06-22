// method receiving in its parameters (args) form commans line, and from severel
// arrays then compare with ([]args) and replace by "null" if found equals  
//
package Lesson19;

public class HomeWork19 {

	static void abc(String[] args, String[]... s) {

		// Declaration and Allocation all in one
		// Alocation must be done before use, numbers of floors s2[floors][]
		// Initialization, numbers of ap and rooms, can be done in for loop

		// String[][] s2 = new String[s.length][]; // Dec & Aloca all in one
		int index;
		String[][] s2, s3;
		s2 = new String[s.length][]; // use for output before
		s3 = new String[s.length][]; // use for output after

		// part I - arguments of all input arrays ()...s) go into [][]new
		// array(s2),(s3)

		// Part II - INNER LOOP compare with ([]args) and replace by (null) if
		// found in array (s2). Array s2,s3[][] created by Part I.
		// s2 remains unchanged, s3 changes according to args[]

		// PART I
		OUTER: for (int i = 0; i < s.length; i++) {
			s2[i] = new String[s[i].length];
			s3[i] = new String[s[i].length];
			MIDLE: for (int j = 0; j < s[i].length; j++) {
				s2[i][j] = s[i][j];// use for output before
				s3[i][j] = s[i][j];// output after

				// PART II
				INNER: for (int k = 0; k < args.length; k++) {
					index = s2[i][j].indexOf(args[k], 0);
					if (index != -1) {
						s3[i][j] = null;
					}
				}
			}
		}

		// OUTPUT
		System.out.println("---- String before ----- ");
		for (String[] i : s2) {
			for (String j : i) {
				System.out.print(j + " ");
			}
		}

		System.out.println();

		System.out.println("----- String after ----------");

		for (String[] i : s3) {
			for (String j : i) {
				System.out.print(j + " ");
			}
		}

	}

	public static void main(String[] args) {

		String[] sb1 = new String[] { "privet", "Hellp", "Czeszc", "Bardzo", "ok5" };
		String[] sb2 = new String[] { "Java", "C#", ".NET", "ok4" };
		String[] sb3 = new String[] { "Julia", "Mark", "ok3" };
		// String[] args = new String[] { "Hellp", "qweer", "privet", "Bardzo" };

		abc(args, sb1, sb2, sb3, new String[] { "privet", "veryCool" });

	}

}
