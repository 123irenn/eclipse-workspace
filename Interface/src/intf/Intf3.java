package intf;
interface Printable {
	void print();
}
interface Showable{
	void print();
}

public class Intf3 implements Printable,Showable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Intf3 obj=new Intf3();
		obj.print();
		// TODO Auto-generated method stub

	}

}
