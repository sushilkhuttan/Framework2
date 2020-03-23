package MyFramework;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RediffMailPage;
import resources.base;

public class SignIn extends base{

	@BeforeTest
	public void initialise() throws IOException {
		driver = initialiseDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void Login() throws IOException {
		

		HomePage hp = new HomePage(driver);
		hp.signin().click();
		RediffMailPage rmp = new RediffMailPage(driver);
		rmp.login().sendKeys("HelLo");
		rmp.password().sendKeys("Hi");
		rmp.submit().click();
	
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		driver = null;
		
	}
	
}
