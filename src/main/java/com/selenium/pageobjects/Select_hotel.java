package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
public WebDriver driver;
	
	@FindBy(name = "radiobutton_0")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	@FindBy(name="continue")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}
	public Select_hotel(WebDriver driver2) {
		this.driver=driver2;
				PageFactory.initElements(driver, this);
	}
}
