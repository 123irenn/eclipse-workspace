package Day7;
import java.util.HashSet;
public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Yellow");
		set.add("Violet");
		set.add("Red");
		set.add("Green");
		set.add("Gray");
		System.out.println(set);
		HashSet<String> Aset = new HashSet<String>();
		Aset=(HashSet)set.clone();
		System.out.println("After Cloning   -----"+Aset);
		
		// TODO Auto-generated method stub

	}

}
