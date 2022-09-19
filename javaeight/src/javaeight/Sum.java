package javaeight;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(8);
		li.add(6);
		li.add(4);
		li.add(3);
		li.add(30);
		int sum=li.stream().mapToInt(i->i).sum();
		System.out.println("Sum :"+sum);
		// TODO Auto-generated method stub

	}

}
