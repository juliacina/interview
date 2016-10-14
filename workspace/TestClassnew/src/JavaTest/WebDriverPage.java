package JavaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebDriverPage {

	
	
	@FindBy(name="security")
	WebElement txtSec;
	
	static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		if (driver == null)
	        driver = new InternetExplorerDriver();
		return driver;
	}


	public WebDriverPage(){
		System.setProperty("webdriver.ie.driver", "E:\\temp\\selenium\\IEDriverServer.exe");
		driver = getDriver();
		driver.get("http://localhost:8080/examples/webdriver.html");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void inputSec(){
		txtSec.clear();
		txtSec.sendKeys("ravisec");
		try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
