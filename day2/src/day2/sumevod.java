package day2;

import java.util.Scanner;

public class sumevod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number =");
		int a=sc.nextInt();
		int es=0,os=0;
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
			
				es=es+i;
			}
			else
			{
								os=os+i;
			}
			
		}
		System.out.println("even sum is "+es);
		System.out.println("odd sum is "+os);
		// TODO Auto-generated method stub

	}

}
