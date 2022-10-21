package Mocktest;
import java.util.*;
abstract class Employee{
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	Employee(int employeeId,String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
  abstract void calculateSalary();
}
class PermanentEmployee extends Employee {
	private double basicPay;
	 PermanentEmployee(int employeeId,String employeeName,double basicPay)
	 {
		super(employeeId,employeeName);
		this.basicPay=basicPay;
	 }

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	void calculateSalary() {
		double PFamount=0.0;
		PFamount=basicPay*0.12;
		salary=basicPay-PFamount;
		setSalary(salary);
		
	}
}
class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;
	TemporaryEmployee(int employeeId,String employeeName,int hoursWorked, int hourlyWages)
	{
		super( employeeId,employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
		
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	@Override
	void calculateSalary() {
		salary = hoursWorked * hourlyWages;
		setSalary(salary);
		
	}
}
class Loan{
	public double calculateLoanAmount(Employee employeeObj)
	{
		double loan=0.0;
		
		if(employeeObj instanceof PermanentEmployee)
		{
		    loan=0.15*(employeeObj.getSalary());
		    System.out.println("Loan For PermanentEmployee:"+loan);
		    return loan;
		}
		else
		{
		    loan=0.1*(employeeObj.getSalary());
		    System.out.println("Loan For TemporaryEmployee:"+loan);
		    return loan;
		}
		
	}
}

public class EmployeeLoan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details:");
		System.out.println("Enter ID:");
		int Id=sc.nextInt();
		System.out.println("Name:");
		String Name=sc.next();
		System.out.println("Salary:");
		double salary=sc.nextDouble();
		System.out.println("basicPay:");
		double pay=sc.nextDouble();
		System.out.println("hoursWorked:");
		int hours=sc.nextInt();
		System.out.println("hourlyWages:");
		int wages=sc.nextInt();
		Employee e1=new TemporaryEmployee(Id,Name,hours,wages);
		e1.calculateSalary();
		System.out.println("Temporary Employee Salary:"+e1.getSalary());
		Employee e2=new PermanentEmployee(Id,Name,pay);
		e2.calculateSalary();
		System.out.println("PermamentEmployee salary:"+e2.getSalary());
		Loan l=new Loan();
		l.calculateLoanAmount(e1);
		l.calculateLoanAmount(e2);
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
