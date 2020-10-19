package StepDefinitions;

	import cucumber.api.DataTable;
import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

import Cucumber.Automation.ExcelSheet;

	@RunWith(Cucumber.class)
	public class CheckUp {

	    @Given("^User is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	    	System.out.println("user landing page");
	    }

	    @When("^check User login into application with$")
	    public void check_user_login_into_application_with_and() throws Throwable {
	    
	        System.out.println(ExcelSheet.getData().get("0"));  
	        System.out.println(ExcelSheet.getData().get("1")); 
	        System.out.println(ExcelSheet.getData().get("2")); 
	        System.out.println(ExcelSheet.getData().get("3")); 
	        System.out.println(ExcelSheet.getData().get("4")); 
	     }

	    @Then("^check page is populated$")
	    public void check_page_is_populated() throws Throwable {
	    	System.out.println("page_is_populated");
	        
	    }
}