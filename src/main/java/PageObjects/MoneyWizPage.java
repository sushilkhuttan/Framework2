package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoneyWizPage {

	WebDriver driver;
	public MoneyWizPage(WebDriver driver) {
		this.driver = driver;	
	}
	By rediffHomeLink = By.linkText("rediff.com");
	
	public WebElement Homelink() {
		
		return driver.findElement(rediffHomeLink);
	}
	
}
