package com.Maven_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.selenium.pageobjects.Select_hotel;

public class Base_class {
	public static WebDriver driver; //.....Null driver
	
	public static String value;
	public static WebDriver Getbrowser(String Type) {
		if (Type.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\\\chromedriver.exe")	;
		
		 driver = new ChromeDriver();
		}
//		else if (Type.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.firefox.driver", 
//					System.getProperty("user.dir")+"\\Driver\\\\firefoxdriver.exe");		
//		
//			 driver = new FirefoxDriver();
//		}
//	}
		
	driver.manage().window().maximize();	
	return driver;
	
	}

	public static void ck(WebElement element) {
	element.click();
	
		
	}
	public static void sk(WebElement element,String value) {
	element.sendKeys(value);	
	}
	
	public static void getUrl(String url) {
	driver.get(url);	
	}
	
	public static void close() {
		driver.close();
			
	}
	
	public static void DropDown(String type, WebElement element, String data) {
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byIndex")) {
			int value = Integer.parseInt(data);
			s.selectByIndex(value);
			
		}
		else if (type.equalsIgnoreCase("byValue")) {
		
			s.selectByValue(data);
		}
		else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(data);
			
		}

	}
	public static String particular_data (String path, int row_Index, int cell_Index) throws IOException {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(row_Index);
		Cell cell = row.getCell(cell_Index);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			 value = cell.getStringCellValue();
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int val = (int) numericCellValue;
			value=String.valueOf(val);
		}
		return value;
		

	}
}

