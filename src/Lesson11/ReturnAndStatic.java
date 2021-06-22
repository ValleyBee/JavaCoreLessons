// Methods #1 WITH RETURN #2 WITHOUT RETURN 
// Methods #3 #4 HOW TO USE VARAIBLES in void and static methods 

package Lesson11;

public class ReturnAndStatic {

	int a;
	int b = 7;
	static int c = 100;
	int e = 11;

}

class Test1 {
	int e = 100;
	static int e2 = 10;

	// #4 static method uses 4 types of vars. Its own var a,b,c ; Static
	// varaible own class e2; Static var call out ReturnAndStatic.c ;
	// And an instance var, int e, through an object test.e coming into parameter as
	// int e.

	static void summa4(int a, int b, int c, int e) {
		int sum = ReturnAndStatic.c + a + b + c + e + e2;
		System.out.println(" STATIC method 4 var summa4 " + sum);
	}

	// #3 non static method uses types of vars. Its own var a,b,c ; Static
	// varaible own class e2; Static var call out ReturnAndStatic.c ;
	// And an instance var this.e
	void summa3(int a, int b, int c) {
		int sum = ReturnAndStatic.c + a + b + c + this.e + e2;
		System.out.println(" NoN SATIC 3 var method summa3 " + sum);
	}

	// ---------------------------- RETURN METHODS --------------------
	// ----- #2 without return
	static void summa(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("RETURN: result only inside method (summa) " + sum);
	}

	// ----- #1 with return
	static int summa2(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	// ---------------- END RETURN METHODS ------------------------
	public static void main(String[] args) {

		summa(2, 3, 5); // calling method without return, you can only see and use a result within
								// method.

		System.out.println("RETURN: result back from method (summa2) " + summa2(2, 3, 5));
		// calling method with return, you will recieve back a result of it into you
		// current parameter and use it

		// ----- methods #3 #4
		Test1 test = new Test1();
		// creating object for use non static methods
		// and if we need to use instance var
		// in static method
		test.summa3(1, 1, 1);
		// calling non static method

		summa4(1, 1, 1, test.e);
		// calling static method and pass an object var test.e into parametr method

	}

}