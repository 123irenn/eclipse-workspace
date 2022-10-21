package Mocktest;
import java.util.*;
import java.util.Scanner;

class student{
	 protected int studentid;
	    protected String name;
	    protected int departmentid;
	    protected String gender;
	    protected String phone;
		public int getStudentid() {
			return studentid;
		}
		public void setStudentid(int studentid) {
			this.studentid = studentid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDepartmentid() {
			return departmentid;
		}
		public void setDepartmentid(int departmentid) {
			this.departmentid = departmentid;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
}
class hosteller extends student{
	 private String hostelname;
	    private int roomnumber;
		public String getHostelname() {
			return hostelname;
		}
		public void setHostelname(String hostelname) {
			this.hostelname = hostelname;
		}
		public int getRoomnumber() {
			return roomnumber;
		}
		public void setRoomnumber(int roomnumber) {
			this.roomnumber = roomnumber;
		}
		@Override
		 public String toString() {
		        return "student details\n"+ studentid+" "+ name+" "+ departmentid+" "+ gender+" "+phone+ " " + hostelname +" ";
		    }
}

public class Snmr {
	 public static hosteller gethostellerdetails()
	    {
	        hosteller hs=new hosteller();
	        Scanner sc =new Scanner(System.in);
	        System.out.println("enter details\nstudent id");
	        int sid=sc.nextInt();
	        hs.setStudentid(sid);
	        System.out.println("student name");
	        String sname=sc.next();
	        hs.setName(sname);
	        System.out.println("enter department id");
	        int did=sc.nextInt();
	        hs.setDepartmentid(did);
	        System.out.println("gender");
	        String gender=sc.next();
	        hs.setGender(gender);
	        System.out.println("phone");
	        String phone=sc.next();
	        hs.setPhone(phone);
	        System.out.println("hostel name");
	        String hname=sc.next();
	        hs.setHostelname(hname);
	        System.out.println("enter room no");
	        int rno=sc.nextInt();
	        hs.setRoomnumber(rno);
	        
	        
	          System.out.println("modify room no y/n");
	          String c=sc.next();
	          if(c.charAt(0)=='y')
	          {
	              System.out.println("new room number");
	              rno=sc.nextInt();
	              hs.setRoomnumber(rno);
	          }



	         System.out.println("modify phone no y/n");
	          String ch=sc.next();
	          if(ch.charAt(0)=='y')
	          {
	              System.out.println("new phone number");
	              phone=sc.next();
	              hs.setPhone(phone);
	          }
	        
	        return hs;
	        
	    }

	public static void main(String[] args) {
		 
        Snmr sn=new Snmr();
    hosteller hos=new hosteller();
    hos=sn.gethostellerdetails();
    System.out.println(hos);
		// TODO Auto-generated method stub

	}

}
