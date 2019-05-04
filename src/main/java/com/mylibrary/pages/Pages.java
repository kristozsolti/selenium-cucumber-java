package com.mylibrary.pages;

import com.mylibrary.pageobjects.common.AuthorPage;
import com.mylibrary.pageobjects.common.AuthorsPage;
import com.mylibrary.pageobjects.common.BookPage;
import com.mylibrary.pageobjects.common.BooksPage;
import com.mylibrary.pageobjects.common.ContactPage;
import com.mylibrary.pageobjects.common.HomePage;
import com.mylibrary.pageobjects.common.LoginPage;

public class Pages {

	public static HomePage homePage() {
		HomePage homepage = new HomePage();
		return homepage;
	}

	public static ContactPage contactPage() {
		ContactPage contactPage = new ContactPage();
		return contactPage;
	}
	
	public static LoginPage loginPage() {
		LoginPage loginPage = new LoginPage();
		return loginPage;
	}
	
	public static BookPage bookPage() {
		BookPage bookPage = new BookPage();
		return bookPage;
	}

	public static BooksPage booksPage() {
		BooksPage booksPage = new BooksPage();
		return booksPage;
	}
	
	public static AuthorPage authorPage() {
		AuthorPage authorPage = new AuthorPage();
		return authorPage;
	}
	
	public static AuthorsPage authorsPage() {
		AuthorsPage authorsPage = new AuthorsPage();
		return authorsPage;
	}
}
