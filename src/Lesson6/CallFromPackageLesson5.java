// Calling and creating an object, method from package Lesson5 class Employee.

package Lesson6;

public class CallFromPackageLesson5 {
	public static void main(String[] args) {

		// creat an object from public constructor package Lesson5
		Lesson5.Employee emp5 = new Lesson5.Employee(77);

		emp5.show(); // calling public method from package Lesson5

		System.out.println(emp5.id); // calling public variable from package Lesson5
	}

}
