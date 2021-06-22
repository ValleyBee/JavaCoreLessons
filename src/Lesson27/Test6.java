// example RE-THROW exceptions
package Lesson27;

import java.io.*;

public class Test6 {

	static void abc() throws FileNotFoundException {
		try {
			File f = new File("testw9.txt");
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException er) {
			System.out.println("blk car4 abc().Sorry" + er.getMessage());
			throw er;
		} finally {
			System.out.println("code runs..");
		}

	}

	static void method() {
		try {
			abc();
		} catch (FileNotFoundException er) {

			System.out.println("blk catch method().Sorry " + er.getMessage());
		}

	}

	public static void main(String[] args) {

		method();

	}
}
