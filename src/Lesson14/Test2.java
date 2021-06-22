package Lesson14;

public class Test2 {

	public void time() {

		OUTER: for (int hour = 0; hour <= 23; hour++) {
			System.out.println("begin outer loop");
			INNER: for (int min = 0; min <= 59; min++) {
				System.out.println(hour + ":" + min);
				if (min == 30) {
					break OUTER;
				}

			}
			System.out.println("end outer loop");
		}

	}

	public static void main(String[] args) {

		Test2 t = new Test2();
		t.time();

	}

}
