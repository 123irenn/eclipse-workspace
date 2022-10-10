package assessment;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
