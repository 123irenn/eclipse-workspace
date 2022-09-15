package sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array Before Sorting:");
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=1;i<5;i++)
		{
			
			int k=a[i];
			int j=i-1;
			 while(j>=0 && k <= a[j])  
		        {    
		            a[j+1] = a[j];     
		            j = j-1;    
		        }    
		        a[j+1] = k;    
			
			
		}
		System.out.println("After Sorting:");
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
