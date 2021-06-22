package Lesson27;

import java.io.*;

public class HomeWork27 {
	public static void main(String[] args) {
		Tiger2 t = new Tiger2();
		t.eat("meat");// can throw Unchecked exception. Inessential

		OUTTER: try {
			t.drink("water");

			INNER: try {
				t.drink("cola");
			} catch (IsNotWater er2) {
				System.out.println(er2.getMessage());
			} catch (Exception er) {
				System.out.println(er.getMessage());
			} finally {
				System.out.println("This is INNER finally block");
			} // INNER FINESHED

		} // OUTTER TRY
		catch (RuntimeException er3) {
			System.out.println(er3.getMessage());
		} catch (Exception er4) {
			System.out.println(er4.getMessage());
		}

	}
}

class Tiger2 {
	public void eat(String s) {
		if (!s.equals("meat")) {
			throw new IsNotMeat("Tiger doesn't eat " + s);
		}

		System.out.println("Tiger eats " + s);
	}

	public void drink(String s) throws IsNotWater {
		if (!s.equals("water")) {
			throw new IsNotWater("Tiger doesn't drink " + s);
		}
		System.out.println("Tiger drinks " + s);
	}
}

// Created our own Exceptions

class IsNotMeat extends RuntimeException { // Unchecked class exception. Inessential to catch
	IsNotMeat(String msg) {
		super(msg);
	}
}

class IsNotWater extends Exception { // Essential to catch
	IsNotWater(String msg) {
		super(msg);
	}
}