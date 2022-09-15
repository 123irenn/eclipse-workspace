package Search;


import java.util.Scanner;

public class LinerSearch {
	public static int linearSearch(int array[], int x) {
		  int n = array.length;

		  
		  for (int i = 0; i < n; i++) {
		    if (array[i] == x)
		    return i;
		  }
		  return -1;
		  }

	public static void main(String[] args) {

		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the value to find:");
		int x=sc.nextInt();
		int r = linearSearch(a, x);
		if(r==-1)
		{
			System.out.println("Element NotFound");
		}
		else
		{
			System.out.println("Element Found at index "+r);
		}
		
		
		// TODO Auto-generated method stub

	}

}
