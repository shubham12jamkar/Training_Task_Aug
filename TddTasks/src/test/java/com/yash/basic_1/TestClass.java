package com.yash.basic_1;

import org.junit.jupiter.api.Test;

import com.yash.basic_1.ConsecutiveNumber;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
	ConsecutiveNumber cn = new ConsecutiveNumber();

	@Test
	public void test_consecutive_number() {

		assertEquals(cn.add(1, 10), 55);
	}

	@Test
	public void test_consecutive_number2() {

		assertEquals(cn.add(11, 20), 55);
	}
}
