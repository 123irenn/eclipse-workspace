package ust;

import java.util.Scanner;

public class small {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First No-");
		int a=sc.nextInt();
		System.out.print("Enter Second No-");
		int b=sc.nextInt();
		System.out.print("Enter third No-");
		int c=sc.nextInt();
		
		
		if(a<=b && a<=c)
		{
			System.out.print("smallest No "+a);
		}
		if(b<=a && b<=c)
		{
			System.out.print("smallest No "+b);
		}
		if(c<=a && c<=b)
		{
			System.out.print("smallest "+c);
		}
		// TODO Auto-generated method stub

	}

}
