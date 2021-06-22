// create Objects,Methods and Constractions, call the methods from the inside anather method

package Lesson5;

public class Car {
	// -------------- #1 setup a cunstructor Car
	Car(String setColor, String setEngine, int setSpeed) { // constructor
		setColor = colorCar;
		setEngine = engineCar;
		setSpeed = speed;
		System.out.println("Object Car is created...");
	}

	String colorCar; // #instant Variables
	String engineCar;
	int speed;

	int speedUp(int addSpeed) { // #1 method speedUp
		speed += addSpeed;
		return speed;
	}

	void showInfoVehicle() { // #2 method showInfo
		System.out.println(" Car color = " + colorCar + " Car engine = " + engineCar + " Current speed = " + speed);
	}

	int carstop(int stopSpeed) { // #3 method carstop
		int newSpeed = speedUp(-stopSpeed); // here calling method #1
		return newSpeed;

	}
}

class Car2 {
	public static void main(String[] args) {
		Car vehicle = new Car("white", "Diesel 3.0", 100); // #1 creat an object Car
		// vehicle.color = "white";
		// vehicle.engine = "Diesel 3.0";
		// vehicle.speed = 100;

		vehicle.speedUp(177);
		vehicle.showInfoVehicle();

		vehicle.speedUp(vehicle.speed + 60);
		vehicle.showInfoVehicle();

		if (vehicle.speed > 400) {
			System.out
					.println(" car must stop, speed > 400" + " Car is stopped speed = " + vehicle.carstop(vehicle.speed));
		}
	}

}