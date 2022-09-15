package ust;

import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First No-");
		int a=sc.nextInt();
		System.out.print("Enter Second No-");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.print("Greatest No "+a);
		}
		else 
		{
			System.out.print("smallest No "+b);
		}
		// TODO Auto-generated method stub

	}

}
