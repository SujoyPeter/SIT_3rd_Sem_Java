package introduction;
public class TypeCasting {
 public static void main(String[] args){
	int a = 10;
	long b = a;
	double c = b;//Widening or Implecit
//	System.out.println(a);
//	System.out.println(b);
//	System.out.println(c);
	double d = 174.76;//Explecit Or
	long e = (long)d;//Shortning Or
	int f = (int) e;// Narrowing
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
 }
}
