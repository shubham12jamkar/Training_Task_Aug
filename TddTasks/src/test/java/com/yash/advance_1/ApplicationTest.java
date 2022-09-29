package com.yash.advance_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ApplicationTest {
	ApplicationService ast=new ApplicationService();
	
	@Test
	public void test_application_return_maessagewithdeatils()
	{
		Application app1=new Application(101,"aaa");
		Application a=ast.addApplication(app1);
		assertEquals("Application sucessfully created" +a,"Application sucessfully created" +app1);
	}

}
