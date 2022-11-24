package testFiles;

import org.testng.annotations.Test;

import com.sabari.page_objects.Elements;
import com.sabari.page_objects.TextBox;

import base.login;

public class TextBox_TestCase extends login {

	TextBox txtbox = new TextBox();
	Elements elemnts = new Elements();

	@Test
	public void textBoxSubmission() throws InterruptedException {

		elemnts.clickOnElements();
		elemnts.clickOnTextBox();

		txtbox.enterFulName();
		txtbox.enterEmailId();
		txtbox.enterCurrentAddress();
		txtbox.enterPermanentAddress();
		txtbox.clickSubmitButton();

	}

}
