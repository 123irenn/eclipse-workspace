package Day7;

import java.util.HashMap;

public class HashMap3 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		HashMap<Integer,String> hm1= new HashMap<Integer,String>(); 
		hm.put(1, "Ram");
		hm.put(2, "Raju");
		hm.put(3, "Reena");
		hm.put(4, "Rahul");
		hm.put(5, "Seena");
		System.out.println("Values in First :"+hm);
		hm1.put(6, "Arjun");
		hm1.put(8, "Arya");
		System.out.println("Valuea in Second Map:"+hm1);
		hm.putAll(hm1);
		System.out.println("After copying: " + hm);
		
		
		// TODO Auto-generated method stub

	}

}
