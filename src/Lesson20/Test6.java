package Lesson20;
import java.util.ArrayList;

public class Test6 {


	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("A");
		StringBuilder sb2 = new StringBuilder("B");
		StringBuilder sb3 = new StringBuilder("C");

		ArrayList <StringBuilder> list1 = new ArrayList<>();
		list1.add(sb1);
		list1.add(sb2);
		list1.add(sb3);
ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>)list1.clone();
// cloning list1 to list2 only reference cloned.

	//# METHOD APPEND() Change element inside array in original list1 and cloned list2
list1.get(0).append("!!!"); 
//list1.get(0).append(new StringBuilder("!!!")); same as above
System.out.println("list1 " + list1.get(0)); // output A!!! this is new Object at index 0 list1
System.out.println("list2 " + list2.get(0)); // out put A!!!
System.out.println();

//# METHOS SET()  Doesn't change array but creating a new object"DD"
//  with new reference link at index 0 only list1  
list1.set(0, new StringBuilder("DD")); 
//list1.set(0,sb2); // same as above

System.out.println("list1 " + list1.get(0)); // output DD this is new Object at index 0 list1
System.out.println("list2 " + list2.get(0)); // out put A!!!


System.out.println();

 //#toArray
StringBuilder [] array2 = list1.toArray(new StringBuilder [10]);
Object [] array3 = list2.toArray();

for (StringBuilder sbarray : array2) {
	System.out.println(sbarray);
}


System.out.println();
for (Object object : array3) {
	System.out.println(object);
	
}

	
}




}


