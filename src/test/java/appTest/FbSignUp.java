package appTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement CreateAccount = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		CreateAccount.click();
		
		WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select ddDate = new Select(Date);
		ddDate.selectByVisibleText("15");
		
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Jul");
		
		WebElement GenderFemale = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		GenderFemale.click();
		
		//label[text()='Female']/following-sibling::input	

	}

}
