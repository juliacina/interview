package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverCustomProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile = allProfiles.getProfile("profiletoolsqa");
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		WebElement we = driver.findElement(By.id(""));
		Select s = new Select(we);

		driver.quit();
	Action click = 	new Actions(driver).click().build();
	click.perform();
	new Actions(driver).clickAndHold(we).moveByOffset(10, 20).release().build().perform();
		
	}

}
