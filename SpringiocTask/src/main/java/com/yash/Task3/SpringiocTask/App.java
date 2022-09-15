package com.yash.Task3.SpringiocTask;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext3.xml");
    	DrawShape shape= (DrawShape) context.getBean("drawshape");
    	shape.displayInfo();
    }
}
