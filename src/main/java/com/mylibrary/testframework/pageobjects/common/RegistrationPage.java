package com.mylibrary.testframework.pageobjects.common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class RegistrationPage extends Page {
	private static final String EMAIL_FIELD_ID = "email";
	private static final String PASSWORD_FIELD_ID = "password";
	private static final String PASSWORD2_FIELD_ID = "password2";
	private static final String REGISTER_BUTTON_ID = "register-button";
	
	private static final String USER_EXISTS_ERR_MSG_CONTAINER_ID = "user-exists";
	private static final String SUCCESS_REGISTRATION_MSG_CONTAINER_ID = "registration-success";
	
	private static final String SUCCESS_REGISTRATION_MSG = "Registration successful";
	private static final String USER_EXISTS_MSG = "User with this e-mail already exists";

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.REGISTRATION_PAPGE_URL;
	}

	public void fillEmailField(String email) {
		super.fillInputFieldById(EMAIL_FIELD_ID, email);
	}

	public void fillPasswordFields(String password) {
		super.fillInputFieldById(PASSWORD_FIELD_ID, password);
		super.fillInputFieldById(PASSWORD2_FIELD_ID, password);
	}

	public void clickOnRegisterButton() {
		WebElement registerButton = Browser.findById(REGISTER_BUTTON_ID);
		registerButton.click();

	}

	public boolean userSuccessfullyRegistered() {
		try {
			WebElement messageContainer = Browser.findById(SUCCESS_REGISTRATION_MSG_CONTAINER_ID);
			String message = messageContainer.getText();
			return SUCCESS_REGISTRATION_MSG.equals(message);
			
		} catch (NoSuchElementException e) {
			return isUserExists();
		}
	}

	public boolean isUserExists() {
		String responseMessage = super.getElementTextById(USER_EXISTS_ERR_MSG_CONTAINER_ID);
		return USER_EXISTS_MSG.equals(responseMessage);
	}
}
