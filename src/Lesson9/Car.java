// There are 4 group Varaibles. 
// Also here an example using static method and local var. THIS

// 1.Local, 2.parameter, 3.instance(object),4.Static varaible

//< 1,2, non static varaible or parameter initializated inside a method belongs and visible within current method>
// 3, Instance varaible(object varaible) belongs to entire class 
// 4, static varaible belongs to entire class

package Lesson9; // class = object 

public class Car {

	final int RADIUS = 3; // constant varaible need to name caps lock.

	String color; // object,class varaible
	String engine; // object,class varaible
	static int count;
	int a = 10;

	public static void changeA(int b) { // Static method.
		// this.a = b; // not works. we can't use any non static(local) varaibles inside
		// static method.
		// because static method can works without object.
		// to use a local var.
		// first need to create an object which local var belongs
		// a belongs class Car
		Car c = new Car("Blue", "diesel 3.0"); // creating an object Car
		c.a = b; // now we can use local var a;

	}

	Car(String color, String engine) { // <if we need to use same name of
		// varaible as class(object) varaibles
		// color,engine inside a method we have to use THIS.>

		count++;
		this.color = color; // <this.color - meens use object varaible,without
		// THIS uses local method varaible color>
		this.engine = engine;

	}

	public void showColor() {
		System.out.println("color of Car is = " + color);

	}

	public void changeColor(String color) { // color3 is local parameter.
		System.out.println("Color of the car is chanched " + color);
		// any non static varaible or parameter initialisated inside a method visible
		// only inside.
		int cena = 5000; // cena is Local varaible
		// color = color3;
		cena += 1000;
	}

	public static void main(String[] args) {
		Car c = new Car("blue", "TDI 3.0");
		System.out.println(c.color);
		c.changeColor("black");
		System.out.println(c.color);

	}

}
