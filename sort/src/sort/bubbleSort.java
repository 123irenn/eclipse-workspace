package sort;
import java.util.Scanner;


public class bubbleSort {


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
		
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
			
		}
	System.out.println("After Sorting:");
	for(int i=0;i<=4;i++)
	{
		System.out.println(a[i]);
	}
		
	}
}

