// this is en example how the teacher done homework 16.
// there is some issue:
// 1. if spaces at the end of string code won't work
// 2. if replaced ';' at the end of string code goes in infinite loop
package Lesson16;

public class Test7 {
	public void email(String s) {

		int a = 0;
		int b = 0;
		int c = 0;

		while (c < s.length() - 1) {
			a = s.indexOf('@', c);
			b = s.indexOf('.', c);
			c = s.indexOf(';', c + 1);
			System.out.println(s.substring(a + 1, b));

		}
	}

	public static void main(String[] args) {
		Test7 emailClass = new Test7();
		emailClass.email("ya@yahoo.com;   on@mail.ru; o@gmail.com; ja@ukr.net; ukr@post.ua; ok@mail.ru.");
	}

}
