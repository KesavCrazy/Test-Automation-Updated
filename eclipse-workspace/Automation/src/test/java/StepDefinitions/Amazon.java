package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base2;
import PageObject.AccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon {
	WebDriver driver;
	 @Given("^Check User is n amazon landing page$")
	    public void check_user_is_n_amazon_landing_page() throws Throwable {
	      driver = Base2.getDriver();
	    }

	    @When("^Check User is in signUp page$")
	    public void check_user_is_in_signup_page() throws Throwable {
	       new AccountPage(driver).tosignInPage();
	       new AccountPage(driver).ToCreateAccountPage();
	    }

	    @Then("^Check User clicked continue$")
	    public void check_user_clicked_continue() throws Throwable {
	    	 new AccountPage(driver).CreateAccountPagecontinue();
	    }

	    @And("^Check User entered cus name$")
	    public void check_user_entered_cus_name() throws Throwable {
	    	 new AccountPage(driver).CreateAccountPageCustomerName();
	    }

	    @And("^Check User entered cus mob$")
	    public void check_user_entered_cus_mob() throws Throwable {
	    	 new AccountPage(driver).CreateAccountPageMobDropDown();
	    	 new AccountPage(driver).CreateAccountPageMobNumber();
	    }

	    @And("^Check User entered cus email$")
	    public void check_user_entered_cus_email() throws Throwable {
	    	 new AccountPage(driver).CreateAccountPageEmail();
	    }

	    @And("^Check User entered cus pass$")
	    public void check_user_entered_cus_pass() throws Throwable {
	    	 new AccountPage(driver).CreateAccountPagePassword();
	    }
}
