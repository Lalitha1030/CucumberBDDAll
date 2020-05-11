package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefinition {
WebDriver driver;
	

	

	

	@Given("^User is taken to Login Page$")
	public void User_is_taken_to_Login_Page()throws Throwable  {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marrionette", true);
		//driver = new FirefoxDriver(capabilities);
		driver = new FirefoxDriver();
		driver.get("https://www.publix.com/login");
	}

	// 1. \"([^\"]*)\"
	// 2. \"(.*)\"
	@When("^User enters the \"(.*)\" and \"(.*)\"$")
	public void User_enters_the_username_and_password(String username, String password) throws Throwable {
	    driver.findElement(By.id("tmpUserNameInput")).sendKeys(username);
	    driver.findElement(By.id("passwordInput")).sendKeys(password);
	    
	   
	}

	@Then("^User click the login button$")
	public void User_click_the_login_button() throws Throwable {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("^User should see the home page$")
	public void User_should_see_the_home_page() throws Throwable{
		String title = driver.getTitle();
		Assert.assertEquals("Home | Publix Super Markets", title);
	}
}
