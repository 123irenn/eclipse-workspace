package intf;
interface Bank{ 
	float rateOfIntrest();
}
class SBI implements Bank{
	public float rateOfIntrest()
	{
		return 9.15f;
	}
}
class PNB implements Bank{
	public float rateOfIntrest()
	{
		return 9.7f;
	}
}

public class intf2 {

	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println("RO1:"+b.rateOfIntrest());
		
				// TODO Auto-generated method stub

	}

}
