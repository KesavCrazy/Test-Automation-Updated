package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import Cucumber.Automation.Base2;
import cucumber.api.java.Before;

public class Hooks2 {
  public WebDriver driver;
  

	public void Before() throws IOException {
		 driver = Base2.getDriver();
	}
}