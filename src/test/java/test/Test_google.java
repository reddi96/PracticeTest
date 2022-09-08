package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.GoogleSearch;

public class Test_google {
	static WebDriver driver;
	

	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\busarars\\Documents\\jarfiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSearch.google_searchbox(driver).sendKeys("selenium");
		Thread.sleep(3000);
		pom.GoogleSearch.Button_enter(driver).click();
	
		
	}
	public static void main(String[] args) throws InterruptedException {
		Test_google a = new Test_google();
		a.test();
		
	}
	
	
	
	

}
