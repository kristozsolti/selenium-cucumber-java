package com.mylibrary.pageobjects.common;

import org.openqa.selenium.WebElement;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

public class RegistrationPage extends Page {
	
	private static final String SUCCESS_REGISTRATION_MSG = "Registration successful";

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.REGISTRATION_PAPGE_URL;
	}

	public void fillEmailField(String email) {
		WebElement emailField = Browser.findById("email");
		emailField.sendKeys(email);
	}

	public void fillPasswordFields(String password) {
		WebElement passwordField = Browser.findById("password");
		WebElement repeatPasswordField = Browser.findById("password2");
		
		passwordField.sendKeys(password);
		repeatPasswordField.sendKeys(password);
	}

	public void clickOnRegisterButton() {
		WebElement registerButton = Browser.findById("register-button");
		registerButton.click();
		
	}

	public boolean userSuccessfullyRegistered() {
		WebElement messageContainer = Browser.findByXpathWait("//*[text()[contains(.,' Registration successful')]]");
		String message = messageContainer.getText();
		return SUCCESS_REGISTRATION_MSG.equals(message);
	}

	
}
