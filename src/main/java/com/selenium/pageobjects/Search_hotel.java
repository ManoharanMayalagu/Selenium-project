package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {

	public WebDriver driver;
	@FindBy(name = "location")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(name = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy(name = "room_type")
	private WebElement room_type;
	public WebElement getRoom_type() {
		return room_type;
	}
	
	@FindBy(name = "room_nos")
	private WebElement room_nos;
	public WebElement getRoom_nos() {
		return room_nos;
	}
	
	@FindBy(name = "datepick_in")
	private WebElement datepick_in;
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	
	@FindBy(name = "datepick_out")
	private WebElement datepick_out;
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	
	@FindBy(name = "adult_room")
	private WebElement adult_room;

	public WebElement getAdult_room() {
		return adult_room;
	}

	
	@FindBy(name = "child_room")
	private WebElement child_room;
	public WebElement getChild_room() {
		return child_room;
	}
	
	@FindBy(name = "Submit")
	private WebElement Submit;

	public WebElement getSubmit() {
		return Submit;
	}

public Search_hotel(WebDriver driver) {	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
