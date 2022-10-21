package Mocktest;
import java.util.*;
import java.util.regex.*;
public class LoanBank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you ID:");
		String Id=sc.next();
		Pattern p=Pattern.compile("^GBL/([0-9]){3}/[0-9]{4}");
		Matcher m=p.matcher(Id);
		if(m.find())
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Incorrect ID");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
