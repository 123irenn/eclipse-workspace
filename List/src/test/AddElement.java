package test;

import java.util.LinkedList;

public class AddElement {

	public static void main(String[] args) {
		LinkedList<Integer> val=new LinkedList<Integer>();
		val.add(4);
		val.add(5);
		val.add(7);
		val.add(9);
		val.add(12);
		System.out.println("LinkedList:");
		System.out.print(""+val);
		System.out.println("After Adding:");
		val.add(3, 90);
		System.out.print(""+val);
		// TODO Auto-generated method stub

	}

}
