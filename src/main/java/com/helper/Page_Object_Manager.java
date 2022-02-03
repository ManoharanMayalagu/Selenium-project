package com.helper;

import org.openqa.selenium.WebDriver;

import com.selenium.pageobjects.Login_page;
import com.selenium.pageobjects.Personal_details;
import com.selenium.pageobjects.Search_hotel;
import com.selenium.pageobjects.Select_hotel;

public class Page_Object_Manager {
	
	public WebDriver driver;

	private Login_page login;
	private Search_hotel search;
	private Select_hotel select;
	private Personal_details details;
	
	

	public Page_Object_Manager(WebDriver abc) {
		this.driver= abc;
	}

	public Login_page getInstanceLogin() {
		if (login==null) {
			
			login = new Login_page(driver);
		}
		return login;
			
		
	}
	
	public Search_hotel getInstanceHotel() {
		
		if (search==null) {
			search= new Search_hotel(driver);
			
		}
		return search;
		
	}
	
	public Select_hotel getInstanceSelect() {
		
		if (select==null) {
			select = new Select_hotel(driver);
			
		}
		return select;
	}
	
	public Personal_details getInstanceDetails() {
		
		if (details==null) {
			details = new Personal_details(driver);
		
			
		}
		return details;
	}
	}

