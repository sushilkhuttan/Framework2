package stepDefinition;

import java.io.IOException;

import org.junit.runner.RunWith;

import PageObjects.HomePage;
import PageObjects.RediffMailPage;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import resources.base;
//Add to dev branch
//Add Comment for git
//@RunWith(Cucumber.class)
public class HomePageMailTest extends base{
	HomePage hp;
	RediffMailPage rmp;
	/*@Given("^User opens the browser and goes to \"([^\"]*)\" $")
	public void user_opens_the_browser_and_goes_to(String string) throws IOException {
		driver = initialiseDriver();
		driver.get(prop.getProperty("url"));
	}

	@Given("^User clicks on Rediffmail icon$")
	public void user_clicks_on_Rediffmail_icon() {
		hp = new HomePage(driver);
		hp.redifficon().click();
	}

	@When("^User enters invalid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_invalid_username_and_password(String string, String string2) {
		
		rmp.login().sendKeys(string);
		rmp.password().sendKeys(string2);
		rmp.submit().click();
	}

	@Then("^User sees an error message on the page$")
	public void user_sees_an_error_message_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    if(rmp.errormsg().getText()=="Wrong username and password combination.") {
	    	System.out.println("Test passed");
	    }else {
	    	System.out.println("Test failed");
	    }
	}*/
	//@Given("^User opens the browser and goes to \"([^\"]*)\" $")
	@Given("User opens the browser and goes to {string}")
	public void user_opens_the_browser_and_goes_to_something(String strArg1) throws Throwable {
			driver = initialiseDriver();
			driver.get(strArg1);
	    }

	    @When("^User enters invalid username (.+) and password (.+)$")
	    public void user_enters_invalid_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	Thread.sleep(2000);
	    	System.out.println("Inside When "+strArg1);
	    	rmp = new RediffMailPage(driver);
	    	rmp.login().sendKeys(strArg1);
			rmp.password().sendKeys(strArg2);
			rmp.submit().click(); 
	    }

	    @Then("^User sees an error message on the page$")
	    public void user_sees_an_error_message_on_the_page() throws Throwable {
	    	Thread.sleep(2000);
	    	if(rmp.errormsg().getText().equalsIgnoreCase("Wrong username and password combination.")) {
		    	System.out.println("Test passed");
		    }else {
		    	System.out.println("Test failed");
		    }
	    }
	    
	    @And("^The browser is closed$")
	    public void the_browser_is_closed() throws Throwable {
	    	driver.close();
	    	System.out.println("Closed");
	    }
	    
	    @Given("^User clicks on Rediffmail icon$")
	    public void user_clicks_on_rediffmail_icon() throws Throwable {
	    	hp = new HomePage(driver);
			hp.redifficon().click();
	    }
	
	
}
