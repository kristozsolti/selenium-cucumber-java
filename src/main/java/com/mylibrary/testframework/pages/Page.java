package com.mylibrary.testframework.pages;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;

public abstract class Page {

	public abstract void goTo();
	
	public abstract String pagePath();
	
	public Boolean isAt(String path) {
		return pagePath().equals(path);
	}
	
	public void fillInputFieldById(String fieldId, String fieldContent) {
		WebElement inputField = Browser.findById(fieldId);
		inputField.sendKeys(fieldContent);
	}
	
	public void clickOnElementById(String id) {
		WebElement element = Browser.findById(id);
		element.click();
	}
	
	public void clickOnElementByXpath(String xpath) {
		WebElement element = Browser.findByXpath(xpath);
		element.click();
	}
	
	public String getElementTextById(String id) {
		WebElement element = Browser.findById(id);
		return element.getText();
	}
	
	public void printScreen() {
		//Pass children class name to printScreen method so the file name will contain the class which called it
		Browser.printScreen(this.getClass().getSimpleName());
	}
	
}
