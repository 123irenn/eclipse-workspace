package Day7;

import java.util.HashMap;

public class HashMap8 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		
		hm.put(1, "Ram");
		hm.put(2, "Raju");
		hm.put(3, "Reena");
		hm.put(4, "Rahul");
		hm.put(5, "Seena");
		System.out.println("Values :"+hm);
		System.out.println("Value present "+hm.containsValue("Ram"));
		// TODO Auto-generated method stub

	}

}
