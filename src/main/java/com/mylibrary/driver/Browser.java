package com.mylibrary.driver;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mylibrary.helper.UrlCollection;

public class Browser {

	private static final Logger log = LoggerFactory.getLogger(Browser.class);
	
	private static WebDriver driver = new ChromeDriver();
	private static WebDriverWait wait = new WebDriverWait(driver, 10);

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriverWait getWait() {
		return wait;
	}

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

	public static List<WebElement> findAllByXpath(String xpath) {
		return driver.findElements(By.xpath(xpath));
	}

	public static WebElement findByIdWait(String id) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}

	public static WebElement findByXpathWait(String xpath) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}

	public static List<WebElement> findAllById(String id) {
		return driver.findElements(By.id(id));
	}

	public static WebElement findByClassName(String className) {
		return driver.findElement(By.className(className));
	}

	public static List<WebElement> findAllByClassName(String className) {
		return driver.findElements(By.className(className));
	}

	public static void printScreen(String photoTitle) {
		try {
			
			File photo = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(photo, new File(UrlCollection.CAPTURED_SCREENS_PATH + photoTitle + System.currentTimeMillis() + ".png"));	
		} catch (IOException e){
			
			System.err.println(e.getMessage());
			log.error(e.getMessage());
		}
	}

	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}

}
