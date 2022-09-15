package day4;
class MyClass {
    public static MyClass initT() {     
    return null;
    }   
    public void print(String s) {
    System.out.println(s.toLowerCase());
    }
}
public class NullException {

	public static void main(String[] args) {
		 MyClass t = MyClass.initT();   
	        t.print("Hello, World!");  
		// TODO Auto-generated method stub

	}

}
