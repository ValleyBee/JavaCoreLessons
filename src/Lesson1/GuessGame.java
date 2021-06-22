package Lesson1;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	// START GAME
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println(" I am thinking of a nubmer between 0 and 9...");

		while (true) {
			System.out.println("Number to guess is " + targetNumber);

			// call guess method -> public class Player -> public void guess
			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("Player ONE guessed number " + guessp1);
			guessp2 = p2.number;
			System.out.println("Player TWO guessed number " + guessp2);
			guessp3 = p3.number;
			System.out.println("Player THREE guessed number " + guessp3);

			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner ");
				System.out.println("Player ONE is got it right ? " + p1isRight);
				System.out.println("Player TWO is got it right ? " + p2isRight);
				System.out.println("Player THREE is got it right ? " + p3isRight);
				System.out.println("The game is over");
				break;
			} else {
				System.out.println(" Let's try aganin");
			} // end of else
		} // end of loop

	} // end of Method

} // end of class
