package com.TestProject.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestThisMethod {
	
public static	WebDriver driver;
	
	int id;
	String name;
	
	public  void test (int id, String name, WebDriver driver) {

this.driver=driver;		
		
driver=new ChromeDriver();
		
		
	}

}
