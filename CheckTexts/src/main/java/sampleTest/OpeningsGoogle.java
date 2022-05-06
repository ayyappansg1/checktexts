package sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningsGoogle {
	static WebDriver driver;
	
	public static void openText() {
		System.out.println("Openging google for your reference");
		driver.get("https://www.google.co.in");
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\java files\\CheckTexts\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		openText();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("ayyappan wallpaper images"+Keys.ENTER);
		driver.quit();
		
		
		
	}

}
