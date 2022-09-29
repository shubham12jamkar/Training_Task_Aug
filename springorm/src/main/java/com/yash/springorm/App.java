package com.yash.springorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springorm.dao.StudentDao;
import com.yash.springorm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studao=context.getBean("studentDao",StudentDao.class);
       
        //using constructor
        Student stu = new Student(2,"AAA");
//        int msg = studao.insert(stu);
//        System.out.println(msg + "insertion done");

 //       Student stu= new Student();
        //get single data
//        Student s =  studao.getStudentDetails(1);
//        System.out.println(s.getId());
//        System.out.println(s.getName());
     
        //get all data
//            List<Student> l =  studao.getAllStudent();
//            for (Student st : l) {
//				System.out.println(st.getId());
//				System.out.println(st.getName());
//			}
        
        //delete
//        	studao.deleteDetails(3);
//        	System.out.println("delete data");
        
        //update data
        studao.updateDetails(stu);
        System.out.println("update data");
    }
}
