package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver drive) {
		
		this.driver = drive;
	}
	
	public void AppLogin(String UserNameVal, String PassowrdVal) {

		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PassowrdVal);

		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();

	}

}
