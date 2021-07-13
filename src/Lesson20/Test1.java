// ArrayList everything about it.
// ARRAYList has capacity by default 10 objects type String
// ArrayList no need use forloop 
package Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		// if you creating ArrayList without <DataType> it will create with datatype <Object> by defaut. 
		// Object as datatype can contain any reference datatype except primitive(int,shot etc) 

		list.add("Privet");

		Car c = new Car();
		list.add(c);

		list.add(new String("Hello!"));

		System.out.println("list size " + list.size()); // size 3
		// but better to create an ArrayList with same datatype input
		ArrayList<String> list2 = new ArrayList<String>();

		List<String> list3 = new ArrayList<>(); // same as above

		list3.add("text1");
		list3.add("text2");

		ArrayList<String> list4 = new ArrayList<>(list3);
		// Creating list4 with same args as list3
		// if <datatype> empty it creates an object <datatype> by default
		// even use(list3) for creating list4

		// -- checking as they are same use defernt methods
		System.out.println("list3 size " + list3.size()); // size 2
		System.out.println("list4 size " + list4.size()); // same as list3 size 2

		// method (==) only compares links but not value list3,list4
		// they are linked to deferent objects, output false
		System.out.println(list4 == list3); // false

		// method (equals) compares value of args of these two ArrayLists, output true
		// true even created list3 <String> and list4 <object>
		System.out.println(list4.equals(list3)); // output true

		// lets check as they realy have same args
		for (String i : list3) {
			System.out.print(" " + i);
		}
		for (String i : list4) {
			System.out.print(" " + i);

		}

	}

}

class Car {
}
