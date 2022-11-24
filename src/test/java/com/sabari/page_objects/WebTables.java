package com.sabari.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.login;

public class WebTables extends login {

	private WebElement webTabls;

	// Tempsolutn
	public WebElement elementsTab;

	@Test
	public void clickOnElements() throws InterruptedException {

		System.out.println("***");
		Thread.sleep(3000);
		elementsTab = driver.findElement(By.xpath("//h5[.= 'Elements']"));
		System.out.println(elementsTab.isDisplayed());

		scrollToElement(elementsTab);
		elementsTab.click();

	}

	@Test
	public void clickOnWebTables() {

		webTabls = driver.findElement(By.xpath("//span[(.='Web Tables')]"));
		webTabls.click();

	}

}
