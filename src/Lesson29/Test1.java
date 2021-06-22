// Good example using Interface but next level is lambda level
package Lesson29;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Student st1 = new Student("Kola", 'm', 23, 2, 12.2);
		Student st2 = new Student("Ola", 'f', 22, 2, 10.2);
		Student st3 = new Student("Petka", 'm', 20, 3, 7.0);
		Student st4 = new Student("Julia", 'f', 39, 4, 8.1);
		Student st5 = new Student("Alex", 'm', 24, 5, 11.1);
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);

		StudentInfo si = new StudentInfo();
		FindStudentByGrade fsbg = new FindStudentByGrade();
		// System.out.println(fsbg.testStudent(st1)); // output TRUE
		si.testStudent(list, fsbg);
	}

}

class Student {
	String name;
	char sex;
	int age;
	int course;
	double avgGrade;

	Student(String name, char sex, int age, int course, double avgGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}
}

class StudentInfo {
	void printStudent(Student st) {
		System.out.println("Name of student is " + st.name + ", Gender is " + st.sex + ", Age is " + st.age + ", Course is " + st.course + ", Avarage grade is " + st.avgGrade);
	}

	void testStudent(ArrayList<Student> aL, StudentChecks sc) {

		for (Student s : aL) {
			if (sc.testStudent(s)) { // == FindStudentByGrade.testStudent(st1)
				printStudent(s);
			}

		}
	}
}

interface StudentChecks {
	boolean testStudent(Student s);
}

class FindStudentByGrade implements StudentChecks {
	public boolean testStudent(Student s) {
		return s.avgGrade > 8.5;
	}
}
