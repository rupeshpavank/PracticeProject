package com.TestProject.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.reactor.Command.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MicronSemiConductor  {
	

	WebDriver driver;
	
	@DataProvider
	public Iterator<Object[]> getData() {
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		String firstName="Rupesh";
		String lastName="Pavan";
		
		Object[] obj= {firstName,lastName};
		
		myData.add(obj);
		
		return myData.iterator();
	}
	
	@BeforeMethod
	@Parameters({"url"})
	public void setUp(String url) {
		
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(chromeOptions);
	 
		driver.manage().window().maximize();
	 
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get(url);
		
	WebElement	ele=driver.findElement(By.cssSelector("img[alt='Google']"));
	Select sel=new Select( ele);
	
	sel.getOptions().size();
	}
	
	
	
	@Test(priority=2,groups = "Title",dependsOnMethods ="verifyElement",dataProvider ="getData")
	public void googleTest(String firstName, String lastName) {

		System.out.println("**********"+firstName);
		
		System.out.println("*********"+lastName);
		
	String title=driver.getTitle();
	
	Assert.assertTrue(true, title);
	
	System.out.println(title);
	}
	
	@Test(priority=1,groups = "VerifyElement")
	public void verifyElement() {
		

		
	boolean b=	driver.findElement(By.cssSelector("img[alt='Google']")).isDisplayed();
		if(b) {
			
			System.out.println("My Test case is Pass");
		}

		else {
			System.out.println("My Test case if fail");
			Assert.fail();
		}
	}
	
	@AfterMethod
	public void tearDown() {
		
driver.close();
}
	

}
