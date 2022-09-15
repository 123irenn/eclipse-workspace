package Day7;

import java.util.PriorityQueue;

public class Queue4 {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("Yellow");
		q.add("White");
		q.add("Violet");
		q.add("Black");
		q.add("Rose");
		System.out.println("Elements of first queue:"+q);
		PriorityQueue<String> qu = new PriorityQueue<String>();
		qu.add("Yellow");
		qu.add("Green");
		qu.add("Powder Blue");
		qu.add("Gold");
		qu.add("Gray");
		System.out.println("Elements of Second queue:"+qu);
		q.retainAll(qu);
		System.out.println("The element after comparing two sets:"+q);
		
		// TODO Auto-generated method stub

	}

}
