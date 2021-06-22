// How to manage exceptions. with blocks Try.Catch.Final
package Lesson27;

public class Test3 {

	public static void main(String[] args) {
		int[] Array = { 1, 2, 5 };
		System.out.println("we have an Array");

		// TRY
		try {
			System.out.println(Array[5]);
			System.out.println("have a nice day");
		} catch (ArrayIndexOutOfBoundsException Er) {
			System.out.println("...SORRY, OUT OF ARRAY! " + " original error is : " + Er.getMessage());
		} finally {
			System.out.println("finaly block");
		}
		System.out.println("continue running program...");
	}

}
