package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRandomEmailGenerator {

	@Test()
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generateMail();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");
		Assert.assertTrue(true, "feedback@yoursite.com");
		//		Assert.assertFalse(true, "feedback");
	}

	@Test()
	public void testFeedbackGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String feed = obj.generateFeedback();

		Assert.assertNotNull(feed);
		Assert.assertEquals(feed, "feedback");
		Assert.assertTrue(true, "feedback");

	}

	@Test()
	public void testNameGenerator() {
		RandomEmailGenerator obj = new RandomEmailGenerator();
		String feed = obj.generateName();

		Assert.assertNotNull(feed);
		Assert.assertEquals(feed, "abc");
		Assert.assertTrue(true, "abc");

	}
}
