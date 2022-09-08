package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {
	static WebElement element;
	
	public static WebElement google_searchbox(WebDriver driver) {
		element= driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement Button_enter(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
	}

}
