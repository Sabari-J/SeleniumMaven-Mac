package com.sabari.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.login;

public class Buttons extends login {

	//private WebElement buttons;

	Elements elemnts = new Elements();

//	// Tempsolutn
	//public WebElement elementsTab;

//	@Test
//	public void clickOnElements() throws InterruptedException {
//
//		System.out.println("***");
//		Thread.sleep(3000);
//		elementsTab = driver.findElement(By.xpath("//h5[.= 'Elements']"));
//		System.out.println(elementsTab.isDisplayed());
//
//		scrollToElement(elementsTab);
//		elementsTab.click();
//
//	}

	@Test
	public void clickOnButtons() throws InterruptedException {

		elemnts.clickOnElements();
		Thread.sleep(3000);
		System.out.println("++++++");

		WebElement buttons = driver.findElement(By.xpath("//span[.='Buttons']"));
		clickableElement(buttons, 10);

	}

}
