package questions;
public class ReverseString {
	public static void main(String[] args) {
		String str = "Likith";
		String ans ="";
		for (int i=0;i<str.length();i++) {
			ans = str.charAt(i)+ans;
		}
		System.out.println(ans);
	}
}
