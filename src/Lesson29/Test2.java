//Lambda Expressions 
package Lesson29;

import java.util.ArrayList;


public class Test2 {
	public static void main(String[] args) {
		ArrayList<Student2> list = new ArrayList<>();
		Student2 st1 = new Student2("Kola", 'm', 23, 2, 12.2);
		Student2 st2 = new Student2("Ola", 'f', 22, 2, 10.2);
		Student2 st3 = new Student2("Petka", 'm', 20, 3, 7.0);
		Student2 st4 = new Student2("Julia", 'f', 39, 4, 8.1);
		Student2 st5 = new Student2("Alex", 'm', 24, 5, 11.1);
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		StudentInfo2 si = new StudentInfo2();

		// Lambda Expression
		si.testStudent2(list, (Student2 st) -> {return st.avgGrade < 8.5; });
		System.out.println("---------------------------------------------------------------------");
		si.testStudent2(list, st -> {	int z = 5;return st.course > 2; });
		// if assign a few args have to use {return statement}
		System.out.println("---------------------------------------------------------------------");
		si.testStudent2(list, st -> st.age > 22); // short way, if only one statemet

	}

}

interface StudentChecks2 {
	boolean testStudent2(Student2 s);
}

class StudentInfo2 {
	void printStudent2(Student2 st) {
		System.out.println("Name of student is " + st.name + ", Gender is " + st.sex + ", Age is " + st.age
				+ ", Course is " + st.course + ", Avarage grade is " + st.avgGrade);
	}

	void testStudent2(ArrayList<Student2> aL, StudentChecks2 sc) {
		for (Student2 s : aL) {
			if (sc.testStudent2(s)) { // == FindStudentBy...testStudent(st1)
				printStudent2(s);
			}

		}
	}
}

class Student2 {
	String name;
	char sex;
	int age;
	int course;
	double avgGrade;

	Student2(String name, char sex, int age, int course, double avgGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}
}
