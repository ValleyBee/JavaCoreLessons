// HomeWork 16 I was trying to improve my code based what I've learned yet,to make it shorter ;)
package Lesson16;

public class HomeWork16 {

	public static void main(String[] args) {

		String s1 = " ya@yahoo.com;   on@mail.ru; o@gmail.com; ja@ukr.net; ukr@post.ua; ok@mail.ru;   ";

		for (int i = 1; i < s1.length(); i++) {
			i = s1.indexOf("@", i);
			// I used same var (i) in loop and in index to short a code
			// this code assign to (i) a new index of nearest symbol '@' statring
			// search with index of curent count loop (i) ;))

			if (i == -1) {
				// I use (if brake) to stop a loop when (i -1) came to the end of
				// string array and shows -1(end)
				break;
			}

			System.out.println(s1.substring(s1.indexOf('@', i) + 1, s1.indexOf('.', i)));
			// My misstake,at beg.I wanted to use inside (i+1) to cut symbol @ not
			// to have it in output @mail -> mail but (i+1) jumps to another
			// symbol @ and took index of it. after have 16:12 instead of 2:12.
			// so correct use is (i)+1

			System.out.println(s1.indexOf('@', i) + "@ ." + s1.indexOf('.', i));
			// shows index of symbol '@' and '.'

		}
	}

}
