package JavaTest;

import static org.hamcrest.Matchers.greaterThan;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAlert;

import org.openqa.selenium.JavascriptExecutor;

public class multiplewindowtest {
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\temp\\selenium\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
		driver.get("http://localhost:8080/examples/webdriver.html");
		driver.manage().window().maximize();
		windowTest();
	}

	
	public static void windowTest() {
		try {
		
		
		
			String parent = driver.getWindowHandle();
			Set<String> oldhandles = driver.getWindowHandles();

			((JavascriptExecutor) driver)
					.executeScript("window.open('http://localhost:8080/examples/jsp/')");
		
			Set<String> newhandles = driver.getWindowHandles();
			newhandles.removeAll(oldhandles);
			String child = new ArrayList<>(newhandles).get(0);
		
			oldhandles = driver.getWindowHandles();
			((JavascriptExecutor) driver)
					.executeScript("window.open('http://localhost:8080/examples/websocket-deprecated/')");
		
			newhandles = driver.getWindowHandles();
			newhandles.removeAll(oldhandles);
			String child2 = new ArrayList<>(newhandles).get(0);
			driver.switchTo().window(parent);
			System.out.println("parent " + driver.getTitle());
		
			driver.switchTo().window(child);
			System.out.println("child " + driver.getTitle());
		
			driver.switchTo().window(child2);
			System.out.println("child2 " + driver.getTitle());
			
			Thread.sleep(5000l);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			driver.quit();
		}
	}
}
