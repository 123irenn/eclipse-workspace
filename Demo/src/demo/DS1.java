package demo;

import LinkedList


public class DS1 {
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
	    public void show()
	    {
	      Node node=head;
	      
	      while(node.next!=null)
	      {
	        System.out.println(node.data);
	        node=node.next;
	      }
	      System.out.println(node.data);
	    }
	    public void delete(int index)
	    {
	      if(index==0)
	      {
	        head=head.next;
	      }
	      else
	      {
	        Node n=head;
	        Node n1=null;
	        for(int i=0;i<index-1;i++)
	        {
	          n=n.next;
	        }
	        n1=n.next;
	        n.next=n1.next;
	        System.out.println("After Deleting :");
	        show();
	       
	     
	      }
	    }

	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.show();
		list.delete(2);
		// TODO Auto-generated method stub

	}

}
