package com.TestNGPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestNG {
	
	
	public String baseUrl = "file:///C:/Users/Asus/Desktop/my%20new/mynew2.html";
    String driverPath = "C:\\chromedriver-win64\\chromedriver.exe";
    WebDriver driver;
  
  
    
    @Test
    public void verifyHomepageTitle() {
	       
	      System.out.println("launching Chrome browser"); 
	      
	     ChromeDriver driver = new ChromeDriver();
		
	      driver.get(baseUrl);
	      String expectedTitle = "chethan";
	      String actualTitle = driver.getTitle();
	      AssertJUnit.assertEquals(actualTitle, expectedTitle);
	      
	      
	      driver.close();
	  }
    /*
    @Test (priority = 1)
    public void verifyHomepageTitleError() {
	       
	      System.out.println("launching Chrome browser"); 
	      
	     ChromeDriver driver = new ChromeDriver();
	
	      driver.get(baseUrl);
	      String expectedTitle = "chethu";
	      String actualTitle = driver.getTitle();
	      AssertJUnit.assertEquals(actualTitle, expectedTitle);
	      
	      
	      driver.close();
	      
	  }*/
}
