package Mocktest;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the digits:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		char w=(char)a;
		char x=(char)b;
		char y=(char)c;
		char z=(char)d;
		System.out.println();
		System.out.println(a+"-"+w);
		System.out.println(b+"-"+x);
		System.out.println(c+"-"+y);
		System.out.println(d+"-"+z);
		sc.close();
	}

}
