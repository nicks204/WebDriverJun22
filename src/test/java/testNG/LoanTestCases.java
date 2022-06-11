package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoanTestCases {
	
	
	@BeforeTest
	public void BeforeTest1() {
		
		System.out.println("Inside Before Test");
	}
	
	@BeforeMethod
	public void BeforeMethod1() {
		
		System.out.println("Inside Before Method");
	}
	
	@Test(priority=3)
	public void HomeLoanTest1() {
		
		System.out.println("Inside the HomeLoanTest1");
	}
	
	@Test(priority=2)
	public void HomeLoanTest2() {
		
		System.out.println("Inside the HomeLoanTest2");
	}
	
	@Test(groups= {"Sanity", "Regression"}, priority=1)
	public void CarLoanTest() {
		
		System.out.println("Inside the CarLoanTest");
	}
	
	@Test(groups= {"Regression"}, priority=0)
	public void MotorLoanTest() {
		
		System.out.println("Inside the MotorLoanTest");
	}
	
	@AfterMethod
	public void AfterMethod1() {
		
		System.out.println("Inside After Method");
	}
	
	@AfterTest
	public void AfterTest1() {
		
		System.out.println("Inside After Test");
	}

}
