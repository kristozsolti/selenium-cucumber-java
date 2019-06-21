package com.mylibrary.testframework.pageobjects.admin;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class AddNewAuthorPage extends Page {
	private static final String AUTHOR_NAME_FIELD_ID = "name";
	private static final String AUTHOR_BIRTH_DATE_FIELD_ID = "dateOfBirth";
	private static final String AUTHOR_PHOTO_URL_FIELD_ID = "photoUrl";
	private static final String AUTHOR_RATING_FIELD_ID = "rating";
	private static final String AUTHOR_BIO_FIELD_ID = "bio";
	private static final String SAVE_AUTHOR_BUTTON_ID = "save-author-button";
	
	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.ADD_NEW_AUTHOR_PAGE;
	}

	public void fillAuthorNameField(String authorName) {
		super.fillInputFieldById(AUTHOR_NAME_FIELD_ID, authorName);
	}
	
	public void fillAuthorBirthDateField(String birthDate) {
		super.fillInputFieldById(AUTHOR_BIRTH_DATE_FIELD_ID, birthDate);
	}

	public void fillAuthorPhotoUrlField(String photoUrl) {
		super.fillInputFieldById(AUTHOR_PHOTO_URL_FIELD_ID, photoUrl);
	}

	public void fillAuthorRatingField(Double rating) {
		super.fillInputFieldById(AUTHOR_RATING_FIELD_ID, rating.toString());
	}

	public void fillAuthorBioField(String bio) {
		super.fillInputFieldById(AUTHOR_BIO_FIELD_ID, bio);
	}

	public void clickOnSaveAuthorButton() {
		super.clickOnElementById(SAVE_AUTHOR_BUTTON_ID);
	}

}
