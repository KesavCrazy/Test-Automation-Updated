package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base2;
import PageObject.AmazonHomePageAmzEcho;

@RunWith(Cucumber.class)
public class EchoOrder extends Base2{
	
	@When("^user is Entering into menu option$")
    public void user_is_entering_into_menu_option() throws Throwable {
		new AmazonHomePageAmzEcho(driver).menu();
    }

    @Then("^user is clicking echoAlexa$")
    public void user_is_clicking_echoAlexa() throws Throwable {
    	new AmazonHomePageAmzEcho(driver).echoAlexa();
    }

    @And("^user is clicking on echoDot$")
    public void user_is_clicking_on_echoDot() throws Throwable {
    	new AmazonHomePageAmzEcho(driver).Echodot();
    }

    @And("^user is clicking on quantity$")
    public void user_is_clicking_on_quantity() throws Throwable {
    	new AmazonHomePageAmzEcho(driver).quantity();
    }

    @And("^user is clicking on addToCart$")
    public void user_is_clicking_on_addtocart() throws Throwable {
    	new AmazonHomePageAmzEcho(driver).AddToCart();
}
}
