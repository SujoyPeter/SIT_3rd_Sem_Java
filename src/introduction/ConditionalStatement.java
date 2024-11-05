package introduction;
public class ConditionalStatement {
	public static void main(String[] args) {
		int a = 10;
		if(a > 10) {
			System.out.println("Inside If");
		}else if(a > 10 || a == 10) {
			System.out.println("Inside Else If");
		}
		else {
			System.out.println("Inside Else");
		}
	}
}
