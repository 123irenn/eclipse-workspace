package day4;
 
class Display{
	private int num=5;
	private int Display(int a)
	{
		System.out.println(" "+a);
	}
	
}


public class Private {

	public static void main(String[] args) {
		Display obj=new Display();
		System.out.println(obj.num);
		System.out.println(obj.Display);
		// TODO Auto-generated method stub

	}

}
