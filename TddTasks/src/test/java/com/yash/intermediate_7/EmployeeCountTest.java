package com.yash.intermediate_7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeCountTest {

	AppTest app=new AppTest();
	
	
	@Test
	public void test_countemployee_return_count_asoutput()
	{
		int countemp=app.countemployee();
		assertEquals(countemp,5);
	}
	
}
