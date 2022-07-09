package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseAd {
public static WebDriver driver;
	
	public  static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase(type)){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
         driver = new FirefoxDriver();
         driver.manage().window().maximize();
		}
		
		return driver;

	}
	public static void getUrl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);

	}
	
	
	public static void clickButton(WebElement element ) {
		// TODO Auto-generated method stub
       element.click();
	}
	public static void implicityWait(int waittime) {
		// TODO Auto-generated method stub
      driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
	}
	
	public static void input(WebElement element,String value ) {
		
		element.sendKeys(value);
	}
	public static void closeWindow() {
		driver.close();
	}
	public static void dropdown(WebElement element, String type, String data) {
		Select location =new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			location.selectByValue(data);
			
		} 
		else if(type.equalsIgnoreCase("byvisibletext")) {
			location.selectByVisibleText(data);

		}
		else if (type.equalsIgnoreCase("byindex")) {
			int indexvalue = Integer.parseInt(data);
			location.selectByIndex(indexvalue);
		}

}
