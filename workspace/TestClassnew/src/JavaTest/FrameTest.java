package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\temp\\selenium\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
	
		try{

		driver = driver.switchTo().frame(0);
		driver.findElement(By.name("firstname")).sendKeys("ravi tesdsdsfdsfdfdfsdf");
System.out.println(driver.getTitle());
		try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
		driver = driver.switchTo().frame(1);
		//System.out.println(driver.getTitle());
		if (driver.getPageSource().contains("Content 1 Title")){
			System.out.println("found text");
		}
		
		//no such element exception
		driver.findElement(By.name("firstname")).sendKeys("ravi tesdsdsfdsfdfdfsdf");
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		}
		finally{
		driver.quit();
		}
	}

}
