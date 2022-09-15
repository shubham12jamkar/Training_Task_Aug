package com.yash.Task4.SpringiocTask;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext4.xml");
    	 ConstructorMessage cm= (ConstructorMessage) context.getBean("cmessage");
    	 System.out.println(cm);
    }
}
