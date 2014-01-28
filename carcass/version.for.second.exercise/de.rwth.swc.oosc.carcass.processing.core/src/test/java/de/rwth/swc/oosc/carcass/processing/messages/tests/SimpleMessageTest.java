package de.rwth.swc.oosc.carcass.processing.messages.tests;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleMessageTest {
	private static final String someText = "s0m3 r4nd0m t3x7";

	@BeforeClass
	public static void init() {
		// This is executed once for every test class
	}
	
	@Before
	public void initTestData() {
		// This is executed before the execution of every single test case
	}
	
	@After
	public void cleanupTestData() {
		// This is executed after the execution of every single test case
	}
	
	@AfterClass
	public static void cleanup() {
		// This is executed once after the execution of all the tests in this class
	}
	
	@Test
	public void testMessages() {
		// This is an actual test case
		StringBuilder builder = new StringBuilder();
		builder.append(someText);

		// Asserts check if conditions are full filled.
		// Check the Assert class for all the separate assertions.
		// You can add an optional String parameter as first parameter.
		// This String is printed to the console if (and only if) the assert fails.
		Assert.assertEquals("Builder needs to echo the text that was given.", someText, builder.toString());
	}
}
