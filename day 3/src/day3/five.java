package day3;
class wow{
	public void num(int n,char c) {
		System.out.println("int-char-"+n+c);
		
	}
	public void num(char c,int n)
	{
		System.out.println("char-int-"+c+n);
	}
}

public class five {

	public static void main(String[] args) {
		wow obj=new wow();
		obj.num(4, 'c');
		obj.num('c', 4);
		
		// TODO Auto-generated method stub

	}

}
