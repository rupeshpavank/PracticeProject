package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user on login page$")
	public void user_already_on_login_page(){
		
		ChromeOptions chromeOptions = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(chromeOptions);
	 
		driver.manage().window().maximize();
	 
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com");
	}
	
	@When("^The title of the page pageTitle$")
	public void getTitle(DataTable test) {
		
		/*
		 * List<String> ts= test.asList();
		 */
List<List<String>> ts1=test.asLists();
	
	System.out.println("&&&&&&&&&&&"+ts1.get(0).get(0));
	
	System.out.println("*(*(*(*(*("+ts1.get(0).get(1));
	
	System.out.println("*(*(*(*(*("+ts1.get(1).get(0));

	System.out.println("*(*(*(*(*("+ts1.get(1).get(1));

	
for(Map<Object, Object> mp: test.asMaps(String.class,String.class)) {
	
	System.out.println(mp.get("userName"));
	
	System.out.println(mp.get("Password"));

}


	
/*
 * Assert.assertEquals(ts1.get(0).get(0),
 * "#1 Free CRM Software for every business");
 */
	
	}
	
	@Then("^user enters user name and password$")
	public void user_enters_user_name_And_password() throws Throwable {
	 System.out.println("*********");
		
	}

	@And("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		 System.out.println("*********");

	}
	
	
	

}
