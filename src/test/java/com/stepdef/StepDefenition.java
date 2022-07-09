package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseAd;
import com.pom.PageObjectModuleAd;
import com.property.FileReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition extends BaseAd {
	
	public static WebDriver driver = new ChromeDriver();
	
	public static PageObjectModuleAd  pom = new PageObjectModuleAd(driver);
	
	
	
	
	@Given("user is launch the application")
	public void user_is_launch_the_application() throws IOException {
		
		getUrl(FileReader.getInstanceFrm().getInstanceCR().geturl());
		
	    throw new io.cucumber.java.PendingException();
	}
	@When("user is enter the user name in user field")
	public void user_is_enter_the_user_name_in_user_field() throws IOException {
		input(pom.getLoginPg().getusename(), FileReader.getInstanceFrm().getInstanceCR().getusename());
	    throw new io.cucumber.java.PendingException();
	}
	@And("user is enter the password in password field")
	public void user_is_enter_the_password_in_password_field() throws Throwable {
input(pom.getLoginPg().getpassword(), FileReader.getInstanceFrm().getInstanceCR().getpassword());
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user is click on the submit Button")
	public void user_is_click_on_the_submit_button() {
		clickButton(pom.getLoginPg().getsubmit());
	    throw new io.cucumber.java.PendingException();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
