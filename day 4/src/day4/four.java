package day4;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;
		arr=new int [11];
		int s=arr[0];int l=arr[0];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<10;i++)
		{
			if(arr[i]>l)
			{
				l=arr[i];
			}
			else if(arr[i]<s)
			{
				s=arr[i];
			}
		}
		System.out.println("Largest"+l);
		System.out.println("Smallest"+s);
		// TODO Auto-generated method stub

	}

}
