package com.capg.retailstore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DiscountsTest {
	
	Discounts discount;

	@BeforeEach
	void setUp() throws Exception {
		discount = new Discounts();
	}

	@AfterEach
	void tearDown() throws Exception {
		discount = null;
	}

	@Test
	void testEmployeeDiscount() {
		assertEquals(140, discount.getDiscount(200, 1) );
	}
	
	@Test
	void testAffiliateDiscount() {
		assertEquals(180, discount.getDiscount(200, 2));
	}
	
	@Test
	void testRegularCustometDiscount() {
		assertEquals(190, discount.getDiscount(200, 3));
	}
	
	@Test
	void testNewCustomerDiscount() {
		assertEquals(194, discount.getDiscount(199, 4));
	}
	
	@Test
	void testGroceriesDiscount() {
		assertEquals(200, discount.getDiscount(200, 5));
	}


	@Test
	void test() {
		fail("Not yet implemented");
	}
}