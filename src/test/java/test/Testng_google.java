package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.GoogleSearch;

public class Testng_google {
	static WebDriver driver;
	@BeforeTest
	public void driver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\busarars\\Documents\\jarfiles\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.google.com/");
		GoogleSearch.google_searchbox(driver).sendKeys("selenium");
		Thread.sleep(3000);
		pom.GoogleSearch.Button_enter(driver).click();

	}
	@AfterTest
	public void driverquit() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}

}
