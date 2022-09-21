package Matrix;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		int row,col,i,j;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows:");
		row=sc.nextInt();
		 System.out.println("Enter columns:");
		 col=sc.nextInt();
		
		 int mat1[][]=new int[row][col];
		 int mat2[][]=new int[row][col];
		
		 
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
				 if(mat1[i][j]!=mat2[i][j])
				 {
					 flag= false;
					break;
					
				 }
			 }
		 }
		 if(flag)
		 {
			 System.out.println("Matrix are equals");
		 }
		 else
		 {
			 System.out.println("Matrix are not equal");
		 }
		 
		// TODO Auto-generated method stub

	}

}
