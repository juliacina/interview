package JavaTest;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Multiplewindowtest2 {
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
		
			((JavascriptExecutor) driver)
			.executeScript("window.open('http://localhost:8080/examples/jsp/')");
		
			String parent = driver.getWindowHandle();
			Set<String> oldhandles = driver.getWindowHandles();
			
			String child = "";
			for (String handle: oldhandles){
				driver.switchTo().window(handle);
				System.out.println("printiting for each handle " + driver.getTitle());
				if (driver.getTitle().contains("JSP Examples")){
					child = handle;
					break;
				}
			}

			
			driver.switchTo().window(parent);
			System.out.println("parent " + driver.getTitle());
		
			driver.switchTo().window(child);
			System.out.println("child " + driver.getTitle());
		
			
			
			Thread.sleep(5000l);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			driver.quit();
		}
	}
}
