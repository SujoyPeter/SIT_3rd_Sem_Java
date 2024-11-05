package introduction;
public class Arrays {
	public static void main(String[] args) {
		int [] sit = new int[5];
		sit[0]= 11;
		sit[1]= 12;
		sit[2]= 13;
		sit[4]= 14;
		sit[3]= 15;
		int [] arr1 = {11,12,13,14,15};
//		System.out.println(sit[3]);
		for(int i = 0; i< sit.length; i++) {
			System.out.println(sit[i]);
		}
	}
}
