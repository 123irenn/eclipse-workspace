package exception;

import java.io.File;

import java.util.Scanner;


public class IOException {

	public static void main(String[] args) {
		try {
			File obj=new File("File2.txt");
			Scanner dreader=new Scanner(obj);
			while(dreader.hasNextLine()) {
				String data=dreader.nextLine();
				System.out.println(data);
			}
			dreader.close();
			}
		catch(Exception e)
		{
			System.out.println("IOException");
		}
	
		// TODO Auto-generated method stub

	}

}
