package ust;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number -");
		int a=sc.nextInt();
		for (int i=2;i<=a;i++)
		{
		if (a%i==0)
		{
			System.out.println("not prime" +a);
		}
		}
		
		// TODO Auto-generated method stub

	}

}
