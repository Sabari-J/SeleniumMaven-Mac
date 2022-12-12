package com.sabari.webdriver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.sabari.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static WebDriver driver = null;

	public static void launchBrowser() {

		try {

			// switch (Constants.BROWSER)
			switch (Constants.BROWSER) {

			case "chrome":

				// System.setProperty(Constants.Chrome_Driver,
				// Constants.Chrome_Driver_Location); NOT REQUIRED IN MAC

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "safari":

				// System.setProperty(Constants.Safari_Driver,
				// constants.Safari_Driver_Location); NOT REQUIRED IN MAC

				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;

			default:
				driver = new ChromeDriver();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

}
