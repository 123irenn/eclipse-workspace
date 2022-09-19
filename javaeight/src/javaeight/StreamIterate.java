package javaeight;

import java.util.stream.*;

public class StreamIterate {

	public static void main(String[] args) {
		Stream<Integer> s=Stream.of(1,2,3,4,5,6,7,8,9);
		s.forEach(i->System.out.println(i));
		
		// TODO Auto-generated method stub

	}

}
