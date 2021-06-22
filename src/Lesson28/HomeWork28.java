package Lesson28;

import java.time.*;
import java.time.format.*;

public class HomeWork28 {
	public static void main(String[] args) {
		TimeTemplate tt = new TimeTemplate();
		LocalDateTime ldt1 = LocalDateTime.of(2016, Month.JANUARY, 1, 12, 00);
		LocalDateTime ldt2 = LocalDateTime.of(2016, Month.DECEMBER, 30, 23, 00);
		Period p = Period.of(0, 1, 2);
		Duration d = Duration.ofMinutes(600);
		tt.changeTimeTamplate(ldt1, ldt2, p, d);
	}
}

class TimeTemplate {
	DateTimeFormatter firstTemplate = DateTimeFormatter.ofPattern("YYYY,MMMM-dd !! hh:mm");
	DateTimeFormatter secondTemplate = DateTimeFormatter.ofPattern("hh:mm,dd/MMM/YY");

	public void changeTimeTamplate(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {

		while (ldt1.isBefore(ldt2)) {
			System.out.println("working FROM " + ldt1.format(firstTemplate) + " TO " + ldt1.plus(p).format(firstTemplate));
			ldt1 = ldt1.plus(p);
			System.out
					.println("closed FROM " + ldt1.format(secondTemplate) + " TO " + ldt1.plus(d).format(secondTemplate));
			ldt1 = ldt1.plus(d);
			System.out.println();

		}
	}

}
