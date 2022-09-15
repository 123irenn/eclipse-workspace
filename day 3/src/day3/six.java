package day3;
class value{
	public void result(int a,int b) {
		
		System.out.println("perimeter is "+(a*b));
	}
	public void result(int a) {
		System.out.println("area is "+(a*a));
	}
	
}

public class six {

	public static void main(String[] args) {
		value obj=new value();
		obj.result(4,5);
		obj.result(5);
		
		// TODO Auto-generated method stub

	}

}
