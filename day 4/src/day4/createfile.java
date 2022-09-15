package day4;

import java.io.FileWriter;

public class createfile {

	public static void main(String[] args) {
		String s="hello";
		try {
			FileWriter output=new FileWriter("File1.txt");
			output.write(s);
			System.out.println("data written into text");
			output.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}