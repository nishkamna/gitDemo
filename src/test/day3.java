package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	 @BeforeClass
	 public void bfclass() {
		 System.out.println("before executing any methods in the class.");
	 }
	
	@Parameters({"url", "API/username"})
	 @Test
	public void webLoginCarLoan(String urlname, String key) {
		//selenium code
		System.out.println("webLoginCarLoan");
		System.out.println(urlname);
		System.out.println(key);

	}
	@BeforeMethod
	public void beforeeverymethod() {
		System.out.println("I am going to run before every method.");
	}
	@Test(dataProvider="getData")
	public void mobileLoginCarLoan(String username, String password) {
		//Appium code
		System.out.println("mobileLoginCarLoan");
		System.out.println(username);
		System.out.println(password);
	}
	@AfterMethod
	public void aftereveryMethod() {
		System.out.println("I am going to execute after every method.");
	}
	
	@AfterClass
	public void aftClass() {
		System.out.println("after executing all the methods in the class.");
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I am number 1.");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLogoutCarLoan() {
		//Appium code
		System.out.println("mobileLogoutCarLoan");
	}
	
	@Test(enabled=false)
	public void mobilesigninCarLoan() {
		//Appium code
		System.out.println("mobilesigninCarLoan");
	}
	
	@Test(dependsOnMethods= {"webLoginCarLoan", "mobileLogoutCarLoan"} )
	public void APICarLoan() {
		//Rest API automation code
		System.out.println("loginAPIcarLoan");
	}
	
	@DataProvider 
	public Object[][] getData() {
		// 1st combination - username password - good credit history
		//2nd - username password - no credit history
		//3rd - username password - fraudulent credit history
		
		Object[][] data = new Object[3][2];
		data[0][0]="ABC";
		data[0][1]="123";
		
		data[1][0]="XYZ";
		data[1][1]="456";
		
		data[2][0]="DEF";
		data[2][1]="789";
		
		return data;
		
	}

}
