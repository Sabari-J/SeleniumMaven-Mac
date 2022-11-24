package com.sabari.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sabari.constants.Constants;

public class LoginPage {

	@FindBy(id = "txtUsername")
	private static WebElement Userid;

	@FindBy(id = "txtPassword")
	private static WebElement Password;

	@FindBy(id = "btnLogin")
	private static WebElement Submit_button;

	public static void enterURL() {

	}

	public static void enterCredentials() {
		Userid.sendKeys(Constants.Username);
		Password.sendKeys(Constants.Password);
	}

	public static void clickSubmitButton() {
		Submit_button.click();

	}
}
