// inheritance method
// overriden and hiding method
package Lesson23;

public class Test4 {
	public static void main(String[] args) {
		Animal2 a = new Mouse2();
		a.showInfo(); // output "animal Mouse"

		// Example I method nick() not overriden. has access static.
		Mouse2 m = new Mouse2();
		m.showNickAnimal();// output "Nick of animal Animal"
		m.showNickMouse(); // output "Nick of animal Jerry"

		// Example I method nick() overriden.
		// m.showNickAnimal();// output "Nick of animal Jerry"
		// m.showNickMouse(); // output "Nick of animal Jerry"

	}

}

class Animal2 {

	static String nick() {
		return "Animal ";
	}

	String showName() {
		return "some animal ";
	}

	void showInfo() {
		System.out.println("name of animal " + showName());
	}

	void showNickAnimal() {
		System.out.println("Nick of animal " + nick());
	}
}

class Mouse2 extends Animal2 {

	// Mouse2 inheritance method showInfo() from Animal
	// ....here you can imagine showInfo();

	String showName() {
		return "Mouse";
	}

	static String nick() {
		return "Jerry";
	}

	void showNickMouse() {
		System.out.println("Nick of animal " + nick());
	}
}
