// work with classes DataTime,Periods,Duration
package Lesson28;

public class Test2 {
	public static void main(String[] args) {
		// LocalDate ld = new LocalDate(2001, 05, 05);
		// Class LocalDate has private construntor we can not create an objects

		// Car c = new Car(); // class Car private constructor

		// example how to create an object of privarte class by creating own method
		// createCar()
		Car c = Car.createCar(); // this arg returns new object class 

	}

}

// example how to create an object of privarte class by creating own method
class Car {
	private Car() {
	}

	static Car createCar() {
		return new Car();
	}
}
