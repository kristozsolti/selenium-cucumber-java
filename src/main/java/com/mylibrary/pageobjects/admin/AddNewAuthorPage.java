package com.mylibrary.pageobjects.admin;

import org.openqa.selenium.WebElement;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

public class AddNewAuthorPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.ADD_NEW_AUTHOR_PAGE;
	}

	public void fillAuthorNameField(String authorName) {
		WebElement authorNameField = Browser.findById("name");
		authorNameField.sendKeys(authorName);
	}
	
	public void fillAuthorBirthDateField(String birthDate) {
		WebElement authorBirthDateField = Browser.findById("dateOfBirth");
		authorBirthDateField.sendKeys(birthDate);
	}

	public void fillAuthorPhotoUrlField(String photoUrl) {
		WebElement authorPhotoUrlField = Browser.findById("photoUrl");
		authorPhotoUrlField.sendKeys(photoUrl);
		
	}

	public void fillAuthorRatingField(Double rating) {
		WebElement authorRatingField = Browser.findById("rating");
		authorRatingField.sendKeys(rating.toString());
		
	}

	public void fillAuthorBioField(String bio) {
		WebElement authorBioField = Browser.findById("bio");
		authorBioField.sendKeys(bio);
		
	}

	public void clickOnSaveAuthorButton() {
		WebElement saveAuthorButton = Browser.findById("save-author-button");
		saveAuthorButton.click();
		
	}

}
