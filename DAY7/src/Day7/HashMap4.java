package Day7;

import java.util.HashMap;

public class HashMap4 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		
		hm.put(1, "Ram");
		hm.put(2, "Raju");
		hm.put(3, "Reena");
		hm.put(4, "Rahul");
		hm.put(5, "Seena");
		System.out.println("Values  :"+hm);
		hm.clear();
		System.out.println("After Removing:"+hm);
		//check if hashmap is empty 
		System.out.println("Is emptyor not?"+hm.isEmpty());
		// TODO Auto-generated method stub

	}

}
