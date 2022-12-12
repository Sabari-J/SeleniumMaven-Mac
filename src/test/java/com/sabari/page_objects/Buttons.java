package com.sabari.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.login;

public class Buttons extends login {

	
	Elements elemnts = new Elements();



	@Test(priority=0)
	public void clickOnButtons() throws InterruptedException {

		elemnts.clickOnElements();
		//Thread.sleep(3000);
		System.out.println("++++++");

		WebElement buttons = driver.findElement(By.xpath("//span[(.='Buttons')]"));
		buttons.click();
		//clickableElement(buttons, 10);

	}

}
