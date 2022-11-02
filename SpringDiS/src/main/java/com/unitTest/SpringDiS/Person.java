package com.unitTest.SpringDiS;

public class Person {
	private String name;
	private String Department;
	Person(String name,String Department)
	{
		this.name=name;
		this.Department=Department;
	}
	/*public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		Department = department;
	}*/
	public void display()
	{
		System.out.println("My self is "+name+" from "+Department);
	}

}
