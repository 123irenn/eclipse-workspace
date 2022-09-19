package javaeight;

import java.time.LocalDateTime;

public class TimeAPI {

	public static void main(String[] args) {
		TimeAPI obj=new TimeAPI();
		obj.testDateTime();
		// TODO Auto-generated method stub

	}
	public void testDateTime() {
		LocalDateTime currentTime=LocalDateTime.now();
		System.out.println("Current time and date: "+currentTime);
	}

}
