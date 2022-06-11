package testNGWebDriver;

import org.testng.annotations.Test;

import pages.LoginPage;

public class HomePageTest extends BaseClass{
	
	@Test
	public void test1() {
		
		LoginPage login = new LoginPage(driver);
		login.AppLogin("abc@xyz.com","Abc@1234");
		
		System.out.println("inside test1");
	}

}
