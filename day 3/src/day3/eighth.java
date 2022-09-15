package day3;
class degree{
	public void getdegree() {
		System.out.println("I got a degree");
	}
}
class undergraduate extends degree{
	public void getdegree() {
		System.out.println("I am an undergraduate");
	}
}

class postgraduate  extends degree{
	public void getdegree() {
		System.out.println("I am a postgraduate");
	}
	
}
	
public class eighth {

	public static void main(String[] args) {
		degree obj1=new degree();
		undergraduate obj2=new undergraduate();
		postgraduate obj3=new postgraduate();
		obj1.getdegree();
		obj2.getdegree();
		obj3.getdegree();
		
		// TODO Auto-generated method stub

	}

}
