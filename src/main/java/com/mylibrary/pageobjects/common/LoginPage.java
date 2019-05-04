package com.mylibrary.pageobjects.common;

import org.openqa.selenium.WebElement;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

public class LoginPage extends Page {
	
	public void goTo() {
		Browser.goTo(UrlCollection.LOGIN_PAPGE_URL);
	}

	public void setUsernameField(String username) {
		WebElement usernameField = Browser.findById("username");
		usernameField.sendKeys(username);
	}
	
	public void setPasswordField(String password) {
		WebElement usernameField = Browser.findById("password");
		usernameField.sendKeys(password);
	}
	
	public void clickToLoginButton() {
		WebElement loginButton = Browser.findById("btn-login");
		loginButton.click();
	}
	
	public Boolean isUserAuthenticated(String username) {
		String loggedInUsername = Browser.findByXpathWait("//*[@id='dropdownMenu']/span").getText();

		return loggedInUsername.equals(username);
	}
	
	public String wrongCredentialsError() {
		WebElement errorMessageContainer = Browser.findByXpath("//div[@class='alert alert-danger']/p");
		return errorMessageContainer.getText();
	}

	@Override
	public String pagePath() {
		return UrlCollection.LOGIN_PAPGE_URL;
	}

	public void clickOnRegistrationLink() {
		WebElement registrationLink = Browser.findByXpath("//a[@href='/registration']");
		registrationLink.click();
		
	}
	
}
