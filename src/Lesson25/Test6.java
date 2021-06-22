// example how to call varaible of interface using reference data type of object
package Lesson25;

public class Test6 implements interface1, interface2 {
	public void abc() {
		System.out.println("ok");
	}

	public static void main(String[] args) {

		Test6 t = new Test6();

		// example how to call varaible of interface using reference data type of object
		System.out.println(((interface1) t).a);

		((interface2) t).abc(); // even did casting all methods call form original class t = Test6. output OK
	}
}

interface interface1 {
	int a = 5;

	void abc();

}

interface interface2 {
	int a = 10;

	void abc();
}
