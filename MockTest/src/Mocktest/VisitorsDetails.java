package Mocktest;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

class FileManager{
	static public File createFile() {
		File file=new File("visitors.txt");
		try {
			file.createNewFile();
			
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		return file;
		
	}
	static public void writeFile(File f,String record)
	{
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter(f.getName(),true)); 
			out.write(record+";");
			out.close();
			
		}catch(IOException e) {
			System.out.println("Exception Ocurred "+e);
		}

		
	}
	static public String[] readFile(File f)
	{
		List<String>details=new ArrayList<String>();
		try {
			File ff=new File(f.getName());
			Scanner sc=new Scanner(ff);
			while(sc.hasNextLine())
			{
				String [] arr=sc.nextLine().split(";");
				details=Arrays.asList(arr);
				
			}
			sc.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found"+e);
			
		}
		String [] arr1=details.toArray(new String[0]);
		return arr1;
		
	}
}
public class VisitorsDetails {
	public void enterDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter Phone number:");
		int num=sc.nextInt();
		System.out.println("Enter Email:");
		String email=sc.next();
		FileManager f=new FileManager();
		File x=f.createFile();
		f.writeFile(x, name+","+num+","+email+";");
		System.out.println("Do you want to enter another record(yes/no):");
		String ans=sc.next();
		if(ans.equals("yes"))
		{
			enterDetails();
		}
		else if(ans.equals("no"))
		{
			String[]q=f.readFile(x);
			String[] pl=q[0].split(";");
			for(int i=0;i<pl.length;i++)
			{
				System.out.println(pl[i]);
			}
			System.exit(0);
		}
			
	}

	public static void main(String[] args) {
		VisitorsDetails vd=new VisitorsDetails();
		vd.enterDetails();
		
		
		// TODO Auto-generated method stub

	}

}
