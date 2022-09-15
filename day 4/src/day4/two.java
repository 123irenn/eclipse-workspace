package day4;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;int f=0;
		arr=new int [11];
		System.out.println("Enter the elements:");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched:");
		int n=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(arr[i]==n)
			{
				f=1;
			}
		}
		if(f==1)
		{
			System.out.println("Number is present");
		}
		else 
		{
			System.out.println("not present");
		}
	}

}
