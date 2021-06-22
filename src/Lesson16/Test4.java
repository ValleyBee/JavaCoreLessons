// everything about method String, in Test1 - 6
package Lesson16;

public class Test4 {

}

class Employee {

	double salary;
	boolean isMang;

	Employee(double salary, boolean isMang) {
		this.isMang = isMang;
		this.salary = salary;
	}
}

class EmployeeTest {

	public static void main(String[] args) {

		Employee em = new Employee(100.4, true);
		/*
		 * System.out.println(em.isMang + em.salary); boolean + double or int can't be *
		 * incompatible data types
		 */
		System.out.println(" is Manager ? " + em.isMang + " salary " + em.salary);

		String s = null;
		s += "ok"; // output be nullok because null also arg in this case
		System.out.println(s);

		String s1 = " HELLO WORLD 123!";
		String s2 = " people on the earth !!! ";
		s1 = s1.toLowerCase();
		s2 = s2.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);

		boolean b = s1.contains("123"); // output true if s1 contains string 123
		System.out.println(b);

		// example of chaining methods. doing from left to right step by step.
		// discription: concar add strings s1 and s2, trim cuts spacese, replaece
		// strings, substring takes string from index 6 to 10(10not included)
		String s3 = s1.concat(s2).trim().replace("123!", " one two three ").substring(6, 10); // output 'worl'
		System.out.println(s3);

		// substring takes string from index(w) index can be char symbol.
		System.out.println(s1.substring(s1.indexOf('w'))); // s1 = HELLO WORLD 123! index(w) = 6. show from 6 till end

	}
}