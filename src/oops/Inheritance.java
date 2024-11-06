package oops;
public class Inheritance {
	public static void main(String[] args) {
//		Dog newton = new Dog();
//		newton.breed();/*Single Inheritance */
//		newton.legs();
		Puppy jimmy = new Puppy();
		jimmy.breed();
		jimmy.weep();/* Multilevel inheritance*/
		jimmy.legs();
	}
}
