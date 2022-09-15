package pattern;

public class three {

	public static void main(String[] args) {
		int a=8;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=1;i<=a-1;i++)
		
		{
			for(int j=a-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
