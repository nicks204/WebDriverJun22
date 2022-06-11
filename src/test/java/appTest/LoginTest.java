package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Thread.sleep(5000);
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abc@1234");
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		WebElement ErrorMsg = driver.findElement(By.className("error_msg"));
		System.out.println("Actual Message is " + ErrorMsg.getText());
		
		String ActMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		if(ActMsg.equals(ExpMsg)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total num of links are " + Links.size());
		
		for(int i=0;i<Links.size();i++) {
			
			System.out.println("Link Href is " + Links.get(i).getAttribute("href"));
		}
		
		
		driver.close();
	}

}
