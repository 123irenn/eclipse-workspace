package Mocktest;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.text.DecimalFormat;

public class EmployeeUtility {
	public Employee1[] getEmployeeDetails(String[] details) {
		       
       Employee1 ob[] =new Employee1[details.length];
       
       for(int i=0;i<details.length;i++){
           
           String x[] =details[i].split(";");
           
           Employee1 o=new Employee1();
           o.setEmpId(x[0]);
           o.setEmpName(x[1]);
           o.setSalary(Double.parseDouble(x[2]));
           
           ob[i]=o;
           
       }
       
       return ob;
       
	}

	public Stream<Employee1> getStreamOfEmployee(Employee1[] empDetails) {

        Stream<Employee1> s=Arrays.stream(empDetails);
        return s;
         
	}

	public String[] shortlistedEmployee(Stream<Employee1> empStream,double minSalary) {
        
        ArrayList<String> name=new ArrayList<>();
        
        empStream.forEach(a->{
            
           if(a.getSalary()>=minSalary){
               
               DecimalFormat df=new DecimalFormat("#.0");
               String sal=df.format(a.getSalary());
               
               name.add(a.getEmpId()+" "+a.getEmpName()+" "+sal);
           } 
            
            
            
        });

            
            String x[]=new String[name.size()];
            for(int i=0;i<x.length;i++){
                x[i]=name.get(i);
            }
            Arrays.sort(x);
            return x;



	}

}


