package JavaTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UIActionsTest {

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\ravidisk\\latest\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000l);
		String selectAll = 	Keys.chord(Keys.CONTROL,"a");
		//driver.findElement(By.xpath("//body")).sendKeys(selectAll);
		driver.findElement(By.xpath("//body")).click();
	
		Thread.sleep(2000l);
		 Actions action = new Actions(driver); 
		 //unicode valuie is not required directly we can send a
		//action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).keyUp(Keys.CONTROL).perform();
		System.out.println(String.valueOf('\u0061'));
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		File f = new File("test.jpg");
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), f );


	try{
		Thread.sleep(2000l);
	}
		catch (Exception e){
			
		}
		driver.quit();

		
	}


}
