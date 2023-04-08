package com.TestProject.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\hi\\Downloads\\chromedriver.exe");
		 */
		/*
		 * WebDriver driver=new ChromeDriver();
		 */

		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);
		
		/*
		 * How to handel Multiple Windows
		 */

		driver.get("https://www.orangehrm.com/");
		
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		WebElement ele=driver.findElement(By.xpath("//a[contains(@href,'facebook.com')]//img"));
		
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		driver.findElement(By.xpath("//a[@title='Accept Cookies']")).click();
		
	//Window Handles
		
		/*
		 * Set<String> st= driver.getWindowHandles();
		 * 
		 * List<String> str=new ArrayList<String>(st);
		 * 
		 * String target= str.get(50);
		 * 
		 * driver.switchTo().window(target);
		 * 
		 * 
		 * for(String w:str) {
		 * 
		 * driver.switchTo().window(w);
		 * 
		 * if(driver.getTitle().equals("Facebook")) {
		 * 
		 * } }
		 */
		 
		Select sel=new Select(driver.findElement(By.xpath("")));
		
		sel.getOptions().size();
		
		Wait  wait=new FluentWait(driver).
				withTimeout(30, TimeUnit.SECONDS).
				pollingEvery(5, TimeUnit.SECONDS).
				ignoring(Exception.class);
		
		
	
		//iFrame
		

		
		
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,15);
		 * 
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ele")));
		 * 
		 */
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@href,'facebook.com')]//img")).click();
		
		
		/*
		 * driver.get("https://www.w3schools.com/html/html_tables.asp");
		 * 
		 * //table[@id='customers']/tbody/tr['"+i+"']/td['"+j+"']
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver, 120);
		 * 
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//table[@id='customers']/tbody/tr/td")));
		 * 
		 * 
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * 
		 * Actions act=new Actions(driver);
		 * 
		 * WebElement ele= driver.findElement(By.xpath("//table[@id='customers']//th"));
		 * 
		 * act.moveToElement(ele).build().perform();
		 * 
		 * JavascriptExecutor jse= (JavascriptExecutor) driver;
		 * 
		 * 
		 * jse.executeScript("window.scrollBy(0,250)", "");
		 * 
		 * int
		 * rowCount=driver.findElements(By.xpath("//table[@id='customers']/tbody//tr")).
		 * size();
		 * 
		 * int
		 * columnCount=driver.findElements(By.xpath("//table[@id='customers']//th")).
		 * size();
		 * 
		 * for(int i=1;i<rowCount;i++) {
		 * 
		 * for(int j=1;j<=columnCount;j++) {
		 * 
		 * String
		 * text=driver.findElement(By.xpath("//table[@id='customers']/tbody//tr["+(i+1)+
		 * "]/td["+j+"]")).getText();
		 * 
		 * if(text.equals("Magazzini Alimentari Riuniti")) {
		 * 
		 * System.out.println("The Value is in the Row****** "+i);
		 * 
		 * System.out.println("The Value is in the column****** "+j);
		 * 
		 * String
		 * country=driver.findElement(By.xpath("//table[@id='customers']/tbody//tr["+(i+
		 * 1)+"]/td[3]")).getText();
		 * 
		 * System.out.println(country);
		 * 
		 * break; }
		 * 
		 * }
		 * 
		 * }
		 */

		/*
		 * SVG tags List<WebElement> eles= driver.findElements(By.
		 * xpath("//*[local-name()='svg' and @class='uch-psvg']//*[name()='rect']"));
		 * 
		 * 
		 * for(WebElement ele:eles) {
		 * 
		 * Actions act=new Actions(driver);
		 * 
		 * act.moveToElement(ele).build().perform();
		 * 
		 * String cases=
		 * driver.findElement(By.xpath("//*[@jscontroller='z3HgJb']")).getText();
		 * 
		 * System.out.println(cases); }
		 */

		// *[name()='svg' and @class='uch-psvg']//*[local-name()='rect']

		/*
		 * WebElement button =driver.findElement(By.name("btnLogin"));
		 * 
		 * 
		 * JavascriptExecutor jse= (JavascriptExecutor) driver;
		 * 
		 * 
		 * driver.findElement(By.name("uid")).sendKeys("mngr34926");
		 * 
		 * 
		 * driver.findElement(By.name(""));
		 * driver.findElement(By.name("password")).click();
		 * 
		 * jse.executeScript("arguments[0].click();", button);
		 * 
		 * 
		 * System.out.println(driver.getTitle()+"****************");
		 */

	}
	
	public static void sendKeys(WebDriver driver,WebElement ele,int timeout,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(value);
	}
	
	public static void click(WebDriver driver,WebElement ele, int timeOut) {
		
		new WebDriverWait(driver,timeOut).until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}

}


