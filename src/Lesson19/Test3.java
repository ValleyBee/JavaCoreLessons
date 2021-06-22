//Array StringBuilder contains arrays objects sb1,sb2,sb3
// output performed by foreach loop
package Lesson19;

public class Test3 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Privet");
		StringBuilder sb2 = new StringBuilder("Pkapisa");
		StringBuilder sb3 = new StringBuilder("Warszawa");
		StringBuilder[] array = { sb1, sb2, sb3 }; // array contains arrays objects

		for (StringBuilder stringBuilder : array) {
			// this din't change objects but replaced output by new object(new)
			stringBuilder = new StringBuilder("Hello");
			System.out.println(stringBuilder);

		}
		System.out.println();
		for (StringBuilder stringBuilder : array) {
			// append din't change objects only output by add string
			stringBuilder.append(" java");
			System.out.println(stringBuilder);
		}

	}

}
