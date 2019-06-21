package com.mylibrary.testframework.pageobjects.common;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class LoginPage extends Page {
	private static final String USERNAME_FIELD_ID = "username";
	private static final String PASSWORD_FIELD_ID = "password";
	private static final String LOGIN_BUTTON_ID = "btn-login";
	private static final String ERR_MESSAGE_CONTAINER_XPATH = "//div[@class='alert alert-danger']/p";
	private static final String REGISTRATION_LINK_XPATH = "//a[@href='/registration']";
	
	public void goTo() {
		Browser.goTo(UrlCollection.LOGIN_PAPGE_URL);
	}

	public void setUsernameField(String username) {
		super.fillInputFieldById(USERNAME_FIELD_ID, username);
	}
	
	public void setPasswordField(String password) {
		super.fillInputFieldById(PASSWORD_FIELD_ID, password);
	}
	
	public void clickToLoginButton() {
		super.clickOnElementById(LOGIN_BUTTON_ID);
	}
	
	public Boolean isUserAuthenticated(String username) {
		String loggedInUsername = Browser.findByXpathWait("//*[@id='dropdownMenu']/span").getText();

		return loggedInUsername.equals(username);
	}
	
	public String wrongCredentialsError() {
		WebElement errorMessageContainer = Browser.findByXpath(ERR_MESSAGE_CONTAINER_XPATH);
		return errorMessageContainer.getText();
	}

	@Override
	public String pagePath() {
		return UrlCollection.LOGIN_PAPGE_URL;
	}

	public void clickOnRegistrationLink() {
		super.clickOnElementByXpath(REGISTRATION_LINK_XPATH);
	}

	public void loginAsUser() {
		goTo();
		setUsernameField("user@testgmail.com");
		setPasswordField("user");
		clickToLoginButton();
	}

	public void loginAsAdmin() {
		goTo();
		setUsernameField("admin@test.com");
		setPasswordField("admin");
		clickToLoginButton();
	}
	
}
