package day2;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number =");
		int a=sc.nextInt();
		if(a>75)
		{
			System.out.println("Honours Degree");
		}
		else if(a>65&&a<75)
		{
			System.out.println("First divs=ison");
		}
		else if(a>50&&a<60)
		{
			System.out.println("second divison");
		}
		else if(a>40&&a<50)
		{
			System.out.println("Third divison");
		}
		else
		{
			System.out.println("Failed");
		}
		// TODO Auto-generated method stub

	}

}
