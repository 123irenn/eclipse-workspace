package pattern;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number =");
		int a=sc.nextInt();
		for(int i=a;i>=1;i--)
		{
			for(int j=a;j>=i;j--)
			{
				System.out.print(""+j);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
