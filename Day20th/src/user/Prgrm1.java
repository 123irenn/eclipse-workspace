package user;
import java.util.*;

public class Prgrm1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		 int x=sc.nextInt();	
		  System.out.println("Select sex:M/F:");
		  int sex=sc.next().charAt(0);
		  System.out.println("Are you married?Y/N:");
		  int m=sc.next().charAt(0);
		  if(sex=='F')
		  {
			 System.out.println("Can work in urban areas"); 
		  }
		  else
		  {
			  if((x>=20)&&(x<=40))
			  {
				  System.out.println("Can work anywhere");
			  }
			  else if((x>=40)&&(x<=60))
			  {
				  System.out.println("Work only in urban areas");
			  }
			  else {
				  System.out.println("ERROR");
			  }
		  }
		  
		 // TODO Auto-generated method stub

	}

}
