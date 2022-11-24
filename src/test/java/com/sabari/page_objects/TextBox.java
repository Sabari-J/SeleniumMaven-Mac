package com.sabari.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.login;

public class TextBox extends login {

	private WebElement fullNameTxtBox;
	private WebElement emailTxtBox;
	private WebElement currentAddressTxtBox;
	private WebElement permanentAddressTxtBox;
	private WebElement submitButton;

	private String name = "Sabari";
	private String email = "Sabari.sun@gmail";
	private String currentAddress = "46, Sabari Layouts, Hosur";
	private String permanentAddress = "Same as Above";

	Elements elemnts = new Elements();

	public void enterFulName() {
		fullNameTxtBox = driver.findElement(By.xpath("//input[@placeholder='Full Name' and @id='userName']"));
		fullNameTxtBox.click();
		sendText(fullNameTxtBox, name);
	}

	public void enterEmailId() {
		emailTxtBox = driver.findElement(By.xpath("//input[@placeholder='name@example.com' and @id='userEmail']"));
		emailTxtBox.click();
		sendText(emailTxtBox, email);

	}

	public void enterCurrentAddress() {
		currentAddressTxtBox = driver
				.findElement(By.xpath("//textarea[@placeholder='Current Address' and @id='currentAddress']"));
		currentAddressTxtBox.click();
		sendText(currentAddressTxtBox, currentAddress);
	}

	public void enterPermanentAddress() {
		permanentAddressTxtBox = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanentAddressTxtBox.click();
		sendText(permanentAddressTxtBox, permanentAddress);
	}

	public void clickSubmitButton() {
		submitButton = driver.findElement(By.xpath("//button[contains(., 'Submit') and @id='submit']"));
		submitButton.click();

	}


	// Temp soltn
	
	@Test
	public void textBoxSubmission() throws InterruptedException {

		TextBox txtBox = new TextBox();
		
		txtBox.enterFulName();
		txtBox.enterEmailId();
		txtBox.enterCurrentAddress();
		txtBox.enterPermanentAddress();
		txtBox.clickSubmitButton();

	}

}
