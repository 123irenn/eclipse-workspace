package day4;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;
		arr=new int [11];
		System.out.println("Enter the elements:");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements are:");
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
