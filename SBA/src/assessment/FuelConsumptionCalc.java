package assessment;

import java.util.Scanner;
public class FuelConsumptionCalc {

	public static void main(String[] args) {
		float l,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank:");
		l=sc.nextFloat();
		double lt=(l*1.00);
		if(lt<1)
		{
			System.out.println("Invalid input");
		}
		System.out.println("Enter the distance covered:");
		d=sc.nextFloat();
		double dis=(d*1.00);
		if(dis<1)
		{
			System.out.println("Invalid input");
		}
		
		double liters;
		liters=((l/d)*100);
		System.out.println("Liters/100KM:"+liters);
		 double miles=(dis*0.6214);
		 double gallons=(lt*0.2642);
		 double mg=miles/gallons;
		 System.out.println("Miles/gallons");
		 System.out.println("%.2f"+mg);
		 sc.close();

		
		
		// TODO Auto-generated method stub

	}

}
