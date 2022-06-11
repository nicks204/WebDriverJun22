package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total Rows are " + Rows.size());
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Total Columns are " + Columns.size());
		
		
		WebElement Data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println("The given data is " + Data.getText());
		
		for(int index=2;index<=Rows.size();index++) {
			
			String Xpath = "//table[@id='customers']/tbody/tr[" + index + "]/td[1]";
			WebElement Data1 = driver.findElement(By.xpath(Xpath));
			System.out.println("The given data is " + Data1.getText());
		}
		
		driver.close();
		
	}

}
