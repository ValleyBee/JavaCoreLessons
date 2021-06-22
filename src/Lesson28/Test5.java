// using methods of class DateTimeFormatter
package Lesson28;

import java.time.*;
import java.time.format.*;

public class Test5 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
		LocalDateTime ldt = LocalDateTime.of(2016, Month.APRIL, 3, 16, 45);
		DateTimeFormatter d1 = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter d2 = DateTimeFormatter.ISO_DATE;
		System.out.println(ld); // output 2016-09-01
		System.out.println(d1.format(ld)); // output 20160901

		// crop everything except date
		System.out.println(ldt); // 2016-04-03T16:45
		System.out.println(ldt.format(DateTimeFormatter.ISO_DATE)); // output only date

		// Creating our owm output by method ofPattern.
		// making output shorter

		// shorter out
		DateTimeFormatter shortForm = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ld.format(shortForm));
		System.out.println(shortForm.format(ld)); // LocalDate&LocalTime also have methods Formatting and because of that
		// we can wright like this. output same as above

		// method Pattern.Creating output
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh.mm");
		System.out.println(myFormat.format(ldt));

		// converting String to DateTime format input string as myFormat2
		DateTimeFormatter myFormat2 = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate stringLD = LocalDate.parse("01 02 2015", myFormat2);
		System.out.println(stringLD);
		// converting String to DateTime input default format
		LocalDate stringLD2 = LocalDate.parse("2015-01-02");
		System.out.println(stringLD2);

	}
}
