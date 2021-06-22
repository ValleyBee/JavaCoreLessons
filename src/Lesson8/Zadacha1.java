// using modifiers final and static 

package Lesson8;

public class Zadacha1 {

	// final modifier turns variable into a constant. Static makes it visible
	// everywhere.
	static final double PI = 3.14; // FINAL & STATIC

	public double ploszadKruga(double radi) {
		double result = PI * radi * radi;
		return result;
	}

	// static modifier makes method usable without creating an object.
	static double dlinaOkruznost(double radi) { // STATIC

		double result = 2 * PI * radi;
		return result;
	}

	public void showInfoCircule(double radi) {
		System.out.println("radius = " + radi);
		System.out.println("Plaszad Kruga = " + ploszadKruga(radi));
		System.out.println("Dlina Okruznosti = " + dlinaOkruznost(radi));

	}

	// static modifier Method usable without creating an object.
	static double multiply(double a, double b, double c) { // STATIC

		double result = a * b * c;
		System.out.println("Method multiply " + result);
		return result;

	}

	static void divide(double a, double b) {
		System.out.println("Method divide a / b = " + a / b + " rest of divide = " + a % b);

	}

}

class ZadachaResult {
	public static void main(String[] args) {
		// methods form task 1
		Zadacha1.multiply(2.3, 3.3, 4.4); // static modifier Method usable without creating an object.
		Zadacha1.divide(2, 3);
		System.out.println();

		// Methods from task 2
		Zadacha1.dlinaOkruznost(20); // static modifier makes method usable without creating an object.

		Zadacha1 p1 = new Zadacha1(); // created an object before use methods becase havn't static modifier.
		p1.ploszadKruga(20);
		p1.showInfoCircule(20);

	}

}