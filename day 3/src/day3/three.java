package day3;
class shape{
	int l,b;
	
	public void print() {
		System.out.println("This is This is shape");
		
	}
	
}
 class rectangle extends shape{
	 public void printn() {
		 System.out.println("This is rectangular shape");
	 }
	 
	 }
 class circle extends shape{
	 public void printf() {
		 System.out.println("This is circular shape");
	 }
 }
 
 class square extends rectangle{
	 public void printf()
	 {
		 System.out.println("square is a rectangle");
	 }
 }
public class three 
{

	public static void main(String[] args) {
		square sq=new square();
		sq.print();
		sq.printf();
		
		// TODO Auto-generated method stub

	}
 }