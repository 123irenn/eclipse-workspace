package day3;
class bank{
	int bal;
	public void getBalance()
	{
		System.out.println("return 0");
	}
}
class BankA extends bank{
	public void getBalance()
	{
		bal=1000;
		System.out.println("balance is $"+bal);
	}
	
}
class BankB extends bank{
	public void getBalance()
	{
		bal=1500;
		System.out.println("balance is $"+bal);
	}
	
}
class BankC extends bank{
	public void getBalance()
	{
		bal=2000;
		System.out.println("balance is $"+bal);
	}
	
}
public class nine {

	public static void main(String[] args) {
		BankA ob1=new BankA();
		BankB ob2=new BankB();
		BankC ob3=new BankC();
		ob1.getBalance();
		ob2.getBalance();
		ob3.getBalance();
		
		
		
		// TODO Auto-generated method stub

	}

}
