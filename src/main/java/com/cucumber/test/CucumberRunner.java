package com.cucumber.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	plugin = {"json:target/cucumber.json"},
	features =  {"./src/main/resources/Google.feature"},
	glue= {"com.cucumber.test"},
	tags= {"@Regression"},
	//optional
	dryRun = false,
	monochrome= true

		)

public class CucumberRunner extends AbstractTestNGCucumberTests {

	//hook
}
