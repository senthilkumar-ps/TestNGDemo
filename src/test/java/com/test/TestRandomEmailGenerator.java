package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRandomEmailGenerator {

	@Test()
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");
		Assert.assertTrue(true, "feedback@yoursite.com");
//		Assert.assertFalse(true, "feedback");
		
		String feed = obj.generateMail();
		
		Assert.assertNotNull(feed);
		Assert.assertEquals(feed, "feedback");
		Assert.assertTrue(true, "feedback");
		
	}

}
