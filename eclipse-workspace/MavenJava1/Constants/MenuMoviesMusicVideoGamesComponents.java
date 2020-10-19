package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuMoviesMusicVideoGamesComponents {
	WebDriver driver;

	 public MenuMoviesMusicVideoGamesComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[3]")
	 WebElement allMoviesTvshows;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[4]")
	 WebElement bluRay;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[5]")
	 WebElement allEnglish;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[6]")
	 WebElement allHindi;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[7]")
	 WebElement entertainmentCollectibles;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[10]")
	 WebElement gamingConsole;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[11]")
	 WebElement latestVideoGames;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[12]")
	 WebElement gamingAccesso;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[13]")
	 WebElement pcGames;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[14]")
	 WebElement videoGamesDeals;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[15]")
	 WebElement allVideoGames;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[15]")
	 WebElement allMusic;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[15]")
	 WebElement internationalMusic;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[15]")
	 WebElement filmSongs;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[15]")
	 WebElement indianClassical;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[15]")
	 WebElement musicalInstrumentsProfessAudio;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[15]")
	 WebElement openWebPlayer;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[15]")
	 WebElement amazonPrimeMusic;
	 
	 
	 
	 public void allMoviesTvshows()
	 {
		 allMoviesTvshows.click();		 
	 }
	 public void bluRay()
	 {
		 bluRay.click();		 
	 }
	 public void allEnglish()
	 {
		 allEnglish.click();		 
	 }
	 
	 public void allHindi()
	 {
		 allHindi.click();		 
	 }
	 public void entertainmentCollectibles()
	 {
		 entertainmentCollectibles.click();		 
	 }
	 public void gamingConsole()
	 {
		 gamingConsole.click();		 
	 }
		 
	 public void latestVideoGames()
	 {
		 latestVideoGames.click();		 
	 }
	 public void gamingAccesso()
	 {
		 gamingAccesso.click();		 
	 }
	 public void pcGames()
	 {
		 pcGames.click();		 
	 }
	 public void videoGamesDeals()
	 {
		 videoGamesDeals.click();		 
	 }
	 public void allVideoGames()
	 {
		 allVideoGames.click();		 
	 }
	 public void allMusic()
	 {
		 allMusic.click();		 
	 }
	 public void internationalMusic()
	 {
		 internationalMusic.click();		 
	 }
	 public void filmSongs()
	 {
		 filmSongs.click();		 
	 }
	 public void indianClassical()
	 {
		 indianClassical.click();		 
	 }
	 public void musicalInstrumentsProfessAudio()
	 {
		 musicalInstrumentsProfessAudio.click();		 
	 }
	 public void openWebPlayer()
	 {
		 openWebPlayer.click();		 
	 }
	 public void amazonPrimeMusic()
	 {
		 amazonPrimeMusic.click();		 
	 }
}
