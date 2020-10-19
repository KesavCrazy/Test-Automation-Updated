package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import PageObject.HomePage;

@RunWith(Cucumber.class)
public class MyStepDefinition {
	WebDriver driver; 
	HomePage h;
	
    @Given("^User is n greencart landing page$")
    public void user_is_n_greencart_landing_page() throws Throwable {
    	driver=Base.getDriver();

    }
    @When("^User Searched for \"([^\"]*)\" vegetables$")
    public void user_searched_for_something_vegetables(String strArg1) throws Throwable {
    	 h = new HomePage(driver);
	     h.getSearch().sendKeys(strArg1);
	       Thread.sleep(3000);
    }
    
    @When("^User Searched for (.+) vegetables$")
    public void user_searched_for_vegetables(String name) throws Throwable {
    	  h = new HomePage(driver);
    	     h.getSearch().sendKeys(name);
    	       Thread.sleep(3000);
    }
//    @When("^User Searched for (.+) vegetables$")
//    public void user_searched_for_vegetables(String name) throws Throwable {
//       
//    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	 Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }

    
    
    @Then("^verify selected \"([^\"]*)\" item are displayed$")
    public void verify_selected_something_item_are_displayed(String strArg1) throws Throwable {
    	 Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    }
    @Then("^verify selected (.+) item are displayed$")
    public void verify_selected_item_are_displayed(String name) throws Throwable {
   	 Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(name));
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
       	driver.findElement(By.cssSelector("a.increment")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }

    @And("^user needs to proceded to checkout page for purchase$")
    public void user_needs_to_proceded_to_checkout_page_for_purchase() throws Throwable {
    	driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
   
    }

}