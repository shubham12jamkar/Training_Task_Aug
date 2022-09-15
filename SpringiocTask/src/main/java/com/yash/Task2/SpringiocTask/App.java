package com.yash.Task2.SpringiocTask;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext2.xml");
    	PrintMessage msg = (PrintMessage) context.getBean("printmsg");
    	System.out.println(msg);
    }
}
