// Caching(handel) exceptions inside other Catcher 
package Lesson27;

public class Test8 {
	void abc() {
		int[] arr = { 1, 2, 4 };

		try {
			System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException er) {

			// ------- Example: exception apears inside block.
			// it must be catch again
			String s = null;
			try {
				System.out.println(s.length()); // this exception can not be catched inside catch by one catch block
				// need additional catch block
				// -------------

			} catch (NullPointerException er2) {
				System.out.println("null pointer catched inner");
			}
		}

		catch (NullPointerException er) {
			System.out.println("sorry " + er.getMessage());
		}

	}

	public static void main(String[] args) {
		Test8 t = new Test8();
		t.abc();

	}

}
