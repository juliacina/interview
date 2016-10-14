package JavaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactorytsets {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverPage wp = new WebDriverPage();
		wp.inputSec();
		WebDriverPage wp1 = new WebDriverPage();
		wp1.inputSec();
		WebDriver driver = wp.getDriver();
		driver.quit();
	}

}
