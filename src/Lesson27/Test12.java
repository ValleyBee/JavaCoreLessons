// Creating and handling our owm exceptions
package Lesson27;

import java.io.*;

public class Test12 {

	void marathon(int runStyle, int airTemp) throws DisMuscle, TwistedLeg {

		if (runStyle > 12) {
			throw new TwistedLeg("Leg has been twisted because of the speedy running style " + runStyle);

		}
		if (airTemp > 32) {
			throw new DisMuscle("muscle injured cause high temperature " + airTemp);
		}
		System.out.println("everything is ok run continue");

	}

	public static void main(String[] args) {
		Test12 t = new Test12();

		try {
			t.marathon(11, 31);
		} catch (DisMuscle | TwistedLeg er) { // from Java 7 we can use | for multiplay catch
			System.out.println(er.getMessage());
		}
		// catch (DisMuscle er) {
		// System.out.println(er.getMessage());
		// }
		finally {
			System.out.println("You have successfully finished marathon");
		}
	}
}

class TwistedLeg extends Exception {

	TwistedLeg(String msg) {
		super(msg);
	}

	TwistedLeg() {
	}
}

class DisMuscle extends Throwable {
	// RuntimeException
	DisMuscle(String msg) {
		super(msg);
	}

	DisMuscle() {
	}
}