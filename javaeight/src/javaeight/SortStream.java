package javaeight;

import java.util.Arrays;

public class SortStream {

	public static void main(String[] args) {
		 int arr[] = { 99, 55, 203, 99, 4, 91 };
		 Arrays.parallelSort(arr);
		 Arrays.stream(arr).forEach(n->System.out.print(" "+n));
		
		// TODO Auto-generated method stub

	}

}
