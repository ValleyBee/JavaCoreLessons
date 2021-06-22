// work with classes DataTime,Periods,Duration
// all these classes and constructors have /access modifier private/
package Lesson28;

import java.time.*;

public class Test1 {
	public static void main(String[] args) {
		// System.out.println(LocalDate.now());
		// System.out.println(LocalTime.now());
		// System.out.println(LocalDateTime.now());
		LocalDate ld = LocalDate.of(2021, 06, 14);
		LocalDate ld2 = LocalDate.of(2021, Month.JUNE, 14);
		LocalTime lt = LocalTime.of(11, 12, 13);
		LocalDateTime ldt = LocalDateTime.of(2015, Month.MAY, 15, 12, 12, 12);
		LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
		System.out.println(ld);
		System.out.println(ld2);
		System.out.println(ldt);
		System.out.println(ldt2);

		// Add days
		ld2.plusDays(5);
		System.out.println(ld2); // output same days 2021 06 14
		// because these objects are Immutable(can't be change)

		// how add days
		// first way
		LocalDate ld3 = ld2.plusDays(5);
		System.out.println(ld3); // output 2021 06 19
		// second way
		ld2 = ld2.plusDays(15);
		System.out.println(ld2);
		ld2 = ld2.minusDays(10);
		System.out.println(ld2);
		ld2 = ld2.minusDays(1).plusDays(20);
		System.out.println(ld);
		System.out.println(ld.isAfter(ld2)); // output boolean

	}

}
