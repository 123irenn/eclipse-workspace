package com.unitTest.SpringDiS;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("Person.xml");  
    	System.out.println("welcome");
    	Person p=context.getBean("person",Person.class);
    	p.display();
    }
}
