package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	

		@Before("@MobileTest")
		public void beforeValidation() {
			System.out.println("Before Mobile hook");
		}

			@After("@MobileTest")
			public void afterValidation() {
				System.out.println("After Mobile hook");
			}
			
			@After("@SeleniumTest")
			public void afterSeleniumTest() {
				driver.close();
				
			}
			
			@Before("@WebTest")
			public void beforeWebValidation() {
				System.out.println("Before Web hook");
			}

				@After("@WebTest")
				public void afterWebValidation() {
					System.out.println("After Web hook");
				}
}