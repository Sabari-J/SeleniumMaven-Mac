package com.sabari.runner;



//@RunWith(Cucumber.class)

@io.cucumber.testng.CucumberOptions(
	features = "src/test/resources/Featurefiles/PageVerification.feature", 
	glue = {"com.sabari.step_definitions", "com.sabari.common_stepdefinition" }, 
	dryRun = false, 
	monochrome = true)

public class TestRunner {

}
