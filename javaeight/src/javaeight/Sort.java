package javaeight;


import java.util.Random;



public class Sort {

	public static void main(String[] args) {
		
		Random r=new Random();
		r.ints().limit(5).sorted().forEach(System.out::println);		
		
		
	}

}
