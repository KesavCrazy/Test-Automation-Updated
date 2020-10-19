package com.kesav.TestCases;

import org.testng.annotations.Test;

import com.kesav.Constants.Back;
import com.kesav.Constants.GetToKnowComponents;
import com.kesav.Constants.HomeSearchDropdownBox;

public class GetToKnowRunner extends BaseTest{
		
		@Test
		public void GetToKnowMethod() throws InterruptedException {
		
			new GetToKnowComponents(driver).AboutUs();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).Career();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).PressRelease();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).AmazonCares();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).GiftASmile();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).Facebook();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).Twitter();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).Instagram();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).SellOnAmzon();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).SellunderAmazon();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).BecomeAnAffi();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).FulfilmentByAmazon();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).AdvertiseYourPrduct();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).AmzPayOn();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).covidAmzon();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).yourAcc();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).returnsCentre();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).purchaseProtection();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).amzAppDownload();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).amzAssDownload();
			new Back(driver).ComeBack();
			new GetToKnowComponents(driver).Help();
			new Back(driver).ComeBack();
		}
}

