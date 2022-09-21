package irene;

import java.util.Scanner;

public class MatrixEqual {

	public static void main(String[] args) {
		int row,col,i,j;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size:");
		row=sc.nextInt();
		System.out.println("Enter the column size:");
		col=sc.nextInt();
		int [][]a=new int[row][col];
		int [][]b=new int[row][col];
		
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
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					flag=false;
					break;
						
				}
			}
		}
		if(flag)
		{
			System.out.println("Matrix  equal");
		}
		else
		{
			System.out.println("Matrix  not equal");
		}
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
