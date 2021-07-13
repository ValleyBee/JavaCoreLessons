//#EX 1 how works return.
//#EX 2 return works as brake point of unreachable statement. 
//#EX 3 where the place return in code ?

package Lesson21;

public class Test3 {

	//EX #1 how works return
	int abc2(){
		return 7;
	}
	
	
//#EX 2 return works as brake;
	static void abc(int c) {
		int a = 1;
		System.out.println("static abc a + c = " + a + c); // output 199
		if (a + c < 101) {
			a++;
			return; // return works as brake;
		//after this point everything is unreachable
		}
		// this point of unreachable statement after return no any code will run
		System.out.println("unreachable " + a);

	}

 //#EX 3 return has to be at the end of a part running code of the method,
 // but not nessasery at the end(finish line) of method. 
	static int abc2(int i) {
		if (i > 10) {
			return 6; // a part of code. return can be also a statement
		} else {
			return 13; // second part. return can be also a statement
			// if remove return , error
		}

	}

	public static void main(String[] args) {
		int a = new Test3().abc2(); // now, var a has output of methods abc2 = 7
		System.out.println("abc " + a);
		System.out.println("abc " + new Test3().abc2()); // same as obove
		
		
		System.out.println("static abc2 " + abc2(11));
		System.out.println("static abc2 " + abc2(4));

		// call method int as char
		abc('c'); // char 'c' has number 99 so it can be int var

		
	}
}
