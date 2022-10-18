package Mocktest;

import java.util.Scanner;
import java.util.*;

public class NumPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		int i,j,sum,n;
		System.out.println("Enter array size:");
		n=in.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the sum:");
		sum=in.nextInt();
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				
				if(arr[i]+arr[j]==sum)
				{
					if(!(hm.containsValue(arr[i])))
					{
						hm.put(arr[i], arr[j]);
					}
				}
				
			}
		}
		for(Map.Entry m:hm.entrySet()) {
			System.out.println("("+m.getKey()+","+m.getValue()+")");
		}
	}

}
