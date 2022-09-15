package test;

import java.util.LinkedList;

public class AddLast {

	public static void main(String[] args) {
		LinkedList<Integer> val=new LinkedList<Integer>();
		val.add(4);
		val.add(5);
		val.add(7);
		val.add(9);
		val.add(12);
		System.out.print("LinkedList:");
		System.out.print(""+val);
		val.addLast(90);;
		System.out.println();
		System.out.println("Updated List:"+val);
		// TODO Auto-generated method stub

	}

}
