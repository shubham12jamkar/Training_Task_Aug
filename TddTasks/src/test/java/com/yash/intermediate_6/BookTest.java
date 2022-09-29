package com.yash.intermediate_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookTest {
Test1 t=new Test1();

@Test
public void test_ShouldReturn_Book_AsOutput() 
{
	 
	int count=t.bookcount("balaguruswamy");
	assertEquals(count, 3);
	
}

}
