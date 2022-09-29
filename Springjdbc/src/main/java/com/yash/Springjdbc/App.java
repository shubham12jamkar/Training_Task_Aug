package com.yash.Springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.Springjdbc.dao.StudentDao;
import com.yash.Springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/springjdbc/applicationcontext.xml");
        StudentDao stdao=context.getBean("StudentDao", StudentDao.class);
      Student stud=new Student(); 
		stud.setId(101);
		stud.setName("shubham jamkar");
		int r=stdao.insert(stud);//insert the details
		
//		int r=stdao.updatedetails(stud);//update the details
//		System.out.println(r + "Student added Successfully ");
//		System.out.println(r + "Student details updated ");
		
//		int r=stdao.deletedetails(107);//delete the details
//		Student s=stdao.selectDetails(108);
//		System.out.println(s);
        
        List<Student> stu = stdao.getAllDetails();
        for (Student s1 : stu) {
        	 System.out.println(s1);
		}
       
    }
}
