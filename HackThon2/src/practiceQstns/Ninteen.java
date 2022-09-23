package practiceQstns;
import java.util.*;
public class Ninteen {

	public static void main(String[] args) {
		 LinkedList<String> l = new LinkedList<String>();
		  l.add("ram");
		  l.add("shyam");
	      l.add("gyan");
	      l.add("dhyan");
	      l.add("vyan");
	      //cloning
	      System.out.println("The elements of LinkedList are: ");
	      System.out.println(l);
	      System.out.println();
	      LinkedList<String> clone = (LinkedList<String>)l.clone();
	      System.out.println("Cloned LinkedList: ");
	      System.out.println( clone);
		// TODO Auto-generated method stub

	}

}
