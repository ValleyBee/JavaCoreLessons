package Lesson12;

import Lesson6.Student;

public class StudentTest {

	public static void method1(Student st1, Student st2) {

		if (st1.name.equals(st2.name) && st1.cours == st2.cours && st1.id == st2.id) {
			System.out.println("Students are equal each other");
		}

		else {
			System.out.println("Students are not equal each other");
		}

	}

	public static void method2(Student st1, Student st2) {

		if (st1.name.equals(st2.name)) {
			if (st1.cours == st2.cours) {
				if (st1.id == st2.id) {
					System.out.println("name,course,rate of these students same");

				} else {
					System.out.println("name and course these students same but rate deferent");
				}

			} else {
				System.out.println("name same but courses students not same");
			}

		} else {
			System.out.println("name of students are deferent");
		}

	}

	public static void main(String[] args) {
		Student s1 = new Student(2, "Dima", "math");
		Student s2 = new Student(25, "Dima", "math");
		method1(s1, s2);
		method2(s1, s2);

	}

}
