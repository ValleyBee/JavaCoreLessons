package Lesson6;

public class Student {

	public Student(int id1, String name1, String cours1, double rateMath1, double rateEko1, double rateLang1) {
		id = id1;
		name = name1;
		cours = cours1;
		rateMath = rateMath1;
		rateEko = rateEko1;
		rateLang = rateLang1;

	}

	public Student(int id2, String name2, String cours2) {
		this(id2, name2, cours2, 0.0, 0.0, 0.0);

		System.out.println("not enough data to calculate rate ");
	}

	Student() {
	}

	// reason these vars public for task Lesson12 StudentTest
	public int id;
	public String name;
	public String cours;
	public double rateMath;
	double rateEko;
	double rateLang;
}

class StudentTest {

	double avrAllRates(Student stud) { // an example how to receive an argument
		// ------------------------------- into method parametr (String stud) from
		// ------------------------------- outside and use that arg in reference
		// ---------------------------------varaible STUD.rateMath
		double sumaAvr = (stud.rateMath + stud.rateEko + stud.rateLang) / 3;
		System.out.println(" avr. rate  = " + sumaAvr + " - " + stud.name + " - on cours - " + stud.cours);
		return sumaAvr;
	}

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.id = 1;
		st1.name = "Ivanov";
		st1.cours = "phisica";
		st1.rateMath = 20.23;
		st1.rateEko = 45.23;
		st1.rateLang = 66.22;

		Student st2 = new Student();
		st2.id = 2;
		st2.name = "Kukrul";
		st2.cours = "phisition";

		StudentTest sTest = new StudentTest();
		sTest.avrAllRates(st1); // passing an argument st1 to varable stud of method.
		sTest.avrAllRates(st2);

	}

}
