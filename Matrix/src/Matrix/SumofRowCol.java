package Matrix;

import java.util.Scanner;

public class SumofRowCol {

	public static void main(String[] args) {
		int row,col,i,j;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows:");
		row=sc.nextInt();
		 System.out.println("Enter columns:");
		 col=sc.nextInt();
		
		 int mat1[][]=new int[row][col];
		 System.out.println("Enter elements of  matrix:");
		 
		 for(i=0;i<row;i++)
		 {
			
			 for(j=0;j<col;j++)
			 {
				 mat1[i][j]=sc.nextInt();
			 }
		 }
		 for(i=0;i<row;i++)
		 {
			 int sumrow=0;
			 for(j=0;j<col;j++)
			 {
				 sumrow+=mat1[i][j];
			 }
			 System.out.println("Sum of element of row"+i+":"+sumrow);
		 }
		 
		 for(i=0;i<row;i++)
		 {
			 int sumcol=0;
			 for(j=0;j<col;j++)
			 {
				 sumcol+=mat1[j][i];
			 }
			 System.out.println("Sum of element of coloumn"+j+":"+sumcol);
		 }
		
		 
		// TODO Auto-generated method stub

	}

}
