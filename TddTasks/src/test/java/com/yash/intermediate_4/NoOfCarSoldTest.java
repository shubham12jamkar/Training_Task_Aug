package com.yash.intermediate_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NoOfCarSoldTest {
	CarShopApp capp = new CarShopApp();

	@Test
	public void test_ShouldReturn_Book_AsOutput() {

		int count = capp.NoofCarSold();
		assertEquals(count, 7);

	}

}
