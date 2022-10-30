package Mocktest;

import java.util.Scanner;

class user1{
	private String _name;
	private long _mobileNumber;
	private String _username;
	private String _password;
	public  user1(String name,long mobileNumber,String username,String password)
	{
		super();
		this._name=name;
		this._mobileNumber=mobileNumber;
		this._username=username;
		this._password=password;
		
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public long get_mobileNumber() {
		return _mobileNumber;
	}
	public void set_mobileNumber(long _mobileNumber) {
		this._mobileNumber = _mobileNumber;
	}
	public String get_username() {
		return _username;
	}
	public void set_username(String _username) {
		this._username = _username;
	}
	public String get_password() {
		return _password;
	}
	public void set_password(String _password) {
		this._password = _password;
	}
	
	
	
}
class UserBO1{
	int n=0;
	
	public user1[]add(String name,long mobileNumber,
			String username,String password,user1[]users)
	{
		users[n]=new user1(name,mobileNumber,username,password);
		n++;
		return users;
		
	}
	public void display(user1[]users)
	{
		System.out.printf("%5d %10s %10d %10s %10s","id","NAME","MOBILE NUMBER","USERNAME","PASSWORD");
		for(int i=0;i<users.length;i++)
		{
			System.out.println();
			System.out.printf("%10s %10d %10s %10s ", (i+1),users[i].get_name(),users[i].get_mobileNumber(),users[i].get_username(),users[i].get_password());
			
		}
		System.out.println();
	}
	public user1[]remove(int id,user1[]users)
	{
		int l=users.length;
		user1 un[]=new user1[l-1];
		for(int i=0,k=0;i<users.length;i++)
		{
			if(i!=(id-1))
			{
				un[k++]=users[i];
				
			}
			
		}
		return un;
		
		
	}
}

public class Program {

	public static void main(String[] args) {
		UserBO u=new UserBO();
		
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of users to be added:");
		n=sc.nextInt();
		user1 u1[]=new user1[n];
		UserBO1 o=new UserBO1();
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter the user details "+(i+1));
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the mobile number:");
			long mobileNumber=sc.nextLong();
			System.out.println("Enter the username:");
			String username=sc.next();
			System.out.println("Enter the password:");
			String password=sc.next();
			o.add(name, mobileNumber, username, password, u1);
		}
		
		System.out.println("user created successfully");
		while(true)
		{
			System.out.println("Menu:");
			System.out.println("1.Display all users");
			System.out.println("2.Remove a user");
			System.out.println("3.Exit");
			System.out.println("Choose option:");
			int c=sc.nextInt();
			
			
			
			switch(c)
			{
			case 1:
				o.display(u1);
				break;
			case 2:
				System.out.println("Enter the Id:");
				int ru=sc.nextInt();
				u1=o.remove(ru, u1);
				o.display(u1);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Enter valid choice:");
				break;
			
			}
		}
		// TODO Auto-generated method stub

	}

}
