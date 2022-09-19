package intf;
interface showle{
	void show();
	interface message{
		void msg();
	}
}

public class Intf6 implements showle.message{
	public void msg()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		showle.message obj=new Intf6();
		obj.msg();
		// TODO Auto-generated method stub

	}

}
