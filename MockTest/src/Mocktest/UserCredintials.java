package Mocktest;
import java.util.*;
class User{
	private int id;
	private String username;
	private String password;
	User(){
		
	}
	User(int id,String username,String password)
	{
		this.id=id;
		this.username=username;
		this.password=password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
class UserBO{
	User[] users=new User[5];
	public User[] getUser() {
		users[0]=new User(1,"Louis",encryptPassword("rxfsuzA2345"));
		users[1]=new User(2,"Messie",encryptPassword("hpphmf1:"));
		users[2]=new User(3,"Steve",encryptPassword("openfKt"));
		users[3]=new User(4,"Kallis",encryptPassword("23456778"));
		users[4]=new User(5,"Wipro",encryptPassword("A$%"));
		return users;
		
	}
	private String encryptPassword(String password)
	{
		String encrypted=" ";
		for(int i=0;i<password.length();i++)
		{
			int ascii=(int)password.charAt(i);
			encrypted+=(char)(ascii+1);
		}
		return encrypted;
	}
	boolean Validate(String username,String password)
	{
		for(int i=0;i<users.length;i++)
		{
			if(users[i].getUsername().equals(username) && users[i].getPassword().equals(encryptPassword(password)))
			{
				return true;
			}
			
		}
		return false;
	}
	public void add(String name, long mobileNumber, String username, String password, Object object) {
		// TODO Auto-generated method stub
		
	}
}
public class UserCredintials {

	public static void main(String[] args) {
		//int i;
		UserBO u=new UserBO();
		User users[]=u.getUser();
		String username,password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Username:");
		username=sc.next();
		System.out.println("Password:");
		password=sc.next();
		sc.close();
		if(u.Validate(username, password))
		{
			System.out.println("Login successfull");
		}
		else
		{
			System.out.println("Incorrect username/password");
		}
		
		
		// TODO Auto-generated method stub

	}

}
