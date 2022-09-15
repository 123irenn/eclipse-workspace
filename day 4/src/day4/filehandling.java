package day4;


import java.io.File;


public class filehandling {

	public static void main(String[] args) {
		File obj=new File("File1.txt");
		try {
			
			if(obj.createNewFile()) {
			System.out.println("File created "+obj.getName());
			}
			else {
			System.out.println("File alreay exsist");
			
			}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		
	}
		
	}


