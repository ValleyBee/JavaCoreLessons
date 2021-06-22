package Lesson1;

// PLAYER CLASS
public class Player {
	int number = 0; // where the guess goes

	// VOID GUESS
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I ma guessing .. " + number);
	} // end of Method
} // end of class
