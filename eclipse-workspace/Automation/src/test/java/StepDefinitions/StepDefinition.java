package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
       System.out.println("deciding the browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
  System.out.println("browser is triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
System.out.println("browser is started");
    }

   @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	//code to navigate to login url
    	System.out.println("Navigated to login url");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	//code to login
    	System.out.println("Logged in Successfully");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        //write own code
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }
    
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
      //home page validation
    	System.out.println("Validated home page");
    }

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_are_displayed(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }
    @When("^User signUp with following login details$")
    public void user_signup_with_following_login_details(DataTable data) throws Throwable {
       List<List<String>> obj = data.raw();
       System.out.println(obj.get(0).get(0));  
       System.out.println(obj.get(0).get(1)); 
       System.out.println(obj.get(0).get(2)); 
       System.out.println(obj.get(0).get(3)); 
       System.out.println(obj.get(0).get(4)); 
    }
 
    @When("^User login into application with (.+)  and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
       System.out.println(username);
       System.out.println(password);
    }
}