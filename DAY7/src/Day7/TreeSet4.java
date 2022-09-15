package Day7;

import java.util.*;
import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(12);
		set.add(8);
		set.add(1);
		set.add(66);
		set.add(7);
		System.out.println("Values are:"+set);
		 for (int val:set ) {
			 if(val<7) {
			  
	            
			 System.out.println("Values Less Than 7 are :"+val);
			 }
	        
	        System.out.println();
	    }
		
		
		// TODO Auto-generated method stub

	}

}
