// Example how to use instance object varaibels in methods and that methods can be used in deferent classes

package Lesson11;

public class Car {
	String color;
	String engine;
	int doorsQtt;

	public Car(String color, String engine, int doorsQtt) {
		this.color = color;
		this.engine = engine;
		this.doorsQtt = doorsQtt;
	}

}

class CarTest {

	public static void changeQttDoors(Car carT1, int doorsQtt) {
		// this is static non return method has access to all type varaibles can
		// be used without creating an object.
		// here it receive parametrs of object form outside class.
		carT1.doorsQtt = doorsQtt;
		System.out.println("Qtt of doors (form method) changed = " + carT1.doorsQtt);

	}

	public static void changeColor(Car carT1, String color1, Car carT2, String color2) {
		carT1.color = color2;
		carT2.color = color1;
		System.out.println("color car1 changed = " + carT1.color);
		System.out.println("color car1 changed = " + carT2.color);

	}

	public static void main(String[] args) {

		Car car1 = new Car("red", "v8", 2);

		Car car2 = new Car("blue", "tesla", 5);

		System.out.println(" current qtt of doors = " + car1.doorsQtt);
		changeQttDoors(car1, 4);
		System.out.println(" current qtt of doors = " + car1.doorsQtt);

		System.out.println("current color of " + car1 + " car1 = " + car1.color);
		System.out.println("current color of " + car2 + " car2 = " + car2.color);
		changeColor(car1, car1.color, car2, car2.color);

	}

}
