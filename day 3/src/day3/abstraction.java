package day3;
abstract class mahe{
	public void call()
	{
		System.out.println("calling...");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
	
}
abstract class ram extends mahe{
	public void move() {
		System.out.println("moving...");
	}
}
 class sum extends ram{
	 public void dance() {
		 System.out.println("dancing...");
	 }
	 public void cook() {
		 System.out.println("cooking...");
	 }
	 
 }

public class abstraction {

	public static void main(String[] args) {
		mahe obj1=new sum();
		obj1.call();
		obj1.cook();
		obj1.dance();
		obj1.move();
		// TODO Auto-generated method stub

	}

}
