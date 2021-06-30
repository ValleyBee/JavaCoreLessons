package FinalTests;

public class Test2 {
	
	
		
	
	
	
public static void main(String[] args) {
	



class MyEx extends Exception { }
class MyREx extends RuntimeException {}
class A {
	void method() { throw new MyEx();}
	void method2() {throw new MyREx() ;}
}
}}