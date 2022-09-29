package com.yash.intermediate_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest {
	
	//Student s=new Student();
	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		int count=Student.registeredhostel();
		assertEquals(count, 3);
		
	}
	
	

}
