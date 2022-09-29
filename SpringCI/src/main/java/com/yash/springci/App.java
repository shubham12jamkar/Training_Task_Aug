package com.yash.springci;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
	
		
		System.out.println("Second Spring using reference ");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e=(Employee)context.getBean("empci");
		System.out.println(e);
		
//		Employee e1=(Employee)context.getBean("empci1");
//		System.out.println(e1);
	}

}
