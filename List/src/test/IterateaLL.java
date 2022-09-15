package test;

import java.util.ListIterator;
import java.util.LinkedList;

public class IterateaLL {

	public static void main(String[] args) {
		LinkedList<Integer> val=new LinkedList<Integer>();
		val.add(4);
		val.add(5);
		val.add(7);
		val.add(9);
		val.add(12);
		System.out.println("Iterated List:");
		ListIterator itr=val.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Iterate list from postion two:");
		ListIterator it=val.listIterator(2);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		// TODO Auto-generated method stub

	}

}
