package oops;
interface Vinita{
	void show();
	void eshow();
}
interface Sinchana{
	void dshow();
}
class Yogi{
	void ashow() {
		System.out.println("Hello from ashow");
	}
}
class Chaya extends Yogi implements Vinita,Sinchana{
	public void show() {
		System.out.println("Hello from show");
	}
	public void dshow() {
		System.out.println("Hello from dshow");
	}
	public void eshow() {
		System.out.println("Hello from eshow");
	}
}
public class Interface {
	public static void main(String[] args) {
		Chaya obj = new Chaya();
		obj.ashow();
		obj.dshow();
		obj.show();
		obj.eshow();
	}
}
