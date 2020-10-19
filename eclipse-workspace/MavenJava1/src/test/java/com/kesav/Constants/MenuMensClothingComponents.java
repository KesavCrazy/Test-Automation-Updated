package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class MenuMensClothingComponents {
	WebDriver driver;

	 public MenuMensClothingComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[3]")
	 WebElement clothing;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[4]")
	 WebElement tShirtsPolos;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[5]")
	 WebElement shirts;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[6]")
	 WebElement jeans;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[7]")
	 WebElement innerWear;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[10]")
	 WebElement watches;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[11]")
	 WebElement bagsLuggage;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[12]")
	 WebElement sunglasses;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[13]")
	 WebElement jewellery;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[14]")
	 WebElement wallets;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[17]")
	 WebElement shoes;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[18]")
	 WebElement sportShoes;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[19]")
	 WebElement formalShoes;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[20]")
	 WebElement casualShoes;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[23]")
	 WebElement sportsWear;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[24]")
	 WebElement theDesignerBoutiq;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[25]")
	 WebElement mensFashion;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[26]")
	 WebElement amzFashion;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[27]")
	 WebElement mensHandLooms;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[28]")
	 WebElement fashionSalesDeals;
	 
	 public void clothing()
	 {
		 clothing.click();		 
	 }
	 public void tShirtsPolos()
	 {
		 tShirtsPolos.click();		 
	 }
	 public void shirts()
	 {
		 shirts.click();		 
	 }
	 
	 public void jeans()
	 {
		 jeans.click();		 
	 }
	 public void innerWear()
	 {
		 innerWear.click();		 
	 }
	 public void watches()
	 {
		 watches.click();		 
	 }
		 
	 public void bagsLuggage()
	 {
		 bagsLuggage.click();		 
	 }
	 public void sunglasses()
	 {
		 sunglasses.click();		 
	 }
	 public void jewellery()
	 {
		 jewellery.click();		 
	 }
	 public void wallets()
	 {
		 wallets.click();		 
	 }
	 public void shoes()
	 {
		 shoes.click();		 
	 }
	 public void sportShoes()
	 {
		 sportShoes.click();		 
	 }
	 public void formalShoes()
	 {
		 formalShoes.click();		 
	 }
	 public void casualShoes()
	 {
		 casualShoes.click();		 
	 }
	 public void sportsWear()
	 {
		 sportsWear.click();		 
	 }
	 public void theDesignerBoutiq()
	 {
		 theDesignerBoutiq.click();		 
	 }
	 public void mensFashion()
	 {
		 mensFashion.click();		 
	 }
	 public void amzFashion()
	 {
		 amzFashion.click();		 
	 }
	 public void mensHandLooms()
	 {
		 mensHandLooms.click();		 
	 }
	 public void fashionSalesDeals()
	 {
		 fashionSalesDeals.click();		 
	 }
	 
	 
	
}
