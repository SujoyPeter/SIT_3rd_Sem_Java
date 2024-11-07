package oops;
public class CPoly {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		CPoly obj = new CPoly();
		int a = obj.add(45, 67);
		System.out.println(a);
		System.out.println(obj.add(12,15)); 
		System.out.println(obj.add(10,15,11)); 
		System.out.println(obj.add(55.77, 243.23)); 
	}
}
