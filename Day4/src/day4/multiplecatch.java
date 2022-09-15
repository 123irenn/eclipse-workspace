package day4;

public class multiplecatch {

	public static void main(String[] args) {
		try {
			
			int a []=new int[5];
			a[5]=10/0;
			System.out.println(a[6]);
			String s="IRENE";
			System.out.println(s.charAt(9));
			
			
			}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Out Of Index Exception Occurs");
		}
		catch(StringIndexOutOfBoundsException e) {
	         System.out.println("String Index Out of Bound Exception occurred  ");
		}
		System.out.println("rest of the code");
	}

}
