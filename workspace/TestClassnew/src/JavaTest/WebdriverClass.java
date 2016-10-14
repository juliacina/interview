package JavaTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WebdriverClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//createAndStartService();
		System.setProperty("webdriver.chrome.driver", "E:\\temp\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		//stopService();

	}
	static ChromeDriverService  service;
	 public static void createAndStartService() throws IOException {
		 ChromeDriverService  service = new ChromeDriverService.Builder()
		        .usingDriverExecutable(new File("D:\\RaviDisk\\latest\\selenium\\chromedriver_win32\\chromedriver.exe"))
		        .usingAnyFreePort()
		        .build();
		    service.start();
		  }

	  public static void stopService() {
		    service.stop();
		  }
}
