// Example abstract class and create ArrayList new object and add args by constructors 
package Lesson24;

import java.util.ArrayList;
import java.util.List;

abstract class FlightTest {

	FlightTest(int lenght, int speed, int width) {
		this.lenght = lenght;
		this.width = width;
		this.speed = speed;
		// System.out.println("cons FlightTest");
	}

	int speed;
	int width;
	int lenght;

}

class FlightPass extends FlightTest {

	FlightPass(int lenght, int speed, int width, int maxPassengers, int maxCrew) {
		super(lenght, speed, width);

		this.maxPassengers = maxPassengers;
		this.maxCrew = maxCrew;
		// System.out.println("cons Passflight");
	}

	int maxPassengers;
	int maxCrew;
}

class FlightCargo extends FlightTest {

	FlightCargo(int lenght, int speed, int width, int maxWorkers, int maxCargo) {
		super(lenght, speed, width);

		this.maxCargo = maxCargo;
		this.maxWorkers = maxWorkers;
		// System.out.println("cons Passflight");
	}

	int maxCargo;
	int maxWorkers;
}

class Run {
	public static void main(String[] args) {

		ArrayList<FlightPass> flightList = new ArrayList<FlightPass>();
		ArrayList<FlightCargo> flightList2 = new ArrayList<FlightCargo>();

		flightList.add(new FlightPass(150, 850, 56, 235, 12));
		flightList.add(new FlightPass(175, 858, 66, 174, 8));
		flightList.add(new FlightPass(155, 859, 69, 205, 11));
		flightList2.add(new FlightCargo(211, 655, 78, 12, 600));
		flightList2.add(new FlightCargo(251, 650, 71, 5, 500));

		// ArrayList<FlightTest> flightList3 = (ArrayList<FlightTest>)
		// flightList.clone();
		// flightList3.addAll(flightList2);

		for (FlightPass testFlight : flightList) {
			System.out.println(" " + testFlight + " L" + testFlight.lenght + " S" + testFlight.speed + " wd"
					+ testFlight.width + " P" + testFlight.maxPassengers + " C" + testFlight.maxCrew);

		}

		for (FlightCargo testFlight : flightList2) {
			System.out.println(" " + testFlight + " L" + testFlight.lenght + " S" + testFlight.speed + " wd"
					+ testFlight.width + " W" + testFlight.maxWorkers + " G" + testFlight.maxCargo);
		}

	}
}
