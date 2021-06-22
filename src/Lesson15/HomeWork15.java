package Lesson15;

public class HomeWork15 {

	static void timer2() {

		int hour = 0;
		int min = 0;
		int sec = 0;

		HOUR: while (hour < 6) {

			MIN: while (min < 60) {

				if (hour > 1 && min % 10 == 0) {
					System.out.println("method finished");
					break HOUR;
				}

				SEC: do {

					if (sec * hour > min) {
						System.out.println("new mim started ");
						break SEC;
					}
					System.out.println(hour + ":" + min + ":" + sec);
					sec++;

				} while (sec < 60);
				sec = 0;
				min++;

			}
			min = 0;
			hour++;
		}

	}

	public static void main(String[] args) {

		timer2();
	}

}
