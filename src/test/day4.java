package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"url"})
	@Test
	public void webLoginHomeLoan(String urlName) {
		//selenium code
		System.out.println("webLoginHomeLoan in PersonalLoan");
		System.out.println(urlName);
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLoan() {
		//Appium code
		System.out.println("mobileLoginHomeLoan");
	}
	
	@Test
	public void loginAPIHomeLoan() {
		//Rest API automation code
		System.out.println("loginAPIHomeLoan");
	}

}
