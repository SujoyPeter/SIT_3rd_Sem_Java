package oops;
abstract class Likith{
	/*Non abstract method in abstract class*/
	void show() { 
		System.out.println("hello from show");
	}
	//Abstact method in abstract class
	abstract void pshow();
}
class CSE extends Likith{
	void pshow() {
		System.out.println("Hello from pshow");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		CSE obj = new CSE();
		obj.pshow();
		obj.show();
	}
}
