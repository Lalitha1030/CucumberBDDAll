package stepdefinition;

import java.util.List;
import java.util.Map;
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

// data table with maps : for parameterization of testcases
public class DataTableMapStepDefinition {
	WebDriver driver;
	@Given("^user should be on CRM login page$")
	public void user_should_be_on_CRM_login_page() throws Throwable {
		 System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		    driver.get("https://classic.freecrm.com/index.html");
	}

	@When("^Verify title of login page$")
	public void verify_title_of_login_page() throws Throwable {
		 String loginTitle = driver.getTitle();
		   System.out.println("Title of the Login Page is:  "+loginTitle);
		   Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", loginTitle);
	}

	@Then("^user enters the user credentials$")
	public void user_enters_the_user_credentials(DataTable credentials) throws Throwable {
	    for(Map<String, String> datamap : credentials.asMaps(String.class, String.class)){
	     driver.findElement(By.name("username")).sendKeys(datamap.get("username"));
	     driver.findElement(By.name("password")).sendKeys(datamap.get("password"));
	    }
	}

	@Then("^click login button in login page$")
	public void click_login_button_in_login_page() throws Throwable{
		WebElement loginBtn = driver.findElement(By.xpath("//input[@class='btn btn-small']"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^Verify home page title$")
	public void verify_home_page_title() throws Throwable {
		String homeTitle = driver.getTitle();
		System.out.println("Home Page Titel  ::"+homeTitle);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", homeTitle);
	}

	@Then("^user able to move to new deal page$")
	public void user_able_to_move_to_new_deal_page() throws Throwable {
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

	@Then("^user will enter deal details$")
	public void user_will_enter_deal_details(DataTable dealData) throws Throwable {
		for(Map<String, String> dealValue : dealData.asMaps(String.class, String.class)){
		
		driver.findElement(By.id("title")).sendKeys(dealValue.get("title"));
		driver.findElement(By.name("client_lookup")).clear();
		driver.findElement(By.name("client_lookup")).sendKeys(dealValue.get("company"));
		driver.findElement(By.id("amount")).sendKeys(dealValue.get("amount"));
		driver.findElement(By.id("probability")).sendKeys(dealValue.get("probability"));
		driver.findElement(By.id("commission")).sendKeys(dealValue.get("commission"));
		driver.findElement(By.xpath("//body/table/tbody/tr/td/table/tbody/tr/td/fieldset[@class='fieldset']/form[@id='prospectForm']/table/tbody/tr/td/input[1]")).click();
		
		 Actions action = new Actions(driver);
		    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		    Thread.sleep(2000);
		   // driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		    WebElement newDealLink = driver.findElement(By.xpath("//a[contains(text(),'New Deal')]"));
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("arguments[0].click();", newDealLink);
		    Thread.sleep(2000);
		/*
		WebElement saveBtn = driver.findElement(By.xpath("//input[contains(@value='Save' and @class='button')]"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();", saveBtn);
		 */
		}
	}

	@Then("^after saving the deal details close the browser$")
	public void after_saving_the_deal_details_close_the_browser() throws Throwable {
	    driver.quit();
	}
}
