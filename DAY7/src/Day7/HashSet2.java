package Day7;

import java.util.*;
public class HashSet2 {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		set.add("Yellow");
		set.add("Violet");
		set.add("Red");
		set.add("Green");
		set.add("Gray");
		System.out.println("Elements of Set1:"+set);
		HashSet<String> Aset=new HashSet<String>();
		Aset.add("Black");
		Aset.add("Violet");
		Aset.add("Rose");
		Aset.add("Lilac");
		Aset.add("Gold");
		System.out.println("Elements of Set1:"+Aset);
		set.retainAll(Aset);
		System.out.println("Elements Same on both:"+set);
		// TODO Auto-generated method stub

	}

}
