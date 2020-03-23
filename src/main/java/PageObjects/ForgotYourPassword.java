package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotYourPassword {
WebDriver driver;
	public ForgotYourPassword(WebDriver driver) {
		this.driver = driver;
		
	}
	By fypText = By.cssSelector("div.padt15.ralignC.rbold.f16");
	
	
	public WebElement fypTextheader() {
		return driver.findElement(fypText);
	}
}
