package test;

import java.util.LinkedList;

public class GetFirstLast {

	public static void main(String[] args) {
		LinkedList<Integer> val=new LinkedList<Integer>();
		val.add(4);
		val.add(5);
		val.add(7);
		val.add(9);
		val.add(12);
		System.out.print("LinkedList:");
		System.out.print(""+val);
		System.out.println();
		System.out.println("1st Element:"+val.getFirst());
		System.out.println("last Element:"+val.getLast());
		
		
		// TODO Auto-generated method stub

	}

}
