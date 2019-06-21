package com.mylibrary.testframework.pageobjects.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class HomePage extends Page {
	private static final String TOP_RATED_BOOKS_CONTAINER_ID = "top-rated-books";
	private static final String TOP_RATED_AUTHORS_CONTAINER_ID = "top-rated-authors";
	private static final String CARD_LINK_CLASS_NAME = "card-link";

	@Override
	public void goTo() {
		Browser.goTo(UrlCollection.HOME_PAPGE_URL);
	}

	@Override
	public String pagePath() {
		return UrlCollection.HOME_PAPGE_URL;
	}
	
	public void clickOnTopRatedBook() {
		WebElement topRatedBooksContainer = Browser.findById(TOP_RATED_BOOKS_CONTAINER_ID);
		List<WebElement> topRatedBooks = topRatedBooksContainer.findElements(By.className(CARD_LINK_CLASS_NAME));
		
		WebElement topRatedBook = topRatedBooks.get(0);
		topRatedBook.click();
	}
	

	public void clickOnTopRatedAuthor() {
		WebElement topRatedAuthorsContainer = Browser.findById(TOP_RATED_AUTHORS_CONTAINER_ID);
		List<WebElement> topRatedAuthors = topRatedAuthorsContainer.findElements(By.className(CARD_LINK_CLASS_NAME));
		
		WebElement topRatedAuthor = topRatedAuthors.get(0);
		topRatedAuthor.click();
	}

}
