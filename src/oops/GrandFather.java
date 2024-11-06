package oops;

public class GrandFather {
	public void show() {
		System.out.println("Hello from GrandFather");
	}
}
class Father extends GrandFather{
	public void fshow() {
		System.out.println("Hello from Father");
	}
}
class Son extends Father{
	public void sshow() {
		System.out.println("Hello from Son");
	}
}
class Daughter extends Father{
	public void gshow() {
		System.out.println("Hello from Daughter");
	}
}