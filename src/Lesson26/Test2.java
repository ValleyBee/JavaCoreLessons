// Wrapper classes Integer,Byte,Short,Long,Float,etc... they also has parent class Number
// example Autoboxing and Unboxing
// example method parse()
package Lesson26;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		// here done Autoboxing. converting int to reference data type
		list.add(5);
		System.out.println(list); // output [5] as a list

		// here done Unboxing
		int a = list.get(0);
		System.out.println(a); // output 5 as int

		Integer b = new Integer(10);
		int c = b;
		System.out.println(c);

		// Parrent class Number
		Number d = new Integer(20);
		int e = (int) d; // here we must use casting to convert(unbox)

		// in switch() we can also use Wrapper classes Byte,Short,etc.
		switch (b) {
		}

		// example method parse()
		String s1 = "50";
		String s2 = "true";

		int i1 = Integer.parseInt(s1); // String conver to int
		boolean b1 = Boolean.parseBoolean(s2); // String converts to boolean
		System.out.println(i1 + 5);

		// example method valueOf()
		String s3 = "3.14";
		Double d2 = Double.valueOf(s3); // converts from string and assings parametrs
		System.out.println(s3);

		// for Byte exeption.need casting
		// Byte b3 = Byte.valueOf(10); // output error exeption
		Byte b3 = Byte.valueOf((byte) 10); // ok
	}

}
