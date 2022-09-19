package intf;

 interface Drawable{
	void draw();
}
 class rectangle implements Drawable
 {
	 public void draw()
	 
	 {
		 System.out.println("Drawing rectangle");
	 }
 }
 
 class circle implements Drawable{
	 public void draw() {
		 System.out.println("Drawing circle");
	 }
 }

public class Intf1 {

	public static void main(String[] args) {
		Drawable d=new circle();
		d.draw();
		Drawable dd=new rectangle();
		dd.draw();
		// TODO Auto-generated method stub

	}

}
