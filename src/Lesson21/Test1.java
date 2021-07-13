// Ternary operator,overveiw last Lessons
package Lesson21;

public class Test1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
// #Ternary operator
		int c = (a < 7) ? a++ : b++;
		System.out.println("a=" + a + " b=" + b);

		System.out.println(a < 4 ? 11 : "privet");

		// Garbige collector will only consider to erase eligible objects:
		String s = "asd";
		s = null; // s eligible to erase
		s = new String("sss"); // s bacame eligible to erase

	}
}

class Abc {

	// If class doesn't have (public) access modifier(or has a default)
	// then all vars inside this class does not have it too.
	// even you put public access before var like (public int a;)
	// they have to have public access modifier both, class and vars.
	// only in this case they can be called form the other packeges

	// ex.not see form others packeges
	// class Abc{
	// public int a =1;
	// }
	// ex.see form any packeges
	// public class Abc{
	// public int a =1;
	// }
	public Abc() { // error, Recursive construction Abc()
		this();
	}

}
