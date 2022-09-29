package com.yash.basic_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfExpressionTest {
	SumOfExpression s=new SumOfExpression();
	@Test
	public void test_sumOf_Expression1()
	{
		assertEquals(s.calculateSum("2+3+4"), 9);
	}
	
	@Test
	public void test_sumOf_Expression2()
	{
		assertEquals(s.calculateSum("2+5+4"), 11);
	}
}
