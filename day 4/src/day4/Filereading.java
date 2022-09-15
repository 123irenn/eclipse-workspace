package day4;
import java.io.File;
import java.util.Scanner;

public class Filereading {

	public static void main(String[] args) {
		try {
		File obj=new File("File1.txt");
		Scanner dreader=new Scanner(obj);
		while(dreader.hasNextLine()) {
			String data=dreader.nextLine();
			System.out.println(data);
		}
		dreader.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
