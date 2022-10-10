package assessment;

import java.util.Scanner;

class Divison{
	/*int number1,number2;
		public Divison(int number1,int number2) {
			this.number1=number1;
			this.number2=number2;
	}*/

		public String divideTwoNumbers(int number1,int number2)
		{
			int value;
			String s="";
			try 
			{
				value=number1/number2;
				s+=("The answer is "+value);
				//System.out.println("The answer is"+s+"Thanks for using application");
			}
			catch(ArithmeticException e)
			{
				s+="Division by zero is not possible.";
				
			}
			finally
			{
				s+=".Thanks for using the application.";
			}
			return s;
			
	}
}

public class DivideN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Divison div=new Divison();
		System.out.println(div.divideTwoNumbers(n1, n2));
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
