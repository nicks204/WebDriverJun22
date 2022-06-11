package testNGWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test
	@Parameters({"UserName","Password"})
	public void test1(String UserNameVal,String PasswordVal) {
		
		LoginPage login = new LoginPage(driver);
		login.AppLogin(UserNameVal,PasswordVal);
		
		WebElement ErrorMsg = driver.findElement(By.className("error_msg"));
		String ActMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(ActMsg, ExpMsg);
	}
	
	@Test
	public void test2() {
		
		LoginPage login = new LoginPage(driver);
		login.AppLogin("abc@xyz.com","Abc@1234");
		
		WebElement ErrorMsg = driver.findElement(By.className("error_msg"));
		String ActMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(ActMsg, ExpMsg);
	}
	

	
	
	

}
