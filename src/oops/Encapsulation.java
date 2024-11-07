package oops;
class Student{
	private String name = "Sujoy";
	public String getName() {
		return name;
	}
	public void setName(String a) {
		this.name=a;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.getName());
		obj.setName("Rohan");
		System.out.println(obj.getName());
	}

}
