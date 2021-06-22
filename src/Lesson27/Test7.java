// Nested blocks, rulse same as for nested loop
package Lesson27;

import java.io.*;

public class Test7 {
	FileInputStream fis1, fis2;

	public void abc() {

		OUTTER_TRY: try {
			fis1 = new FileInputStream("test9.txt");

			INNER_TRY: try {
				fis2 = new FileInputStream("tsest9.txt");
			} catch (FileNotFoundException er) {
				System.out.println("catch2 sorry " + er.getMessage());
			}

		} catch (FileNotFoundException er) {
			System.out.println("catch2 sorry " + er.getMessage());
		} finally {
			System.out.println("this finally code...");
			try {
				fis1.close();
				fis2.close();
			}

			catch (IOException er) {
				System.out.println("catch close,sorry " + er.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		Test7 t = new Test7();
		t.abc();
	}
}
