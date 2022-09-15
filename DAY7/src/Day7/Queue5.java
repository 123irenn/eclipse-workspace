package Day7;

import java.util.PriorityQueue;

public class Queue5 {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("Yellow");
		q.add("White");
		q.add("Violet");
		q.add("Black");
		q.add("Rose");
		System.out.println("Elements of first queue:"+q);
		System.out.println("First Element:"+q.peek());
		// TODO Auto-generated method stub

	}

}
