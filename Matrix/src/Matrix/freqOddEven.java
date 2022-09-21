package Matrix;

import java.util.Scanner;

public class freqOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n;int even=0,odd=0;
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
			int rows=a.length;
			int col=a[0].length;
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(a[i][j]%2==0)
					{
						even++;
					}
					else
					{
						odd++;
					}
				}
				
			}
			System.out.println("Frequency of even:"+even);
			System.out.println("Frequency of odd:"+odd);
			
			sc.close();
		// TODO Auto-generated method stub

	}

}
