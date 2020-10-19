package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base2;
import PageObject.AmazonPrimeVideo;

@RunWith(Cucumber.class)
public class AmzPrime {
	public WebDriver driver;
	
	  @Given("^user is given with landing url$")
	    public void user_is_given_with_landing_url() throws Throwable {
	      driver = Base2.getDriver();
	    }

	    @When("^user is clicking on the prime video button it should land on video page$")
	    public void user_is_clicking_on_the_prime_video_button_it_should_land_on_video_page() throws Throwable {
	       new AmazonPrimeVideo(driver).JoinPrime();
	    }

	    @Then("^language change should take place$")
	    public void language_change_should_take_place() throws Throwable {
	    	for	(String childTab : driver.getWindowHandles())
			{
					driver.switchTo().window(childTab);
				}
	    	 new AmazonPrimeVideo(driver).LanguageIcon();
	    	 new AmazonPrimeVideo(driver).Englishlanguage();
	    }

	    @And("^user should go into video play$")
	    public void user_should_go_into_video_play() throws Throwable {
	    	new AmazonPrimeVideo(driver).StartFreeTrial();
	    }
}