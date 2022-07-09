package com.runnerfile;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.property.FileReader;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\Selinum\\Automation_Cucumber\\src\\test\\java\\com\\featurefile\\Login.feature",
              glue = "com.stepdef",
              monochrome = true,
              dryRun = true,
              
              plugin = {"pretty",
            		 " html:CucumberReports/login",
            		 "jason:CucumberReports/loginfeature.json"
            		  
              }
               
		
		
		
		)

public class RunnerFile {

	public static WebDriver driver;
	@BeforeClass
	public void setUp() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
