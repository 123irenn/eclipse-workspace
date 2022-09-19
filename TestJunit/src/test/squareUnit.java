package test;

import static org.junit.Assert.*;


import org.junit.Test;

public class squareUnit {

	@Test
	public void test() {
		Unittesting obj1=new Unittesting();
		obj1.square(5);
		int output_f = obj1.square(5);
		assertEquals(25,output_f);
	}

}
