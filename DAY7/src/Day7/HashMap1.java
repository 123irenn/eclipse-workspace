package Day7;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		hm.put(1, "Ram");
		hm.put(2, "Raju");
		hm.put(3, "Reena");
		hm.put(4, "Rahul");
		hm.put(5, "Seena");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		// TODO Auto-generated method stub

	}

}
