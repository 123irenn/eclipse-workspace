package irene;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check?");
		int n=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%2!=0)
			{
				flag=false;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Number is  not prime");
		}
		else
		{
			System.out.println("Prime number");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
