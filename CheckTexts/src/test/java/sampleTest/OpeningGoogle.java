package sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningGoogle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.google.com'", "");
		WebElement search = driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value='Ayyappan images'", search);
		
		//driver.quit();
		
		
		
	}

}
