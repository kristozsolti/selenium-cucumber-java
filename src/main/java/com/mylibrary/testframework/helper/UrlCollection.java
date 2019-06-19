package com.mylibrary.testframework.helper;

public class UrlCollection {
	
	
//	public static final String BASE_URL = "https://my-library-example.herokuapp.com/";
	public static final String BASE_URL = "http://localhost:8080/";
	
//	USER PAGE URLS
	public static final String HOME_PAPGE_URL = BASE_URL;
	public static final String BOOKS_PAPGE_URL = BASE_URL + "books";
	public static final String AUTHORS_PAPGE_URL = BASE_URL + "authors";
	public static final String CONTACT_PAPGE_URL = BASE_URL + "contact";
	public static final String LOGIN_PAPGE_URL = BASE_URL + "login";
	
	public static final String REGISTRATION_PAPGE_URL = BASE_URL + "registration";
	public static final String USERS_PAGE = BASE_URL + "users";
	public static final String ADD_NEW_AUTHOR_PAGE = AUTHORS_PAPGE_URL + "/add-new";
	public static final String ADD_NEW_BOOK_PAGE = BOOKS_PAPGE_URL + "/add-new";

//	ADMIN PAGE URLS
	public static final String ADMIN_CONTACT_PAPGE_URL = BASE_URL + "admin/contact-messages";
	public static final String ADMIN_DASHBOARD_PAPGE_URL = BASE_URL + "admin/";

//	PATH TO SAVE CAPTURED PHOTOS
	public static final String CAPTURED_SCREENS_PATH = "C:\\selenium_screenshots\\";
}
