package introduction;
public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int data = 100/0;
			String str = "Sujoy";
			int i = Integer.parseInt(str);
		}catch(ArithmeticException e){
			System.out.println("Exception is :" + e);
		}catch(NumberFormatException e){
			System.out.println("Exception is:" + e);
		}finally {
			System.out.println("Finally code");
		}
		System.out.println("Rest of the code");
	}

}

