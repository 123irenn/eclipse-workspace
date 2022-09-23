package practiceQstns;
import java.util.*;
import java.util.TreeSet;

public class Five {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(56);
		set.add(23);
		set.add(12);
		set.add(14);
		set.add(234);
		System.out.println("TreeSet 1:"+set);
		System.out.println();
	   // int n=set.size();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to check? ");
	    int x=sc.nextInt();
	    sc.close();
		
		TreeSet<Integer> subset=new TreeSet<Integer>();
		subset=(TreeSet<Integer>)set.subSet(set.first(), x);
		Iterator it=subset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
	    
	    
	    
	  	    
	    
	    
	}

}
