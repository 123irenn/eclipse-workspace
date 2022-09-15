package sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int i,j,min,temp=0;
		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array Before Sorting:");
		for(i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		
		for(i=0;i<=4;i++)
		{
			min=i;
			for(j=i+1;j<4;j++)
			{
				if ( a[j]<a[min])
						{
					       min=j;
					       temp=a[min];
					       a[min]=a[i];
					       a[i]=temp;
					       
					
						}
			}
		}
		System.out.println("After Sorting:");
		for(i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
