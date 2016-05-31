package com.oracle.psr.selenium.WebRePlay;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
	 public static WebDriver driverNULL; // <- never instantiate
	    public static void main(String[] args) {
	        try {
	        	WebDriver driverOK = new FirefoxDriver();

	            driverOK.get("ChangetoMobileuiI");
	            driverOK.findElement(By.id("username")).sendKeys("username");
	            driverOK.findElement(By.name("password")).sendKeys("passwd");
	            driverOK.findElement(By.id("signin")).click();
	          //  driverOK.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	            Thread.sleep(30);
	           // WebDriverWait wait = new WebDriverWait(driverOK,30);
	            	            
	           // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Library"))).isDisplayed();
	            
	           	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        finally{
	            driverNULL.close(); // <- want to close a object never instantiate so null pointer exception
	            driverNULL.quit();
	        }
	    }
  
  }


