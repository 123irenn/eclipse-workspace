package javaeight;
import java.util.List;

import java.util.ArrayList;

public class StringLength {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("Akshay");
		li.add("Adwaith");
		li.add("Krishnapriya");
		li.add("Irene");
		long count=li.stream().filter(n->n.length()>5).count();
		System.out.println("strings with more than string length 5:"+count);
		// TODO Auto-generated method stub

	}

}
