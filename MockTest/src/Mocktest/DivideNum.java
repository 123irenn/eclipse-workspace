package Mocktest;

import java.util.Scanner;

public class DivideNum {

	public static void main(String[] args) {
		int i,x,y,gcd=1;
		Scanner in = new Scanner(System.in);  
		System.out.println("Enter first number:");
		x=in.nextInt();
		System.out.println("Enter Second number:");
		y=in.nextInt();
		for(i=1;i<=x && i<=y;i++)
		{
			if(x%i==0 && y%i==0)
			{
				gcd=i;
			}
			
		}
		System.out.println("Common factor of "+x+" and "+y+" is: "+gcd);
		

	}
	


	}


