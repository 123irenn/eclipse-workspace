package day3;
class User{
	public void printnum(int i) {
		System.out.println("value is "+i);
		
	}
}
class op extends User{
	public void printnum(int j) {
		System.out.println("value is "+j);
		
	}
}

public class tenth {

	public static void main(String[] args) {
		User obj1=new User();
		op obj2=new op();
		obj1.printnum(7);
		obj2.printnum(8);
		// TODO Auto-generated method stub

	}

}
