package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	 WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	By rediff = By.className("mailicon");
	By money = By.className("moneyicon");
	By business = By.className("bmailicon");
	By signin = By.className("signin");
	By Titlemovie = By.cssSelector("div[class*='movies'] h3");
	
	public WebElement redifficon() {
		return driver.findElement(rediff);
		
	}
	public WebElement money() {
		return driver.findElement(money);
	}
	
	public WebElement businesslink() {
		return driver.findElement(business);
	}
	
	public WebElement signin() {
		return driver.findElement(signin);
	}
	
	public WebElement titlemovie() {
		return driver.findElement(Titlemovie);
	}
}
