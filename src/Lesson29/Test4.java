// Predicate interface whicj already exists in java
// public interface Predicate<Type> var {boolean test(T t); }
// it has method test();


// ArrayList has a method removeIf()
package Lesson29;

import java.util.function.*;
import java.util.ArrayList;

public class Test4 {
	public static void main(String[] args) {
		ArrayList<Student3> list = new ArrayList<>();
Student3 st1 = new Student3("Kola", 'm', 23, 2, 12.2);
Student3 st2 = new Student3("Ola", 'f', 22, 2, 10.2);
Student3 st3 = new Student3("Petkov", 'm', 20, 3, 7.0);
Student3 st4 = new Student3("July", 'f', 39, 4, 8.1);
Student3 st5 = new Student3("Alex", 'm', 24, 5, 11.1);
list.add(st1);
list.add(st2);
list.add(st3);
list.add(st4);
list.add(st5);
StudentInfo3 si = new StudentInfo3();

// Lambda Expression
si.testStudent3(list, (Student3 st) -> {return st.avgGrade < 8.5; });
System.out.println("---------------------------------------------------------------------");
si.testStudent3(list, st -> {	int z = 5;return st.course > 2; });
// if assign a few args have to use {return statement}
System.out.println("---------------------------------------------------------------------");
si.testStudent3(list, st -> st.age > 22); // short way, if only one statemet



// ArrayList has a method removeIf()  it use in arg Predicate<Type>
// output arraylist name which name not ends with 'a'
	for (Student3 s : list) {System.out.println(s.name);}
	System.out.println("---------------------");
	list.removeIf (stud -> stud.name.endsWith("a"));
	for (Student3 s : list) {System.out.println(s.name);	}


	
	}

}


class StudentInfo3 {
	void printStudent3(Student3 st) {
		System.out.println("Name of student is " + st.name + ", Gender is " + st.sex + ", Age is " + st.age
				+ ", Course is " + st.course + ", Avarage grade is " + st.avgGrade);
	}

	void testStudent3(ArrayList<Student3> aL, Predicate<Student3> pst) {
		for (Student3 s : aL) {
			if (pst.test(s)) { // method test() form Pridicate
				printStudent3(s);
			}

		}
	}
}

class Student3 {
	String name;
	char sex;
	int age;
	int course;
	double avgGrade;

	Student3(String name, char sex, int age, int course, double avgGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}
}

