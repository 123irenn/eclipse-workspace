package Matrix;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		int row,col,i,j;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows:");
		row=sc.nextInt();
		 System.out.println("Enter columns:");
		 col=sc.nextInt();
		
		 int mat1[][]=new int[row][col];
		 int mat2[][]=new int[row][col];
		 int res[][]=new int[row][col];
		 
		 System.out.println("Enter elements of first matrix:");
		 
		 for(i=0;i<row;i++)
		 {
			 for(j=0;j<col;j++)
			 {
				 mat1[i][j]=sc.nextInt();
			 }
		 }
		 
 System.out.println("Enter elements of Second matrix:");
		 
		 for(i=0;i<row;i++)
		 {
			 for(j=0;j<col;j++)
			 {
				 mat2[i][j]=sc.nextInt();
			 }
		 }
		 
		 
 
		 
		 for(i=0;i<row;i++)
		 {
			 for(j=0;j<col;j++)
			 {
				 res[i][j]=mat1[i][j]-mat2[i][j];
			 }
		 }
		 System.out.println("Result:");
		 for(i=0;i<row;i++)
		 {
			 for(j=0;j<col;j++)
			 {
				 System.out.println(res[i][j]+"\t");
				 System.out.println();
			}
		 }
		 
		// TODO Auto-generated method stub

	}

}
