package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAd {

	public static WebDriver driver;
	

	
	@FindBy (id="email")
	private WebElement usename;
	
	@FindBy (id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement submit;
		public LoginAd(WebDriver driver1) {
			this.driver =driver1;
			PageFactory.initElements(driver, this);
		
	}
		public WebElement getusename() {
			return usename;
		}
		
		
		public WebElement getpassword() {
			return password;
		}
		public WebElement getsubmit() {
			return submit;
		}

	// TODO Auto-generated method stu

}
