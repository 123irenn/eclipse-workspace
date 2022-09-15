package test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseList {

	public static void main(String[] args) {
		LinkedList<Integer> val=new LinkedList<Integer>();
		val.add(4);
		val.add(5);
		val.add(7);
		val.add(9);
		val.add(12);
		System.out.println("LinkedList:");
		System.out.print(""+val);
		System.out.println("Reverse List:");
		ListIterator itr=val.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
