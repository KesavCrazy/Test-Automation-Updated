package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import Cucumber.Automation.Base2;
import PageObject.AmazonHomePageBabyProducts;

@RunWith(Cucumber.class)
public class BabyProducts extends Base2{
	
	 @Then("^user is clicking toysBabyProducts$")
	    public void user_is_clicking_toysbabyproducts() throws Throwable {
	       new AmazonHomePageBabyProducts(driver).ToysBabyProducts();
	       new AmazonHomePageBabyProducts(driver).BabyProducts();
	    }

	    @Then("^user is clicking starRatings$")
	    public void user_is_clicking_starratings() throws Throwable {
	    	 new AmazonHomePageBabyProducts(driver).StarRatings();
	    }

	    @And("^user is clicking on price$")
	    public void user_is_clicking_on_price() throws Throwable {
	    	 new AmazonHomePageBabyProducts(driver).MinPrice();
	    	 new AmazonHomePageBabyProducts(driver).MaxPrice();
	    	 new AmazonHomePageBabyProducts(driver).Go();
	    }

	    @And("^user is clicking on product$")
	    public void user_is_clicking_on_product() throws Throwable {
	    	 new AmazonHomePageBabyProducts(driver).Product();
	    }
}