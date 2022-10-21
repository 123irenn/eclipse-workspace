package Mocktest;
import java.util.*;
class Associate{
	int associateId;
	String associateName;
	String workStatus;
	
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	public void trackAssociateStatus(int n) {
		if(n<=20)
		{
			setWorkStatus("Core skills");
		}
		else if(n<=40) {
			setWorkStatus("Advanced modules");
		}
		else if(n<=60) {
			setWorkStatus("Project phase");
		}
		else {
			setWorkStatus("Project phase");
			
		}
		
	}
}

public class DreamTek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Associate as=new Associate();
		System.out.println("Enter the associate id:");
		int assid=sc.nextInt();
		as.setAssociateId(assid);
		System.out.println("Enter associate name:");
		String assName=sc.next();
		as.setAssociateName(assName);
		System.out.println("Enter the number of days:");
		int n=sc.nextInt();
	    if(n<0)
	    {
	    	System.out.println("Invalid input");
	    }
	    else {
	    	as.trackAssociateStatus(n);
	    	System.out.println("The associate "+as.getAssociateName()+"work status :"+as.getWorkStatus());
	    }
		
		// TODO Auto-generated method stub

	}

}
