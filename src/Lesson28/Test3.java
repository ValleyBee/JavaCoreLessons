// work with classes DataTime,Periods,Duration
package Lesson28;

import java.time.*;

public class Test3 {

	// Method change over by Month
	static void changeOverMonth(LocalDate ldBeg, LocalDate ldEnd) {
		LocalDate dataWhile = ldBeg;
		while (dataWhile.isBefore(ldEnd)) {
			System.out.println("Month passed. It is time for changeover " + dataWhile.getMonth());
			dataWhile = dataWhile.plusMonths(1);
		}
	}

	// Method change over by Period(days,weeks,months,years)
	static void changeOverPeriod(LocalDate ldBeg, LocalDate ldEnd, Period p) {
		LocalDate dataWhile = ldBeg;
		while (dataWhile.isBefore(ldEnd)) {
			System.out.println("Period of " + p.getDays() + " is out. Time for changeover " + dataWhile);
			dataWhile = dataWhile.plus(p);

		}
	}

	public static void main(String[] args) {

		LocalDate ldBeg = LocalDate.of(2016, Month.SEPTEMBER, 1);
		LocalDate ldEnd = LocalDate.of(2017, Month.MAY, 31);
		changeOverMonth(ldBeg, ldEnd);
		System.out.println();
		Period p = Period.ofDays(10);
		changeOverPeriod(ldBeg, ldEnd, p);
	}

}
