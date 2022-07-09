package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {

	
	
	
	public Properties p;
	public  Config_Reader() throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Selinum\\Automation1\\src\\main\\java\\com\\property_files\\config.Prop");
		FileInputStream  fis = new FileInputStream(f);
		p =  new Properties();
		p.load(fis);
	}
	public String geturl() {
		
		String url = p.getProperty("url");
		return url;
	}
	
	public String getusename() {
		// TODO Auto-generated method stub
		String usename = p.getProperty("usename");
      return usename;
	}
	public String getpassword() {
		
		String password = p.getProperty("password");
		return password;
	}
	
	
	
	
	
}
