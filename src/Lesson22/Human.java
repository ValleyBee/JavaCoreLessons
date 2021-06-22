// Incapsulation methods, we secure our database.not allowed direct access to var
package Lesson22;

public class Human {

	final String sex;
	private String name;
	private StringBuilder surname;
	private int age;
	private int weith;
	private boolean smart;

	public Human(String sex) {
		this.sex = sex;
		System.out.println(sex);
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean s) {
		smart = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public StringBuilder getSurname() {
		// this code make copy of object var and secure it to
		// prevent to change surname.
		// StringBuilder sb = new StringBuilder(surname);
		// return sb;
		return surname;
	}

	public void setSurname(StringBuilder sn) {
		surname = sn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		if (a > 16 && a < 70) {
			age = a;
		} else {
			System.out.println("sorry, you are out of age");
		}
	}

	public int getWeith() {
		return weith;

	}

	public void setWeith(int w) {
		if (w > 30 && w < 130) {
			weith = w;
		} else {
			System.out.println("Sorry, you are out of weith");
		}
	}

}

class Test {

	public static void main(String[] args) {
		Human h = new Human("male");
		h.setAge(17);
		h.setName("Petriv");
		h.setSurname(new StringBuilder("Kakao"));
		h.setWeith(87);
		h.setSmart(true);

		System.out.println(h.getName());
		System.out.println(h.getSurname());
		System.out.println(h.getAge());
		System.out.println(h.getWeith());
		System.out.println(h.isSmart());

		// method append (StringBuilder) can change var surname
		// it isn't good for security
		// to secure it we need make copy of object surname
		// go to method getSurname to see how
		h.getSurname().append("xaxaxa"); // output changed surname;

		System.out.println(h.getSurname());

	}
}
