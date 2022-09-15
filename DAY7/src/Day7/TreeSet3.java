package Day7;

import java.util.*;
import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
        set.add("White");  
        set.add("Violet");  
        set.add("Yellow");  
        System.out.println(set);
        Set<String> reverseSet =set.descendingSet();
        Iterator<String> itr = reverseSet.iterator();
        System.out.println("Reverse set contains: ");
        while(itr.hasNext()){
            System.out.println( itr.next() );
		// TODO Auto-generated method stub
            }
	}
}

