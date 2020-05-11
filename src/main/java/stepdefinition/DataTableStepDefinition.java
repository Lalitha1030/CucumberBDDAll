package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDefinition {

	WebDriver driver;
	@Given("^user is on CRM login page$")
	public void user_is_on_CRM_login_page() throws Throwable {
		 System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		    driver.get("https://classic.freecrm.com/index.html");
	}

	@When("^Verify the title of login page$")
	public void verify_the_title_of_login_page() throws Throwable {
		 String loginTitle = driver.getTitle();
		   System.out.println("Title of the Login Page is:  "+loginTitle);
		   Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", loginTitle);
	}

	@Then("^enter the user credentials$")
	public void enter_the_user_credentials(DataTable credentials) throws Throwable {
	     List<List<String>> data = credentials.raw();
	     driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	     driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}

	@Then("^Click the login button in login page of CRM$")
	public void click_the_login_button_in_login_page_of_CRM() throws Throwable {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@class='btn btn-small']"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^Verify title of the home page$")
	public void verify_title_of_the_home_page() throws Throwable {
		String homeTitle = driver.getTitle();
		System.out.println("Home Page Titel  ::"+homeTitle);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", homeTitle);
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws Throwable {
	    driver.switchTo().frame("mainpanel");
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	    Thread.sleep(2000);
	   // driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	    WebElement newDealLink = driver.findElement(By.xpath("//a[contains(text(),'New Deal')]"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();", newDealLink);
	    Thread.sleep(2000);
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealData) throws Throwable {
		List<List<String>> dealValue = dealData.raw();
		
		driver.findElement(By.id("title")).sendKeys(dealValue.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealValue.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealValue.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dealValue.get(0).get(3));
		driver.findElement(By.xpath("//body/table/tbody/tr/td/table/tbody/tr/td/fieldset[@class='fieldset']/form[@id='prospectForm']/table/tbody/tr/td/input[1]")).click();
		/*
		WebElement saveBtn = driver.findElement(By.xpath("//input[@value='save' and @class='button']"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();", saveBtn);
		 */
	}

	@Then("^close the opened browser$")
	public void close_the_opened_browser() throws Throwable {
	    driver.quit();
	}
}
