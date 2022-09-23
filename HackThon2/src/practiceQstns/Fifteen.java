package practiceQstns;
import java.util.Collections;
import java.util.LinkedList;
public class Fifteen {

	public static void main(String[] args) {
		 LinkedList<String> linkedList = new LinkedList<String>();
	        linkedList.add("Jai");
	        linkedList.add("Mahesh");
	        linkedList.add("Naren");
	        linkedList.add("Vivek");
	        linkedList.add("Vishal");
	        linkedList.add("Hemant");
	        System.out.println("Actual LinkedList:"+linkedList);
	        Collections.shuffle(linkedList);
	        System.out.println();
	        System.out.println("Results after shuffle operation:" + linkedList);      
	        System.out.println();
	        Collections.shuffle(linkedList);
	        System.out.println();
	        System.out.println("Results after shuffle operation:" + linkedList);
		// TODO Auto-generated method stub

	}

}
