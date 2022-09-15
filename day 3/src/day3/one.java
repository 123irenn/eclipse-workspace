package day3;

class parent{
	public void print(){
		System.out.println("This is parent class");
			}
	}
class child extends parent{
		public void printf(){
		System.out.println("This is child class");
				}
		}




public class one {

	public static void main(String[] args) {
		parent p=new parent();
		p.print();
		child c=new child();
		c.printf();
		c.print();
		
		// TODO Auto-generated method stub

	}

}
