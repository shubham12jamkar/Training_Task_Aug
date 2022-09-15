package com.yash.Task5.SpringiocTask;

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
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext5.xml");
    	 SetterMessage sm=  (SetterMessage) context.getBean("smessage");
    	 System.out.println(sm);
    }
}
