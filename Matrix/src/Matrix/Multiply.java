package Matrix;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		n=sc.nextInt();
		 
		
		 int mat1[][]=new int[n][n];
		 int mat2[][]=new int[n][n];
		 int res[][]=new int[n][n];
		 
		 System.out.println("Enter elements of first matrix:");
		 
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<n;j++)
			 {
				 mat1[i][j]=sc.nextInt();
			 }
		 }
		 
 System.out.println("Enter elements of Second matrix:");
		 
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<n;j++)
			 {
				 mat2[i][j]=sc.nextInt();
			 }
		 }
		 
		 
 
		 
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<n;j++)
			 {
				 for(int k=0;k<n;k++)
				 {
				 res[i][j]=mat1[i][k]*mat2[k][j];
				 }
			 }
		 }
		 System.out.println("Result:");
		 for(i=0;i< n;i++)
		 {
			 for(j=0;j<n;j++)
			 {
				 System.out.println(res[i][j]+"\t");
				 System.out.println();
			}
		 }
		 
		// TODO Auto-generated method stub

	}

}
