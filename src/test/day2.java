package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void pLoan() {
		System.out.println("Personal loan.");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first");
	}
	@Test
	public void prerequisites() {
		System.out.println("I will execute");
	}
	
}
