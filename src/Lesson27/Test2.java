// Exception Handling. with blocks Try.Catch.Final

package Lesson27;

// Declaration without handling: throws FileNotFoundException
// Declaration without handling: throws Exception
import java.io.*;

public class Test2 {

	/// Exception Handling. check in methods

	File abc() throws FileNotFoundException {
		File f1 = new File("blablabla"); // this file doent exist

		// try {
		FileInputStream fis1 = new FileInputStream(f1);
		// } catch (FileNotFoundException Er) {
		// System.out.println("");
		// }
		// System.out.println("have a nice day...");

		return f1;

	}

	void def() {

		System.out.println("some code");
		try {

			abc();

		}

		catch (FileNotFoundException E) {

			System.out.println("Sorry,file not found: " + E.getMessage());
			E.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Test2 test2 = new Test2();

		// test2.def();

		// Exception Handling.Check in main

		File f = new File("test9.txt"); // this file exists

		try {
			FileInputStream fis = new FileInputStream(f);
			System.out.println("data reading: " + fis.read());

			System.out.println("file closed : ");
			fis.close();

			System.out.println("have a nice day");

		} catch (FileNotFoundException Er) { // check exception
			System.out.println("SORRY,FILE NOT FOUND: " + Er.getMessage());

		} catch (IOException Er) { // check exception
			System.out.println("SORRY,cant read file: " + Er.getMessage());

		} catch (NullPointerException Er) {
			System.out.println("Sorry, " + Er.getMessage());

		} finally {
			System.out.println("final code countinue...");
			// fis.close();
		}
		// // fis.read();

		// FileOutputStream fos = new FileOutputStream(f);
		// fos.write(150);
		// fos.close();

	}

}
