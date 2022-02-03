package com.Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testrunner extends Base_class {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
	driver= Getbrowser("chrome");
	
	getUrl("https://adactinhotelapp.com/");
	
	WebElement username = driver.findElement(By.name("username"));
    sk(username, "Manoharan");
    
    WebElement Password = driver.findElement(By.name("password"));
    sk(Password, "93V2O8");
    
    WebElement login = driver.findElement(By.name("login"));
    ck(login);
}
}