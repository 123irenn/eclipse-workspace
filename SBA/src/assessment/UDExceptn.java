package assessment;

import java.util.Scanner;

class Candidate
{
	 private String name;
	 private String gender;
	 private double expectedSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	}
 class InvalidSalaryException extends Exception{
	 InvalidSalaryException(String str){
	 super(str);
	 }
 }

public class UDExceptn {
	public static Candidate getCandidateDetails() throws InvalidSalaryException{
		Scanner sc=new Scanner(System.in);
		Candidate obj=new Candidate();
		 System.out.println("Enter the candidate details\nName");
	        String name = sc.nextLine();
	       obj.setName(name);
	        System.out.println("Gender");
	        String gender = sc.next();
	        obj.setGender(gender);
	        System.out.println("Expected Salary");
	        double expectedSalary = sc.nextDouble();
	        
	        if(expectedSalary<10000)
	            throw new InvalidSalaryException("Registration Failed.Salary cannot be less than 10000.");
	        else
	        {
	            obj.setExpectedSalary(expectedSalary);
	            return obj;
	        }
	    }
		
	

	public static void main(String[] args) {
		   try
	        {
			   UDExceptn.getCandidateDetails();
	            System.out.println("Registration Successful");        
	        }
	        catch(InvalidSalaryException ise){
	            System.out.println(ise.getMessage());
	        }
	    
		// TODO Auto-generated method stub

	}

}
