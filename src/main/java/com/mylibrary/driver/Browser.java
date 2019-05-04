package com.mylibrary.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	
	public static WebDriver driver = new ChromeDriver();
	public static WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public static void goTo(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static String pageTitle() {
		return driver.getTitle();
	}
	
	public static Boolean isAtUrl(String url) {
		return driver.getCurrentUrl().equals(url);
	}
	
	public static WebElement findById(String id) {
		return driver.findElement(By.id(id));
	}
	
	public static WebElement findByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public static WebElement findByIdWait(String id) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}
	
	public static WebElement findByXpathWait(String xpath) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
	
	public static void close() {
		driver.close();
		driver.quit();
	}

}
