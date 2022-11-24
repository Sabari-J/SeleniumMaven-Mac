package com.sabari.step_definitions;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import com.sabari.constants.Constants;
import com.sabari.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSearch_StepDefinition {

	WebDriver driver;

	@Given("user navigates to the HRM.com")
	public void user_navigates_to_the_website_google_com() {
		try {
			DriverManager.getDriver(Constants.APP_URL);
			LoginPage.enterCredentials();
			LoginPage.clickSubmitButton();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("Step 1");
	}

	@Then("the user searches the option")
	public void there_user_searches_the() {
		System.out.println("Step 2");
	}

}
