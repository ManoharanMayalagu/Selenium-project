package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Maven_project.Base_class;

public class Login_page extends Base_class {

	public WebDriver driver;
	@FindBy(id="username")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}

	@FindBy(id="password")
	private  WebElement password;
	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath="//input[@type='Submit']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	public Login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	}

