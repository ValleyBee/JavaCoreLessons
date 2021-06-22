package Lesson24;

public class Test1 {
	public int tt = 1;

	public Test1(int a) {
		System.out.println("test1 cons1");
	}

	public Test1() {
		System.out.println("Lesson24.test1 cons2 default");
	}

	public void abc() {
		System.out.println("method from test1");
	}

	public static void main(String[] args) {
		Test3 t1 = new Test3();

	}
}

class Test3 extends Test1 {
	// public Test3(int b) {
	// System.out.println("test3 cons");
	// }

	public void abc() {
		System.out.println("Test3");
	}
}
