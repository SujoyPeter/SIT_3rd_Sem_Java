package oops;
class Bike {
	public void show() {
		System.out.println("Hello from Bike");
	}
}
class BMW extends Bike{
	public void show() {
		System.out.println("Hello From BMW");
	}
}
public class RPoly {
	public static void main(String[] args) {
		Bike obj = new BMW();
		obj.show();
	}
}
