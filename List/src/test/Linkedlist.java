package test;
import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> val=new LinkedList<Integer>();
		val.add(4);
		val.add(5);
		val.add(7);
		val.add(9);
		val.add(12);
		 System.out.println(""+val);
		 val.add(val.size(),2);
		 System.out.println(val);
		// TODO Auto-generated method stub

	}

}
