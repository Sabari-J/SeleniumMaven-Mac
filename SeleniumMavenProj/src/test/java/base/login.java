package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		// WebDriverManager.safaridriver().setup();

		driver = new ChromeDriver();

		try {
			driver.navigate().to("https://demoqa.com");
			//driver.manage().window().maximize();
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Browser launched!!!");

	}

	public void clickableElement(WebElement element, int timeunit) {
		WebDriverWait wbWait = new WebDriverWait(driver, timeunit);
		wbWait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void scrollToElement(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void sendText(WebElement element, String txt) {

		element.clear();
		if (element.isEnabled()) {
			System.out.println(element + "is Enabled");
		}
		element.sendKeys(txt);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
