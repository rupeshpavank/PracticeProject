package CRUD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestClass {
	private WebDriver driver;
	
	public void createAddress() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		AddressPage obj=new AddressPage(driver);
		Address add=new Address("", "", "", "", "");
	}

}
