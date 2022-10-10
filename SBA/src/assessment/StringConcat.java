package assessment;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		String s1,s2;
		//boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inmates name:");
		s1=sc.nextLine();
		System.out.println("Inmates father's name:");
		s2=sc.nextLine();
		String s=s1+""+s2;
		boolean flag = true;
	      for (int i = 0; i < s.length(); i++) 
	      {
	         char ch = s.charAt(i);
	         if (!(ch >= 'a' && ch <= 'z'|| ch >= 'A' && ch <= 'Z') )
	         {
	            flag = false;
	         }
	      }
		 if(flag)
		 {
			 System.out.println(s.toUpperCase());
		 }
		
		else
		{
			System.out.println("inavlid name");
		}
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
