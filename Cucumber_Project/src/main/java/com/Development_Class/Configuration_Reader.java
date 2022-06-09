package com.Development_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	Properties p;
	public Configuration_Reader() throws IOException {
		File f = new File("C:\\Users\\RAJASEKAR K\\eclipse-workspace1\\Cucumber_Project\\Configuration\\data.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getuser() {
		String user = p.getProperty("user");
		return user;
	}
	
	public String pwd() {
		String password = p.getProperty("pwd");
		return password;
		
	}
	public String CardNo() {
		String CardNo = p.getProperty("CardNo");
		return CardNo;
	}
	
	public String Cvv() {
		
		String CVV = p.getProperty("CVV");
		return CVV;
		
	}
}
