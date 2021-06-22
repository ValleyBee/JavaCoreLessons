//Example handling exceptions
package Lesson27;

import java.io.*;

public class Test11 {
	static FileInputStream fis1, fis2;

	public static void main(String[] args) {
		OUTTER: try {
			fis1 = new FileInputStream("test9.txt");
			System.out.println("inputstream opened");
			INNER: try {
				fis2.close();
			} catch (IOException e) {
				System.out.println("inner catch.can not close file");
			}
		} catch (FileNotFoundException e) {
			System.out.println("outter catch.file not found");
		} catch (NullPointerException e) {
			System.out.println("catch NUllPointerExcpt");
		} finally {
			System.out.println("code finished");
		}
	}
}
