package introduction;
import java.util.ArrayList;
public class Array_ListA {
	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(10);
	al.add(12);
	al.add(14);
	al.add(1,15);
	al.set(2, 20);
//	al.remove(2);
//	System.out.println(al);
//	System.out.println(al.get(1));
//	System.out.println(al.size());
	for(int i=0; i<al.size();i++) {
		System.out.print(al.get(i)+ " ");
	}
	}
}
