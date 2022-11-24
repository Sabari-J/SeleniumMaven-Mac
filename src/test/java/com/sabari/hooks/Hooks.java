package com.sabari.hooks;

import com.sabari.utilities.CommonUtilities;
import com.sabari.webdriver_manager.DriverManager;

import io.cucumber.java.Before;

public class Hooks {

	CommonUtilities commonUtils = new CommonUtilities();

	//@Before
	public void beforeScenario() {
		System.out.println("BEFORE Scenario");

		try {

			commonUtils.loadProperties();

			if (DriverManager.getDriver() == null) {
				DriverManager.launchBrowser();
				CommonUtilities.initElements();
			}
		}

		catch (Exception e) {
			e.printStackTrace();

		}
	}
}
