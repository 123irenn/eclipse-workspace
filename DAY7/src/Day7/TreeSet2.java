package Day7;


import java.util.*;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
        set.add("White");  
        set.add("Violet");  
        set.add("Yellow");  
        System.out.println(set);
        System.out.println("After Iteration:");
        Iterator i=set.iterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
          
		// TODO Auto-generated method stub

	}

}
