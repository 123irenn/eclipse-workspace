package practiceQstns;
import java.util.TreeSet;

public class Four {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(56);
		set.add(23);
		set.add(12);
		set.add(14);
		set.add(234);
		System.out.println("TreeSet 1:"+set);
		System.out.println();
		TreeSet<Integer> set1=new TreeSet<Integer>();
		set1.add(56);
		set1.add(23);
		set1.add(12);
		set1.add(14);
		set1.add(234);
		System.out.println("TreeSet 2:"+set1);
		System.out.println();
		System.out.println("IsEqual Or Not?");
		System.out.println(set.equals(set1));
		// TODO Auto-generated method stub

	}

}
