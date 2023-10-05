package com.generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class GoogleSearchGeneric {
	
	public static WebDriver setupGoogleApplication() {//
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		return driver;
	}
	
	public static void googleSeachPositive(WebDriver driver,SoftAssert sf) {
		WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf']"));
		boolean status = search.isDisplayed();
		
		sf.assertTrue(status);

		search.click();
		search.sendKeys("iphone 13");

		// check options
		List<WebElement> searchOptions = driver.findElements(By.xpath("//*[@class='wM6W7d']"));

		for (int i = 0; i < searchOptions.size(); i++) {
			System.out.println("Search options = " + searchOptions.get(i).getText());
			sf.assertTrue(searchOptions.get(i).getText().contains("13"));

			if (searchOptions.get(i).getText().contains("13")) {
				System.out.println("Test pass");
			} else {
				System.out.println("Test fail");
			}
			
		}

	}
	public static void googleSeachPositiveAction(WebDriver driver,SoftAssert sf) {
		WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf']"));
		boolean status = search.isDisplayed();
		
		sf.assertTrue(status);

		search.click();
		search.sendKeys("iphone 13");

		

	}
	
	public static void googleSeachPositiveValidation(WebDriver driver,SoftAssert sf) {
		
		// check options
		List<WebElement> searchOptions = driver.findElements(By.xpath("//*[@class='wM6W7d']"));

		for (int i = 0; i < searchOptions.size(); i++) {
			System.out.println("Search options = " + searchOptions.get(i).getText());
			sf.assertTrue(searchOptions.get(i).getText().contains("13"));

			if (searchOptions.get(i).getText().contains("13")) {
				System.out.println("Test pass");
			} else {
				System.out.println("Test fail");
			}
			
		}

	}
	public static void googleSeachNegative(WebDriver driver,SoftAssert sf) {
		List<WebElement> searchOptions = driver.findElements(By.xpath("//*[@class='wM6W7d']"));

		for (int i = 0; i < searchOptions.size(); i++) {
			System.out.println("Search options = " + searchOptions.get(i).getText());
			sf.assertTrue(!searchOptions.get(i).getText().contains("14")
					||!searchOptions.get(i).getText().contains("12"));

			if (!searchOptions.get(i).getText().contains("14")
					||!searchOptions.get(i).getText().contains("12")) {
				System.out.println("Test pass");
			} else {
				System.out.println("Test fail");
			}
		}
	}

}
