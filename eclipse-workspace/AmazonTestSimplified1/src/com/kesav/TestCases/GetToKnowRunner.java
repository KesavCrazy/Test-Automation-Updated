package com.kesav.TestCases;

import org.testng.annotations.Test;

import com.kesav.Constants.Extras;
import com.kesav.Constants.GetToKnowComponents;
import com.kesav.Constants.HomeSearchDropdownBox;

public class GetToKnowRunner extends BaseTest{
		
		@Test
		public void GetToKnowMethod() throws InterruptedException {
		
			new GetToKnowComponents(driver).AboutUs();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).Career();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).PressRelease();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).AmazonCares();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).GiftASmile();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).Facebook();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).Twitter();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).Instagram();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).SellOnAmzon();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).SellunderAmazon();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).BecomeAnAffi();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).FulfilmentByAmazon();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).AdvertiseYourPrduct();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).AmzPayOn();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).covidAmzon();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).yourAcc();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).returnsCentre();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).purchaseProtection();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).amzAppDownload();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).amzAssDownload();
			new Extras(driver).ComeBack();
			new GetToKnowComponents(driver).Help();
			new Extras(driver).ComeBack();
		}
}

