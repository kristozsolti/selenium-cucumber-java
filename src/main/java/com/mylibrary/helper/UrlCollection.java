package com.mylibrary.helper;

public class UrlCollection {
//	private static final String BASE_URL = "https://my-library-example.herokuapp.com/";
	private static final String BASE_URL = "http://localhost:8080/";
	
	public static final String HOME_PAPGE_URL = BASE_URL;
	public static final String BOOKS_PAPGE_URL = BASE_URL + "books";
	public static final String AUTHORS_PAPGE_URL = BASE_URL + "authors";
	public static final String CONTACT_PAPGE_URL = BASE_URL + "contact";
	public static final String LOGIN_PAPGE_URL = BASE_URL + "login";
	
	public static final String REGISTRATION_PAPGE_URL = BASE_URL + "registration";
	public static final String USERS_PAGE = BASE_URL + "users";
	public static final String ADD_NEW_AUTHOR_PAGE = AUTHORS_PAPGE_URL + "/add-new";
	public static final String ADD_NEW_BOOK_PAGE = BOOKS_PAPGE_URL + "/add-new";

}
