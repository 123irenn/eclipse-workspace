package user;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String rev="";
		for(int i=s.length();i>0;i--)
		{
			rev=rev+(s.charAt(i-1));
			
		}
		if(s.equals(rev))
		{
			System.out.println("PALLINDROME STRING:"+s);
		}
		else
		{
			System.out.println("NOT PALLINDROME:"+s);
		}
		// TODO Auto-generated method stub

	}

}
