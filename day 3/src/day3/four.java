package day3;
class PrintNumber{
	public void printn(int x)
	
	{
		System.out.println("integer-"+x);
	}
	
	public void printn(float x)
	
	{
		System.out.println("float-"+x);
	}
	public void printn(long x)
	
	{
		System.out.println("long-"+x);
	}
}

public class four {

	public static void main(String[] args) {
		PrintNumber obj=new PrintNumber();
		obj.printn(4);
		obj.printn(234.5f);
		obj.printn(40000L);
		
		// TODO Auto-generated method stub

	}

}
