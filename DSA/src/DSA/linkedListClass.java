package DSA;


public class linkedListClass {
	Node head;
	 class Node 
	{
	  int data;
	  Node next;
	}

	

	 public void insert(int data)
	  {
	    Node node=new Node();
	    node.data=data;
	    node.next=null;
	    
	    if(head==null)
	    {
	      head=node;
	    }
	    else
	    {
	      Node n=head;
	      while(n.next!=null)
	      {
	        n=n.next;
	      }
	      n.next=node;
	    }
	  }
}


