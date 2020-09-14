package stepDefinition;

import org.junit.runner.RunWith;

import PageObjects.ForgotYourPassword;
import PageObjects.HomePage;
import PageObjects.RediffMailPage;

//import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import resources.base;


@RunWith(Cucumber.class)
public class SignInPage extends base{
	@Given("^User is on \"([^\"]*)\"$")
    public void user_is_on_something(String strArg1) throws Throwable {
		driver = initialiseDriver();
		driver.get(strArg1);
    }

    @When("^User clicks on Forgotten password$")
    public void user_clicks_on_forgotten_password() throws Throwable {
    	RediffMailPage rmp = new RediffMailPage(driver);
    	rmp.forgotlink().click();
    }
//Test123
    @Then("^Forgot password page opens$")
    public void forgot_password_page_opens() throws Throwable {
       ForgotYourPassword fyp = new ForgotYourPassword(driver);
       String abc = fyp.fypTextheader().getText();
       if(abc.equalsIgnoreCase("Forgot your password?")) {
    	   System.out.println("Pass");
       }else {
    	   System.out.println("Fail");
       }
    }

    @And("^User clicks on Sign in link$")
    public void user_clicks_on_sign_in_link() throws Throwable {
    	HomePage hp = new HomePage(driver);
		hp.signin().click();
    }
}
