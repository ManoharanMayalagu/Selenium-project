package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_details {

	public WebDriver driver;
	
	@FindBy(name = "first_name")
	private WebElement first_name;

	public WebElement getFirst_name() {
		return first_name;
	}

	
	@FindBy(name = "last_name")
	private WebElement last_name;

	public WebElement getLast_name() {
		return last_name;
	}
	
	@FindBy(name = "address")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(name = "cc_num")
	private WebElement cc_num;
	public WebElement getCc_num() {
		return cc_num;
	}
	
	@FindBy(name = "cc_type")
	private WebElement cc_type;
	public WebElement getCc_type() {
		return cc_type;
	}

	
	@FindBy(xpath = "//option[text()='July']")
	private WebElement exp_month;
	public WebElement getExp_month() {
		return exp_month;
	}
	
	@FindBy(name = "cc_exp_year")
	private WebElement exp_year;
	public WebElement getExp_year() {
		return exp_year;
	}
	
	@FindBy (name = "cc_cvv")
	private WebElement cc_cvv;
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	
	@FindBy(name = "book_now")
	private WebElement book_now;

	public WebElement getBook_now() {
		return book_now;
	}
public Personal_details(WebDriver driver3) {
	this.driver= driver3;
	PageFactory.initElements(driver, this);
}

	

	
	

	

	

	
}
