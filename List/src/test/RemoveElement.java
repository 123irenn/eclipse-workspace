package test;

import java.util.LinkedList;

public class RemoveElement {

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
		val.remove(3);
		System.out.println("List after removing:");
		System.out.println(val);
		// TODO Auto-generated method stub

	}

}
