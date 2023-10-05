package com.regression;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.generic.GoogleSearchGeneric;

public class GoogleSearch {
	WebDriver driver;
	SoftAssert sf = new SoftAssert();
	@Test(priority = 0,groups = {"Smoke"})
	public void setup() {
		driver=GoogleSearchGeneric.setupGoogleApplication();
	}

	@Test(priority = 1,description = "OB 11 :Positive Sneario"
			,groups = {"Smoke"})
	public void test1() {
		
		GoogleSearchGeneric.googleSeachPositive(driver,sf);
	}

	@Test(priority = 2,dependsOnMethods = "test1",
			description = "OB 12: Negative Sneario",groups = {"Regression"})
	public void test2() {
		GoogleSearchGeneric.googleSeachNegative(driver, sf);
	}

	@Test(priority = 3,groups = {"Smoke"})
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 driver.quit();
	}

}
