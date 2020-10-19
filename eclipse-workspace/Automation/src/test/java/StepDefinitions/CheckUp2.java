package StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import PageObject.HomePage2;


@RunWith(Cucumber.class)
	public class CheckUp2 {
		WebDriver driver;
				
			  @Given("^CheckUp User is n greencart landing page$")
			    public void checkup_user_is_n_greencart_landing_page() throws Throwable {
			      driver = Base.getDriver();
			      
			    }
			
			  @When("^CheckUp User Searched for vegetables$")
			    public void checkup_user_searched_for_vegetables() throws Throwable {
				  new HomePage2(driver).getSearch();
				  Thread.sleep(3000);
			    }


			    @And("^CheckUp Added items to cart$")
			    public void checkup_added_items_to_cart() throws Throwable {
			    	new HomePage2(driver).getAddtoCart();
			    	  Thread.sleep(3000);
			    }
			    
			    @And("^CheckUp user needs to proceded to checkout page for purchase$")
			    public void checkup_user_needs_to_proceded_to_checkout_page_for_purchase() throws Throwable {
			    	new HomePage2(driver).getCart();
			    	new HomePage2(driver).getCheckout();
			    }

			    @Then("^CheckUp verify selected item are displayed$")
			    public void checkup_verify_selected_item_are_displayed() throws Throwable {
			    	Assert.assertTrue(driver.findElement(By.xpath("//p[@class='product-name']")).getText().contains("Cucumber"));
			    }

		}

