package day2;

import java.util.Scanner;

public class averg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];int sum=0;float b;
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter  number =");
			 a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<10;i++)
		{
	    sum=sum+a[i];
	  
		}
		  System.out.println("Sum is"+sum);
	
		 b=(sum/10);
		 System.out.println("average is "+b);
		
		
		// TODO Auto-generated method stub

	}

}
