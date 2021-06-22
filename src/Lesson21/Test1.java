// Ternary operator,overveiw last Lessons
package Lesson21;

// impor java.*; no errors but it doesn't import anything

// EX. I - Not allowed import.
// error, Java doesn't know from where to call class A, p1 or p2 ??
// import package p1.A; // import Class A
// import package p2.A; // import Class A

// EX. II - Import allowed but confuse compilator.
// import package p1.*; // import all Classes
// import package p2.*; // import all Classes
// A n = new A(); // error, need use full names p2.A

// EX. III - Import allowed no errors but not good practice.
// import package p1.*; // import all Classes
// import package p2.A; // import Classe A
// A n = new A(); // no error, Java will call p2.A

// EX. IV - Import allowed, no errors ,good practice.
// import package p1.*; // import all Classes
// import package p2.*; // import all Classes
// p2.A n = new p2.A();

public class Test1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int c = (a < 7) ? a++ : b++;
		System.out.println("a=" + a + " b=" + b);

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
