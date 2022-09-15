package day4;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;int sum=0;int p=1;
		arr=new int [11];
		System.out.println("Enter the elements:");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			sum=sum+arr[i];
		}
		for(int i=0;i<10;i++)
		{
			p=p*arr[i];
		}
		System.out.println("sum is"+sum);
		System.out.println("product is"+p);
		// TODO Auto-generated method stub

	}
	
}
