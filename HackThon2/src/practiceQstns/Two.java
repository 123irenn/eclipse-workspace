package practiceQstns;

import java.util.HashSet;

public class Two {

	public static void main(String[] args) {
		HashSet<Integer> N=new HashSet<Integer>();
		N.add(2);
		N.add(5);
		N.add(12);
		N.add(33);
		N.add(83);
		System.out.println("HashSet1:"+N);
		System.out.println();
		HashSet<Integer> N1=new HashSet<Integer>();
		N1.add(20);
		N1.add(12);
		N1.add(33);
		N1.add(45);
		N1.add(90);
		System.out.println("HashSet2:"+N1);
		System.out.println();
		N.retainAll(N1);
		System.out.println("Common Elements:"+N);
		// TODO Auto-generated method stub

	}

}
