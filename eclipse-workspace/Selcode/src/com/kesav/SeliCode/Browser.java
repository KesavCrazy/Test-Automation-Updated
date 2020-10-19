package com.kesav.SeliCode;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.ie.*;
	import org.openqa.selenium.support.ui.Select;

	public class Browser {
	public static void main(String[] args) throws InterruptedException  {
	        
	        // TODO Auto-generated method stub
	        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        //driver.navigate().to("http://demo.guru99.com/");
	        driver.get("http://newtours.demoaut.com/");
	        driver.manage().window().maximize();
	        driver.findElement(By.name("userName")).sendKeys("mercury");    
	        driver.findElement(By.name("password")).sendKeys("mercury"); 
	        //driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("mercury");
	        driver.findElement(By.name("login")).click();
	        //driver.findElement(By.linkText("Flights")).click();
	        //driver.navigate().back();
	        //String outputurl = driver.getCurrentUrl();"
	        //System.out.println(outputurl);
	        //System.out.println(driver.getTitle());
	        
	        //Thread.sleep(3000);
	        
	        driver.get("http://newtours.demoaut.com/mercuryregister.php");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Sulagna");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Roy");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys("8274846454");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/input")).sendKeys("mimi.sulagna@gmail.com");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("Kolkata");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")).sendKeys("India");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys("Konnagar");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")).sendKeys("Bengal");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input")).sendKeys("221016");
	        Select oSelect = new Select(driver.findElement(By.name("country")));         
	        oSelect.selectByVisibleText("INDIA");
	        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Mimi");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("12345");
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")).sendKeys("12345");
	        driver.findElement(By.name("register")).click();
	        
	                    
	        //driver.findElement(By.partialLinkText("Flights")).click();
	        
	    }
		

	}


