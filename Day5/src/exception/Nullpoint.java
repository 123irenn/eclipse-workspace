package exception;


public class Nullpoint {

	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(getLength(s));
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException");
			}
		}

}
