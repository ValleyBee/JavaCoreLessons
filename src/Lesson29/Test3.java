//Example using Lambda expresion
package Lesson29;

public class Test3 {

	static void def(Test5 t){
		System.out.println(t.abc("privat"));
	}
	static void def2(Test6 t){
		System.out.println(t.abc2());
	}
	public static void main(String[] args) {
		def( (String string) -> {return string.length();});	
		def( string -> string.length()); // short way
		def( string -> {string ="poka"; return string.length();}); // change var in method
	
		def2(() -> 5); // interface Test6  no args only return int
	
		// def( (string) -> string.length() );
	// def() (x,y) -> string.length() );
	// method( (int x, int y -> {int z=5; return 10;}) );
	
	
	} 
// Explanation  def(string -> string.length()
//First must be (String s) -> Second  must be return type(int abc) string.lenght outputs numbers 
}

interface Test5{
	int abc (String s);
}
interface Test6{
	int abc2();
}