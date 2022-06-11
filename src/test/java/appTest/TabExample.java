package appTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String Parent = driver.getWindowHandle();
		
		WebElement element = driver.findElement(By.xpath("//button[@id='tabButton']"));
		element.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		
		while(itr.hasNext()) {
			
			String currentVal = itr.next();
			System.out.println(currentVal);
			
			if(currentVal!=Parent) {
				
				driver.switchTo().window(currentVal);
			}
			
		}
		
		WebElement ChildElement = driver.findElement(By.xpath("//h1"));		
		System.out.println("Text from child window " + ChildElement.getText());
		
		driver.close();
		
		driver.switchTo().window(Parent);
		
		System.out.println("Back to Parent Window");
		
		driver.close();
	}

}
