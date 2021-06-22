// Nested if, Ternury, equals
package Lesson12;

public class Car {
	int doorsQ;
	int enginePower;
	String a3 = "hello";
	String b4 = "hello";

	Car(int doorsQ, int enginePower) {
		this.doorsQ = doorsQ;
		this.enginePower = enginePower;
	}

}

class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car(2, 250);
		Car car2 = new Car(4, 150);

		if (car1.enginePower > car2.enginePower) {

			if (car1.doorsQ > car2.doorsQ) {
				System.out.println("car1 has much more of qtty doors and engine power ");
			} else {
				System.out.println("car1 has much more of qtty doors but less engine power ");
			}
		} else {
			System.out.println("car1 has less engine power than car2 ");
		}

		// operator Ternury (boolean expresion) ? (if true):(if false)
		int a = 10;
		int b = 20;
		int ternury = (a > b) ? a : b;
		System.out.println(ternury);
		// Equals method all clases have it by default
		String a1 = "hellop";
		String b2 = "hello";
		if (a1.equals(b2)) {
			System.out.println("yes,true");
		}

		if (car1.a3.equals(car1.b4)) {
			System.out.println("yes, it is true");
		}

	}
}
