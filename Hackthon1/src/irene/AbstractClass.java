package irene;
abstract class Parent{
	abstract void message();
}
class subclass1 extends Parent
{
	public void message() {
		System.out.println("First subclass");
	}
}
class subclass2 extends Parent
{
	public void message()
	{
		System.out.println("This is second subclass");
	}
	}

public class AbstractClass {

	public static void main(String[] args) {
		subclass1 obj=new subclass1();
		subclass2 obj1=new subclass2();
		obj.message();
		obj1.message();
		// TODO Auto-generated method stub

	}

}
