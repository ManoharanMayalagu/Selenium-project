package com.pomtest.org;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.Maven_project.Base_class;
import com.helper.Page_Object_Manager;
import com.selenium.pageobjects.Login_page;
import com.selenium.pageobjects.Personal_details;
import com.selenium.pageobjects.Search_hotel;
import com.selenium.pageobjects.Select_hotel;

public class Runner_pom extends Base_class {
	
	public static WebDriver driver;
	
	static Logger log = Logger.getLogger(Runner_pom.class);
	public static void main(String[] args) throws Throwable  {
	
		PropertyConfigurator.configure("log4j.properties");
	driver= Getbrowser("chrome");
	log.info("Browser launched succesfully");
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
//	Login_page login = new Login_page(driver);
//	
//	Search_hotel search = new Search_hotel(driver);
//	
//	Select_hotel select = new Select_hotel(driver);
	
	getUrl("https://adactinhotelapp.com/");

	String username = particular_data("C:\\Users\\Manoharan M\\eclipse-workspace\\Maven_project\\Excel\\Adactin testcase.xlsx", 3, 6);
	sk(pom.getInstanceLogin().getUsername(), username);
	String password = particular_data("C:\\Users\\Manoharan M\\eclipse-workspace\\Maven_project\\Excel\\Adactin testcase.xlsx", 4, 6);
	sk(pom.getInstanceLogin().getPassword(), password);
	ck(pom.getInstanceLogin().getLogin());
	
	log.info("Username password entered succesfully");
	
	
	String location = particular_data("C:\\Users\\Manoharan M\\eclipse-workspace\\Maven_project\\Excel\\Adactin testcase.xlsx", 17, 6);
	sk(pom.getInstanceHotel().getLocation(), location);
//	DropDown(search.getLocation(), null, Brisbane);
	String hotel = particular_data("C:\\Users\\Manoharan M\\eclipse-workspace\\Maven_project\\Excel\\Adactin testcase.xlsx", 18, 6);
	sk(pom.getInstanceHotel().getHotels(), hotel);
	String roomtype = particular_data("C:\\Users\\Manoharan M\\eclipse-workspace\\Maven_project\\Excel\\Adactin testcase.xlsx", 19, 6);
	sk(pom.getInstanceHotel().getRoom_type(), roomtype);
	String roomno = particular_data("C:\\Users\\Manoharan M\\eclipse-workspace\\Maven_project\\Excel\\Adactin testcase.xlsx", 20, 6);
	sk(pom.getInstanceHotel().getRoom_nos(),roomno);
	String checkin = particular_data("C:\\Users\\Manoharan M\\eclipse-workspace\\Maven_project\\Excel\\Adactin testcase.xlsx", 22, 6);
	sk(pom.getInstanceHotel().getDatepick_in(), checkin);
	String checkout = particular_data("C:\\Users\\Manoharan M\\eclipse-workspace\\Maven_project\\Excel\\Adactin testcase.xlsx", 24, 6);
	sk(pom.getInstanceHotel().getDatepick_out(), checkout);
	sk(pom.getInstanceHotel().getAdult_room(), "1");
	sk(pom.getInstanceHotel().getChild_room(), "0");
	ck(pom.getInstanceHotel().getSubmit());
	log.info("Hotel searched");
	
	
	ck(pom.getInstanceSelect().getRadiobutton());
	ck(pom.getInstanceSelect().getClick());
	log.info("Hotel selected succesfully");
//	Personal_details personal = new Personal_details(driver);
//	sk(personal.getFirst_name(),"Mano");
//	sk(personal.getLast_name(), "Mayalagu");
//	sk(personal.getAddress(), "1, vivekanandar street, dubai cross street");
//	sk(personal.getCc_num(), "1234 5678 4578 1458");
//	sk(personal.getCc_type(), "MAST");
//	sk(personal.getExp_month(), "July");
//	sk(personal.getExp_year(), "2022");
//	sk(personal.getCc_cvv(), "125");
//	ck(personal.getBook_now());
//	
	
	

}}