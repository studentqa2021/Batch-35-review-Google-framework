package com.cucumber.test;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.generic.GoogleSearchGeneric;

import cucumber.api.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	SoftAssert sf = new SoftAssert();
	@Before
	public void beforeAll() {
		
	}
	@After
	public void afterAll() {
		
	}
	@Given("open a browser and go to google")
	public void setup() {
		driver=GoogleSearchGeneric.setupGoogleApplication();
	}

	@When("search for iphone 13")
	public void action() {
		GoogleSearchGeneric.googleSeachPositiveAction(driver, sf);
	}

	@Then("iphone 13 should visible in search drop down")
	public void validation() {
		GoogleSearchGeneric.googleSeachPositiveValidation(driver, sf);
	}

}
