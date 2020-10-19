package com.kesav.SeleniumPrac;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class StaticDynamicButtonsDropDowns {

	public static void main(String[] args) throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http:spicejet.com");
	        driver.manage().window().maximize();
	        Thread.sleep(8000);
	        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).click();
	        driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/input[1]")).click();
	        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[7]/a")).click();
	       // Select oSelect = new Select(driver.findElement(By.id("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]")));
	        //oSelect.selectByVisibleText("Chennai (MAA)");		
//	        Select oSelect1 = new Select(driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/select")));
//	        oSelect1.selectByVisibleText("Coimbatore (CJB)");
	        driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[6]/div[1]")).click();
	        Thread.sleep(3000);
	       Select oselect2 = new Select( driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
	       oselect2.selectByVisibleText("4");
	       Select oselect3 = new Select( driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[7]/div/select")));
	       oselect3.selectByVisibleText("AED");
	       driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[4]/input[1]")).click();
	       driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[5]/a")).click();
//	       for(int i=1;i<4;i++);
//	       {
//	       driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
//	       }
//	       driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[4]/td[5]/a")).click();
	       driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[12]")).getSize();
	}
}
 