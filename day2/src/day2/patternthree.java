package day2;

public class patternthree {

	public static void main(String[] args) {
		int c=0;
		for(int i=0;i<=6;i++)
		{
			if(i==4) 
			{
				System.out.println(""+i+i);
				
			}
			
				
			for(int j=1;j<3;j++)
			{
				if(i==3)
				{
					break;
				}
				c=i+j;
				System.out.print(""+c);
				
			}
			System.out.println();
		}
	}
		// TODO Auto-generated method stub
	}