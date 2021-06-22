package Lesson13;

public class Month {

	static void showDayMonths(int nMonth) {
		System.out.println("you input month N# " + nMonth);

		switch (nMonth) {
			case 2:
				System.out.println(nMonth + " has 28days");
				break;
			case 1:
			case 3:
			case 4:
			case 5:
				System.out.println(nMonth + " month has 31days");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println(nMonth + " month has 30days");
				break;
			default:
				System.out.println("wrong month Input");
				break;

		}
	}

	public static void main(String[] args) {

		Month.showDayMonths(1);
		showDayMonths(12);
		showDayMonths(13);
	}

}
