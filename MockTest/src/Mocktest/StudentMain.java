package Mocktest;
import java.util.*;
class Student1{
	int id;
	String name;
	int []marks;
	float average;
	char grade;
	Student1()
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.average=average;
		this.grade=grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void calculateAvg() {
		float sum=0;
		for(int i=0;i<this.marks.length;i++)
		{
			sum+=this.marks[i];
			
		}
		average=(float)(sum/this.marks.length);
		setAverage(average);
	}
	public void findGrade()
    {int flag=0;
        for(int i=0;i<this.marks.length;i++)
        {
            if(this.marks[i]<50)
            {
                flag++;
            }
        }
        if(flag>0)
        {
            grade='F';
        }
        else
        {
            if(this.average>=80 && this.average<=100)
            {
                grade='O';
            }
            else if(this.average>=50 && this.average<=79)
            {
                grade='A';
            }
            else
            {
                grade='F';
            }
        }
        setGrade(grade);
    }
}

public class StudentMain {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the id:");
	        int id=sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter the name:");
	        String name=sc.nextLine();
	        System.out.println("Enter the number of subjects:");
	        int n=sc.nextInt();
	        int marks[]=new int[n];
	        for(int i=0;i<n;i++)
	        {   System.out.println("Enter mark for subject "+(i+1)+":");
	            marks[i] = sc.nextInt();
	        }
	        Student1 obj=new Student1();
	        obj.setName(name);
	        obj.setId(id);
	        obj.setMarks(marks);
	        obj.calculateAvg();
	        obj.findGrade();
	        System.out.println("Id:"+obj.getId());
	        System.out.println("Name:"+obj.getName());
	        System.out.println("Average:"+obj.getAverage());
	        System.out.println("Grade:"+obj.getGrade());
	    }
	
		

	}


