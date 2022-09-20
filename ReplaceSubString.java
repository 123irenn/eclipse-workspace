package user;
import java.util.*;

public class ReplaceSubString {

	public static void main(String[] args) {
		String s,n,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		s=sc.nextLine();
		System.out.println("Enter sub-string to be replaced:");
		n=sc.nextLine();
		System.out.println("Enter the replacement string:");
		x=sc.nextLine();
		sc.close();
		
		System.out.println("After replacing:");
		s=s.replace(n, x);
		System.out.println(s);
		
		
		// TODO Auto-generated method stub

	}

}
