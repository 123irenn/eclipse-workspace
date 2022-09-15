package Day7;

import java.util.PriorityQueue;

public class Queue2 {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("Yellow");
		q.add("White");
		q.add("Violet");
		q.add("Black");
		q.add("Rose");
		System.out.println("The Elements are:"+q);
		q.offer("RED");
		q.add("BLUE");
		System.out.println("After Insertion:");
		System.out.println(q);
		// TODO Auto-generated method stub

	}

}
