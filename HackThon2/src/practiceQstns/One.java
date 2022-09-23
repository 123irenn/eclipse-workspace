package practiceQstns;
import java.util.*;

public class One {

	public static void main(String[] args) {
		HashSet<Integer> N=new HashSet<Integer>();
		N.add(2);
		N.add(5);
		N.add(12);
		N.add(33);
		N.add(33);
		System.out.println("HashSet:"+N);
		Set<Integer> Tree_set=new TreeSet<Integer>(N);
		System.out.println("TreeSet Elements:");
		for(Integer x:Tree_set)
		{
			System.out.println(x);
		}
		
		

	}

}
