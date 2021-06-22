// create Objects,Methods and Constractions, call methods from inside other methods

package Lesson5;

public class Human {

	String humanName;
	Car3 humanCar;
	BankAcc humanBank;

	void showInfoHuman() {
		System.out.println(" Human Name " + humanName + " Human car color " + humanCar.carColor + " Human car engine "
				+ humanCar.carEngine + " Human bank acc balance " + humanBank.balance);
	}
}

class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		h.humanName = "Petrov Vasja";
		h.humanCar = new Car3("white ", "turbo Diesel 3.0 ");
		h.humanBank = new BankAcc(1, 200.4);
		h.showInfoHuman();
	}
}

class Car3 {
	Car3(String setColor, String setEngine) {
		carColor = setColor;
		carEngine = setEngine;

	}

	String carColor;
	String carEngine;
}

class BankAcc {
	BankAcc(int setId, double setBalans) {
		id = setId;
		balance = setBalans;
	}

	int id;
	double balance;
}
