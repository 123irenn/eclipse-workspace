package com.unitTest.ioc12;

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
    		    new ClassPathXmlApplicationContext("applicationContext.xml");  
    	System.out.println("welcome");
    	Car c=context.getBean("car",Car.class);
    	c.price();
    	c.speed();
    }
}
