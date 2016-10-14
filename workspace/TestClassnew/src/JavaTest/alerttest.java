package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class alerttest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "E:\\temp\\selenium\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://localhost:8080/examples/webdriver.html");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000l);
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
