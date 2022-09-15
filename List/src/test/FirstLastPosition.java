package test;

import java.util.*;
import java.util.LinkedList;

public class FirstLastPosition {

	public static void main(String[] args) {
		LinkedList<Integer> val=new LinkedList<Integer>();
		val.add(4);
		val.add(5);
		val.add(7);
		val.add(9);
		val.add(12);
		System.out.println("LinkedList:");
		System.out.print(""+val);
		val.addFirst(10);
		val.addLast(12);
		System.out.println();
		System.out.println("After Updating List");
		System.out.println(val);
		
		// TODO Auto-generated method stub

	}

}
