package javaeight;
import java.util.Comparator;
import java.util.stream.*;

public class HighLow {

	public static void main(String[] args) {
		Integer highest = Stream.of(1, 2, 3, 77, 6, 5)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
		 Integer lowest = Stream.of(1, 2, 3, 77, 6, 5)
                 .min(Comparator.comparing(Integer::valueOf))
                 .get();
		 System.out.println("Highest:"+highest);
		 System.out.println("Lowest:"+lowest);
		// TODO Auto-generated method stub

	}

}
