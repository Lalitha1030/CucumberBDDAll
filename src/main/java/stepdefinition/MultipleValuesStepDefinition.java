package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MultipleValuesStepDefinition {
	
	WebDriver driver;
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	    System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.get("https://classic.freecrm.com/index.html");
	}

	@When("^title of login page is free CRM$")
	public void title_of_login_page_is_free_CRM() throws Throwable {
	   String loginTitle = driver.getTitle();
	   System.out.println("Title of the Login Page is:  "+loginTitle);
	}

	@Then("^User able to enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_able_to_enter_and(String username, String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^User able to click the login button$")
	public void User_able_to_click_the_login_button(){
		//driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		 WebElement loginBtn = driver.findElement(By.xpath("//input[@class='btn btn-small']"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();", loginBtn);
		
	}
	@Then("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    
		String homeTitle = driver.getTitle();
		System.out.println("Home Page Titel  ::"+homeTitle);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", homeTitle);
	}

	@Then("^user is in new contact page$")
	public void user_is_in_new_contact_page() throws Throwable {
	    driver.switchTo().frame("mainpanel");
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	    Thread.sleep(2000);
	   // driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	    WebElement newContact = driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();", newContact);
	   
	}

	@Then("^user enters the contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_contact_details_and_and(String firstname, String lastname, String company) throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(company);
		driver.findElement(By.xpath("//body/table/tbody/tr/td/table/tbody/tr/td/fieldset[@class='fieldset']/form[@id='contactForm']/table/tbody/tr/td/input[2]")).click();
	    
	}
	/*
	@Then("^Close the browse$")
	public void Close_the_browse(){
		driver.quit();
	}
	*/
}
