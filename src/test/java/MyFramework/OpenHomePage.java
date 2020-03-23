package MyFramework;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.MoneyWizPage;
import PageObjects.RediffMailPage;
import resources.base;

public class OpenHomePage extends base {
	HomePage hp;
	@BeforeTest
	public void initialise() throws IOException {
	driver = initialiseDriver();
	driver.get(prop.getProperty("url"));
	}
	@Test
	public void Homepage() throws IOException {
		
		hp = new HomePage(driver);
		hp.redifficon().click();
		RediffMailPage rmp = new RediffMailPage(driver);
		rmp.login().sendKeys("Hello");
		rmp.BackToHome().click();
		
		MoneyWizPage mwp = new MoneyWizPage(driver);
		hp.money().click();
		mwp.Homelink().click();
		
		//hp.businesslink().click();
	}
	@Test
	public void ValidateTitle() {
		
		Assert.assertEquals(hp.titlemovie().getText(), "MOVIES");
	}
/*	@Test
	public void moneywiz() {
		MoneyWizPage mwp = new MoneyWizPage(driver);
		hp.money().click();
		mwp.Homelink().click();
	}
	@Test(dependsOnMethods={"moneywiz"})
	public void business() {
		hp.businesslink().click();
	}
	*/
	@AfterTest
	public void end() {
		
		driver.close();
		driver = null;
		System.out.println("End of test Homepage");
}
}
