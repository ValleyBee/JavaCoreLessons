// Encapsulation methods, we secure our database.not allowed direct access to varaibles
package Lesson22;

//# Example Encapsulation:
// hiding some varaibles from access from outside
// use private access modifier for data to which we don't want to be accessed from outside classes.
public class Human {

	final String sex;
	private String name;
	private StringBuilder surname;
	private int age;
	private int weith;
	private boolean smart;

	// use Constructor to assign final constant varaibles
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
		// #this method make copy of object var and secure it
		// #use this code instead:
			 StringBuilder sb = new StringBuilder(surname);
			 return sb; // returns copy var surname
		//return surname;
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

		// # StringBuilder create Mutable Objects it has method append it can change var
		//  it isn't good for security.
		// to secure it we need make copy of object surname
		// go to method getSurname to see an example. 
		h.getSurname().append("xaxaxa"); // output changed surname;

		System.out.println(h.getSurname());

	}
}
