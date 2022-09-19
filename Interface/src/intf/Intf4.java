package intf;
interface Printe{
	void print();
}
interface Showe extends Printe{
	void show();
}

public class Intf4 implements Showe {
	public void print()
	{
		System.out.println("Hello-print");
	}
	public void show() {
		System.out.println("Welcome-show");
	}
	public static void main(String[] args) {
		Intf4 obj=new Intf4();
		obj.print();
		obj.show();
		// TODO Auto-generated method stub

	}

}
