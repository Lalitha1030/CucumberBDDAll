package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithExampleStepDefinition {
	
	WebDriver driver;
	@Given("^User is on the Login Page$")
	public void user_is_on_the_Login_Page() throws Throwable {
	    System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver-v0.26.0-win32/geckodriver.exe");
	    driver = new FirefoxDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	   driver.get("https://www.publix.com/login");
	}

	@When("^User enters  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	  driver.findElement(By.id("tmpUserNameInput")).sendKeys(username);
	  driver.findElement(By.id("passwordInput")).sendKeys(password);
	    
	}

	@Then("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		//driver.findElement(By.id("submitButton")).click();
	   WebElement loginBtn = driver.findElement(By.id("submitButton"));
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^User should be on the home page$")
	public void user_should_be_on_the_home_page() throws Throwable {
	    String title = driver.getTitle();
	    Assert.assertEquals("Home | Publix Super Markets", title);
	}
	
	@Then("^Close the browser$")
	public void Close_the_browser(){
		driver.quit();
	}

}
