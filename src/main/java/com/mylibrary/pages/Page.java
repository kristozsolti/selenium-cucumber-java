package com.mylibrary.pages;

import org.openqa.selenium.WebElement;

import com.mylibrary.driver.Browser;

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
	
}
