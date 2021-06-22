package Lesson14;

public class HomeWork14 {

	static void timer() {

		OUTER: for (int hour = 0; hour < 6; hour++) {

			MIN: for (int min = 0; min < 59; min++) {
				if (hour > 1 && min % 10 == 0) {
					System.out.println("method finished");
					break OUTER;
				}
				SEC: for (int sec = 0; sec < 59; sec++) {

					if (sec * hour > min) {
						System.out.println("new mim started ");
						continue MIN;
					}
					System.out.println(hour + ":" + min + ":" + sec);
				}

			}
		}

	}

	public static void main(String[] args) {

		timer();
	}
}
