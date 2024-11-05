package introduction;
import java.util.Scanner;
public class TakingUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Output is : " + c);
	}
}
