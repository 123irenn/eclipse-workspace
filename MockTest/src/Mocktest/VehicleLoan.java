package Mocktest;

import java.util.Scanner;

class Vehicle{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	Vehicle(String vehicleNumber,String modelName, String vehicleType,double price){
		this.vehicleNumber=vehicleNumber;
		this.modelName=modelName;
		this.vehicleType=vehicleType;
		this.price=price;
	}
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public double issueLoan()
	{
		double loanAmt = 0.0;
		if(vehicleType.equals("4wheeler")) {
			price=0.8*price;
			return price;
		}
		else if(vehicleType.equals("3wheeler"))
		{
			price=0.75*price;
			return price;
		}
		else if(vehicleType.equals("2wheeler"))
		{
			price=0.5*price;
			return price;
		}
		return loanAmt;
		
	}
	public double takeInsurance() {
		double Amt=0.0;
		if(price<=150000)
		{
			price=3500;
			return price;
		}
		else if(price>=150000 && price<=30000)
		{
			price=4000;
			return price;
		}
		else if(price>300000)
		{
			price=5000;
			return price;
		}
		
		return Amt;
		
	}
	
}
 interface Loan1{
	abstract double issueLoan();
	
}
 interface Insurance{
	abstract double takeInsurance();
}

public class VehicleLoan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Vehicle Number:");
		//String vehicleNumber=sc.next();
		//System.out.println("Model Name:");
		//String modelName=sc.next();
		System.out.println("Enter the vehicle type:");
		String vehicleType=sc.next();
		System.out.println("Enter the price:");
		double price=sc.nextDouble();
		System.out.println();
		Vehicle v=new Vehicle();
		v.setVehicleType(vehicleType);
		v.setPrice(price);
		System.out.println("Loan Amount:");
		v.issueLoan();
		System.out.println(v.getPrice());
		System.out.println("Insurance Amount:");
		v.takeInsurance();
		System.out.println(v.getPrice());
		// TODO Auto-generated method stub

	}

}
