package com.sabari.utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.sabari.constants.Constants;
import com.sabari.page_objects.LoginPage;
import com.sabari.webdriver_manager.DriverManager;

public class CommonUtilities {

	public void loadProperties() {

//		FileReader reader = null;
//
//		try {
//			reader = new FileReader("config.properties");
//
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}

		Properties prop = new Properties();

		try {
			prop.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Constants.APP_URL = prop.getProperty("APP_URL");
		Constants.BROWSER = prop.getProperty("BROWSER");
		Constants.Username = prop.getProperty("Username");
		Constants.Password = prop.getProperty("Password");

		// Constants.Chrome_Driver = prop.getProperty("Chrome_Driver");
		// Constants.Safari_Driver = prop.getProperty("Safari_Driver");
		// Constants.Chrome_Driver_Location = prop.getProperty("Chrome_Driver");
		// Constants.Safari_Driver_Location = prop.getProperty("Safari_Driver");
	}

	public static void initElements() {
		
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.class);
	}
}
