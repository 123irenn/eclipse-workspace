package Matrix;

import java.util.Scanner;
class Main
{
public static void LowerTriMat(int [][] a)
{
	int x=a.length;
	int y=a[0].length;
	if(x!=y)
	{
		System.out.println("not square matrix");
	}
	else
	{
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				if(i<j)
				{
					a[i][j]=0;
				}
			}
		}
	}
	System.out.println("Triangular matrix:");
	for(int i=0;i<x;i++)
	{
		for(int j=0;j<y;j++)
		{
			System.out.println(a[i][j]+"");
		}
		System.out.println();
	}
	
	}
}

public class LoweTriangular {

	public static void main(int arr[][]) {
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter row size:");
		m=sc.nextInt();
		System.out.println("Enter column size:");
		n=sc.nextInt();
		 System.out.println("Enter the elements:");
		 int a[][]=new int[m][n];
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 a[i][j]=sc.nextInt();
			 }
		 }
		System.out.println("Orginal Matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println(a[i][j]);
			}
			
		}
		Main.LowerTriMat(a);
		sc.close();

	}
	
}
