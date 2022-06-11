package appTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		
		UserName.sendKeys("abc@xyz.com");
		Password.sendKeys("Abc@123");
		LoginButton.click();

	}

}
