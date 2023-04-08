package CRUD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
	
	WebDriver driver;
	
	private By FirstName=By.id("");
	private By LastName=By.id("");
	private By Address=By.id("");
	
	public AddressPage(WebDriver driver) {
		this.driver=driver;
		
	}

	public void newAddress() {
		
		driver.findElement(Address).click();
	}
	
	public void enterAddress(Address address) {
		
		driver.findElement(FirstName).sendKeys(address.getFirstName());
	}

}
