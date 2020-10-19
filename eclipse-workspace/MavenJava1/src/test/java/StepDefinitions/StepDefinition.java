package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.kesav.Utility.BaseTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	    driver =  new ChromeDriver();
		
	}
	@And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
    }
	

	@Given("^Click on Create account link home page to land on sign up page$")
	public void click_on_Create_account_link_home_page_to_land_on_sign_up_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ConstantsCucumber.AmazonSignPage amzSP = new ConstantsCucumber.AmazonSignPage(driver);
		amzSP.TosignInPage().click();
		ConstantsCucumber.AmazonCreateAccountPage amzCP= new ConstantsCucumber.AmazonCreateAccountPage(driver);
		amzCP.ToCreateAccountPage().click();
	}

	  @When("^user enters (.+) , (.+) , (.+) and (.+) logs in$")
	    public void user_enters_and_logs_in(String username, String mobno, String email, String pass) throws Throwable {
		  ConstantsCucumber.AmazonCreateAccountPage amzCP= new ConstantsCucumber.AmazonCreateAccountPage(driver);
			amzCP.CreateAccountPageCustomerName().sendKeys(username);
			amzCP.CreateAccountPageMobDropDown().click();
			driver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[91]/a")).click();
			amzCP.CreateAccountPageMobNumber().sendKeys(mobno);
			amzCP.CreateAccountPageEmail().sendKeys(email);
			amzCP.CreateAccountPagePassword().sendKeys(pass);
			amzCP.CreateAccountPagecontinue().click();
	    }
	

	@Then("^Verify that user is successfully signed up$")
	public void verify_that_user_is_successfully_signed_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
//		PortalHomePage p = new PortalHomePage(driver);
//	Assert.assertTrue(getSearchBox().displayed());
	
	}
	
	@And("^Close the driver$")
    public void close_the_driver() throws Throwable {
       driver.quit();
    }
}
