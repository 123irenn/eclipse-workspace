package day4;
abstract class Parent
{
	public void message() {
		System.out.println("");
	}
}
class Child extends Parent

{
	public void message()
	{
		System.out.println("This is first subclass");
	}
	
	
}

class Childe extends Parent
{
	public void message()
	{
		System.out.println("This is second subclass");
	}
	}

public class Six {

	public static void main(String[] args) {
		Parent obj1=new Child();
		Parent obj2=new Childe();
		obj1.message();
		obj2.message();
		// TODO Auto-generated method stub

	}

}
