package Lesson22.HomeWork;

public class Student {

	public StringBuilder getName() {
		StringBuilder stuN = new StringBuilder(name);
		return stuN;
	}

	public void setName(StringBuilder name) {
		if (name.length() > 3) {
			this.name = name;
		}
	}

	public void setCourse(int course) {
		if (course > 1 && course < 5) {
			this.course = course;
		}

	}

	public int getCourse() {
		return course;
	}

	public void setGrade(int grade) {

		if (grade > 1 && grade < 11) {
			this.grade = grade;
		}
	}

	public int getGrade() {
		return grade;
	}

	public void showInfo() {
		System.out.println(" name :" + getName() + " course :" + getCourse() + " grade :" + getGrade());
	}

	private StringBuilder name;
	private int course;
	private int grade;
}

class TestStudent {

	public static void main(String[] args) {

		Student stud = new Student();
		StringBuilder sb = new StringBuilder("Kolja");
		stud.setName(sb);
		stud.setCourse(2);
		stud.setGrade(9);
		stud.showInfo();
	}
}
