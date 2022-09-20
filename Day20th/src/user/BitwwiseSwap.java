package user;

import java.util.Scanner;

public class BitwwiseSwap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Numbers before swapping: "+a+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping:"+a+" "+b);
		// TODO Auto-generated method stub

	}

}
