package FinalTests;

public class Test1 {
	protected String str = " Parent";
	public String method(){
		return str;
	}}
	
	//public static void main(String[] args) {
		// for ( int i =0, k =1; i <5; i++, k += 2) {
			// for ( int j =0; j< 5 - k /2 ; j++ ) {
				// System.out.println(' ');
			// }
			// for ( int j = 0; j < k; j++ ){
				// System.out.println('*');
			// }
			// System.out.println();
		// }

		// for ( short i = 32766; i < 032767; i++){
			// System.out.println(i);
		// }



public class Child extends Test1 {
	String str = " Child";

	public String method() {
		String str = " this str";
		return str;
	}
	public static void main(String[] args) {
		Test1  parent = new Child();
		System.out.println(parent.method());
		System.out.println(parent.str);
	}
}



	
	
	
	
	

		
	








