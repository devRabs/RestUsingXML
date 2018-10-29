package com.home.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleJUnit {

	String message =  "Hello World";
	
	@Before
	public void beforeOfPrintMessage() {
		System.out.println("Before Test");
	}
	
	@After
	public void aftertestPrintMessage() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void testPrintMessage() {
		assertEquals("Hello World",message);
	}
	
	@Test
	public void runOtherTest() {
		assertFalse(message==null);
	}
	
	@Test
	public void checkNotNull() {
		assertNotNull(message);
	}
}
