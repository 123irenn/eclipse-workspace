package irene;

import java.util.Scanner;

public class SubtractMatrix {

	public static void main(String[] args) {
		int row,col,i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size:");
		row=sc.nextInt();
		System.out.println("Enter the column size:");
		col=sc.nextInt();
		int [][]a=new int[row][col];
		int [][]b=new int[row][col];
		int [][]diff=new int[row][col];
		System.out.println();
		System.out.println("Enter the elements 1:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter the elements 2:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		//subtraction
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				diff[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Resultant matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(diff[i][j]+" ");
			}
			System.out.println();
		}

		
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
