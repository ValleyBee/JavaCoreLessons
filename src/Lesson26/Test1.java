// How to rewright methods, example: equals(),toString()

package Lesson26;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {

		Car c1 = new Car("red", "V4");
		Car c2 = new Car("red", "V4");
		Car c3 = new Car("black", "V8");
		Car c4 = new Car("black", "V16");

		ArrayList<Car> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);

		// for method EQUALS()
		System.out.println(c1.equals(c3)); // compars c1 and c3 rewright method
		// EQUALS() now gives TRUE, original gives FALSE

		System.out.println(list.contains(c3)); // if ArrayList contains same element as (c3) then TRUE

		// for method toString()
		System.out.println(c1.toString());
		// before output was Lesson26.Car@28a418fc
		// now car color is red car engine is V4

		// Method ArrayList() has rewrighted method toString() good looking output:
		// [sdasdasd , asdasdasd]
		System.out.println(list);

	}

}

class Car {

	String color;
	String engine;

	Car(String color, String engine) {
		this.color = color;
		this.engine = engine;
	}

	// Rewrighting method EQUALS()
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car c2 = (Car) obj;
			return (color.equals(c2.color) && engine.equals(c2.engine));
		} else {
			return false;
		}
	}

	// Rewrighting method toString()
	public String toString() {
		return " car color is " + color + " car engine is " + engine;
	}
	// before output was Lesson26.Car@28a418fc
	// now car color is red car engine is V4
}