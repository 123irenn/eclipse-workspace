package DSA;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();//LL Created
		list.add(20);//adding  elements
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Elements in linked:"+list);//printed LL
		
		list.add(2, 60);//adding at specified location
		System.out.println("Linked List:"+list);//print
		
		int n=list.get(4);//accessing
		System.out.println("LinkedList:"+n);
		
		list.set(3, 123);//added at specified location
		System.out.println("LinkedList:"+list);
		
		list.pop();
		System.out.println("LinkedList:"+list);
		
		list.remove(3);
		System.out.println("LinkedList:"+list);
		
		
		list.remove(30);
		System.out.println("LinkedList:"+list);
		
		
		
		
		
	}

}
