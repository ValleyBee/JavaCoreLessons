// Initializers blocks.priority
// Execution sequence in Java / Importante: depends which statement first varaible or block
//1.Static blocks and varaibles Parent class
//2.Static blocks and varaibles Child class
//3.Non static blocks and varaibles Parent class
//4.Constructor Parent class
//5.Non static blocks and varaibles Child class
//6.Constructor Child class

// 3 and 6 executs only during creating new Object aaaa
package Lesson26;

public class Test5 {
	

	{
		System.out.println("this initial block 3");

	}

	Test5() {
		System.out.println("this construction 1");
	}

	Test5(int a) {
		this();
		System.out.println("this construction 2");
	}

	{
		System.out.println("this initial block 1");
	}

	static {
		System.out.println("this STATIC initial block 1");
	}

	{
		System.out.println("this initial block 2");
	}

	static {
		System.out.println("this STATIC initial block 2");
	}

	public static void main(String[] args) {
		Test5 t1 = new Test5();
		System.out.println("----------------------------------");
		Test5 t2 = new Test5(3);
	}

}

class C {
	String s = "ok";
	{
		System.out.println(s);
	}
	static int i = 0;
	static {
		System.out.println(i);
	}
	static {
		i = i + 1;
		System.out.println(i);
	}

	C() {
		System.out.println("this constructor");
	}

	public static void main(String[] args) {
		C c = new C();
	}
}

class D {

static String str1 = abcStr("first, "); 
//output the first one because of its statement,
// runs method abcStr which is in main block

static { // second and only one time
		abc(2);
	}
	
	

	static void abc(int a) {
		System.out.print(a + " ");
	}

	D() {
		abc(5); // constructor,  the last one 
	}

	static {
		abc(4); // third and only one time
	}
	String str3 = abcStr(" fourth, "); // sixth
	{
		abc(6); // fiveth 
	}
	    static {
	   new D();  // creating an object of class.new D().runs next sequence 6 8 5
	  }

	{
		abc(8); // sixth 
	}

	String str2 = abcStr(" seventh, "); // sixth

	public static void main(String[] args) {
   //D d = new D(); // runs again sequence by creat object and output:  fourth, 6 8 seventh, 5
 
		
}
static String abcStr (String str) {
	System.out.print(str);
	return str;
}
	}


// Execution sequence in Java / Importante: depends which statement first varaible or block
// 1.Static blocks and varaibles Parent class 
// 2.Static blocks and varaibles Child class 
// 3.Non static blocks and varaibles Parent class
// 4.Constructor Parent class
// 5.Non static blocks and varaibles Child class
// 6.Constructor Child class

// 3 and 6 executs only during creating new Object
class Animal {
	Animal() {
		System.out.println("Construction of Animal");
	}

	static {
		System.out.println("Static of Animal");
	}
	{
		System.out.println("Non Static of Animal");
	}
}

class Cats extends Animal {
	Cats() {
		System.out.println("Constructor of Cats");
	}

	static {
		System.out.println("Static of Cats");
	}
	{
		System.out.println("Non Static of Cats");
	}
}

class Lion extends Cats {
	Lion() {
		System.out.println("Constructor of Lion");
	}

	static {
		System.out.println("Static of Lion");
	}
	{
		System.out.println("Non Static of Lion");
	}
}

class AnimalExecute {
	public static void main(String[] args) {
		// Animal a = new Animal();
		Lion l = new Lion();
		
	}
}