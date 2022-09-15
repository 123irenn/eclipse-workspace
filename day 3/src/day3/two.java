package day3;
class Member {
	String name, add;
	int age, ph, salary;
	public void print() {
		System.out.println("Salary- "+salary);
		
	}
}
class Employee extends Member {
	
    int spec;
}

class Manager extends Member{
	
	int dept;
}

public class two {

	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println("Manager details:");
		m.name="rahul";
		m.age=22;
		m.ph=222345;
		m.add="ab";
		m.salary=22000;
		System.out.println(""+m.name);
		System.out.println(""+m.age);
		System.out.println(""+m.ph);
		System.out.println(""+m.add);
		System.out.println(""+m.salary);
		 
		Employee e=new Employee();
		System.out.println("Employee deatils:");
		e.name="bobby";
		e.age=23;
		e.ph=345678;
		e.add="ad";
		e.salary=22000;
		System.out.println(""+e.name);
		System.out.println(""+e.age);
		System.out.println(""+e.ph);
		System.out.println(""+e.add);
		System.out.println(""+e.salary);
		
		
		// TODO Auto-generated method stub

	}

}
