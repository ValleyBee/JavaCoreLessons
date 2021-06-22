// Examp. use Encapsulation methods to access data from Lesson22.Human

package Lesson22.P1;

import Lesson22.Human;

public class TestHuman {
	public static void main(String[] args) {
		Human h = new Human("female");
		h.setAge(18);
		h.setName("Peshik_korob");
		h.setWeith(66);
		h.setSmart(true);

		System.out.println(h.getName());
		System.out.println(h.getAge());
		System.out.println(h.getWeith());
		System.out.println(h.isSmart());
		System.out.println(h.getSurname());

	}

}
