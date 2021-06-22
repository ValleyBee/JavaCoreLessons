// how return works in try catch finally
// returns current statement of arg
package Lesson27;

import java.io.*;

public class Test5 {

	int abc() {
		try {
			File f = new File("test9.txt");
			FileInputStream fis = new FileInputStream(f);
			return 5;
		} catch (FileNotFoundException er) {
			System.out.println("file not found" + er.getMessage());
			return 10;
		} finally {
			System.out.println("countinue code");
			return 7; // if finally has return it overide returns form try{} and catch()
		}

	}

	public static void main(String[] args) {
		Test5 t5 = new Test5();

		System.out.println(t5.abc());
		// output: first catch() if it have catch
		// then finally{} "countinue code" then others

		System.out.println("---------");

		// example II return type int
		System.out.println(Test5_1.abc2());
		System.out.println("---------");
		// example III return type StringBuilder
		System.out.println(Test5_2.abc3());

	}
}

// example II return type int
class Test5_1 {

	static int abc2() {
		int a = 5;
		try {
			File f2 = new File("tst9.txt");
			FileInputStream fis2 = new FileInputStream(f2);
		} catch (FileNotFoundException er) {
			a = 11;
			System.out.println("sorry," + er.getMessage());
			System.out.println("varaible (a) catch block2 " + a);
			return a;// returns current statement of arg
		} finally {
			a = 10;
			System.out.println("this is finally code blk2");
			System.out.println("varaible (a) finally block2 = " + a);
			// finally has not return so, new arg of var (a) not changed in out returns.
		}
		return a;// returns current statement of arg

	}
}

class Test5_2 {
	static StringBuilder abc3() {
		StringBuilder a = new StringBuilder("Privet");

		try {
			File f3 = new File("testde9.txt");
			FileInputStream fis3 = new FileInputStream(f3);
		} catch (FileNotFoundException er) {
			System.out.println("sorry," + er.getMessage());
			System.out.println("varaible (a) catch block3 = " + a);
			return a;
		} finally {
			a.append(" !!!"); // append same as return
			System.out.println("this is finally code blk3");
			System.out.println("var (a) finall blk3 " + a);
		}
		return a;

	}
}