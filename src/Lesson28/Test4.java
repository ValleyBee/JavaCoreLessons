// work with classes DataTime,Periods,Duration
// Duration and Period  if use chaining (plus(arg).plus(arg2) will be raplaced by the last value
package Lesson28;

import java.time.*;

public class Test4 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);

		Duration d = Duration.ofDays(3);

		// System.out.println(ld.plus(d)); // output Unsuppurted unit
		// we can't add duration to date because localdate doesn't have duration

		// LocalTime has duraton
		// LocalDateTime has duration
		Period p = Period.ofMonths(3);
		LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
		LocalTime lt = LocalTime.of(10, 30);
		Duration d2 = Duration.ofMinutes(3);

		System.out.println(lt.plus(d)); // here we add 3days but we will not see the changings in output of localTime

		System.out.println(ldt.plus(d2).plus(p)); // add 3 minutes

	}

}
