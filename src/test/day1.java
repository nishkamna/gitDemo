package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last.");
	}
	
	
	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Hello");
	}
	@AfterSuite
	public void afSuite() {
		System.out.println("I am the last one no matter what!");
	}
	
	@Test
	public void demo2() {
		System.out.println("Bye...");
		Assert.assertTrue(false);
	}

}
