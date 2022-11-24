package com.sabari.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Elements_ToolsQA {

	@Given("User has launched the portal")
	public static void user_has_launched_the_portal() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println("1");
	}

	@When("the user reached the page")
	public void the_user_reached_the_page() {
		
		System.out.println("11");
	}

	@Then("the user clicked on the option")
	public void the_user_clicked_on_the_option() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("111");
	}

}
