// Example abstract class and create ArrayList new object and add args by 
// abstract methods 
package Lesson24;

import java.util.ArrayList;
import java.util.List;

public abstract class TestFlight {

	int speed;
	int width;
	int lenght;

	abstract void addNew(ArrayList<TestFlight> fl, int lenght, int speed, int width);

}

class PassFlight extends TestFlight {

	int maxPassengers;
	int maxCrew;

	public void addNew(ArrayList<PassFlight> fl, int lenght, int speed, int width, int maxPassengers, int maxCrew) {
		fl.get(fl.size() - 1).lenght = lenght;
		fl.get(fl.size() - 1).speed = speed;
		fl.get(fl.size() - 1).width = width;
		fl.get(fl.size() - 1).maxPassengers = maxPassengers;
		fl.get(fl.size() - 1).maxCrew = maxCrew;
		// System.out.println("pass");

	}

	public void addNew2() {
		System.out.println("addNew2");
	}

}

class CargoFlight extends TestFlight {

	int maxCargo;
	int maxWorkers;

	public void addNew(ArrayList<CargoFlight> fl, int lenght, int speed, int width, int maxWorkers, int maxCargo) {
		fl.get(fl.size() - 1).lenght = lenght;
		fl.get(fl.size() - 1).speed = speed;
		fl.get(fl.size() - 1).width = width;
		fl.get(fl.size() - 1).maxCargo = maxCargo;
		fl.get(fl.size() - 1).maxWorkers = maxWorkers;
		// System.out.println("cargo");
	}
}

class Runner {

	public static void main(String[] args) {
		TestFlight ps = new PassFlight();
		PassFlight ps1 = new PassFlight();
		CargoFlight ps2 = new CargoFlight();

		// ArrayList<TestFlight> flightList = new ArrayList<TestFlight>();
		ArrayList<PassFlight> flightList2 = new ArrayList<PassFlight>();
		ArrayList<CargoFlight> flightList3 = new ArrayList<CargoFlight>();

		// first flight arrived

		flightList2.add(new PassFlight());
		ps1.addNew(flightList2, 150, 850, 56, 235, 12);

		// // second flight arrived
		flightList2.add(new PassFlight());
		ps1.addNew(flightList2, 175, 858, 66, 174, 8);

		flightList3.add(new CargoFlight());
		ps2.addNew(flightList3, 211, 655, 78, 12, 600);

		flightList2.add(new PassFlight());
		ps1.addNew(flightList2, 100, 750, 45, 202, 13);

		flightList3.add(new CargoFlight());
		ps2.addNew(flightList3, 251, 650, 71, 5, 500);

		// flightList.addAll(flightList2);
		// flightList.addAll(flightList3);

		ArrayList<TestFlight> flightList = (ArrayList<TestFlight>) flightList2.clone();

		// for (CargoFlight testFlight : flightList3) {
		// // System.out.println(" " + testFlight + " L" + testFlight.lenght + " S" +
		// testFlight.speed + " W"g
		// // + testFlight.width + " W" + testFlight.maxWorkers + " G" +
		// testFlight.maxCargo);
		// }

		// for (PassFlight testFlight : flightList2) {
		// // System.out.println(" " + testFlight + " L" + testFlight.lenght + " S" +
		// testFlight.speed + " W"
		// // + testFlight.width + " P" + testFlight.maxPassengers + " C" +
		// testFlight.maxCrew);
		// }

		for (TestFlight testFlight : flightList) {
			System.out.println(
					" " + testFlight + " L" + testFlight.lenght + " S" + testFlight.speed + "	W" + testFlight.width);
		}

	}

}
