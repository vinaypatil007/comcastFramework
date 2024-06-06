package com.trello.qsp.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriverUtility webDriverUtils=new WebDriverUtility();
	JavaUtility javaUtils=new JavaUtility();
	FileUtility fileUtils=new FileUtility();
	ExcelUtility excelUtils=new ExcelUtility();
	
	public WebDriver driver;
	@BeforeMethod
	public void preconditions() throws IOException {
		String browserName=fileUtils.readTheDataFromThePropertyFile("browser");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		webDriverUtils.implicitWait(driver);
		driver.get(fileUtils.readTheDataFromThePropertyFile("url"));
	}
	@AfterMethod
	public void postcondition() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
