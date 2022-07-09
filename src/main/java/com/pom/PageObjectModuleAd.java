package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Automation1pojo.LoginPg;
import com.pojo.LoginAd;

public class PageObjectModuleAd {
 public static WebDriver driver;
 
 private LoginAd la;

public PageObjectModuleAd(WebDriver driver) {
	
	this.driver = driver;
			PageFactory.initElements(driver, this);
}
 
 
 
 
public LoginAd getLoginPg() {
	la = new LoginAd(driver);
	return la;
}
 
 
 
 
 
 
 
 
 
 
}
