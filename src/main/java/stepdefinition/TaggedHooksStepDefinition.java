package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {
	//Global Hooks
	@Before(order=0)
	public void setUP(){
		System.out.println("Launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After(order=0)
	public void tearDown(){
		System.out.println("close the browser");
	}
	
	@Before(order=1)
	public void setUP1(){
		System.out.println("Launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After(order=1)
	public void tearDown1(){
		System.out.println("close the browser");
	}
	
	//Local - only for first scenario
	@Before("@First")
	public void beforeFirst(){
		System.out.println("Before only first scenario ");
	}
	@After("@First")
	public void AfterFirst(){
		System.out.println("After only first scenario ");
	}
	
	@Before("@Second")
	public void beforeSecond(){
		System.out.println("Before only Second scenario ");
	}
	
	@After("@Second")
	public void AfterSecond(){
		System.out.println("After only Second scenario ");
	}
	@Before("@Third")
	public void beforeThird(){
		System.out.println("Before only Third scenario ");
	}
	@After("@Third")
	public void AfterThird(){
		System.out.println("After only Third scenario ");
	}
	
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
	    System.out.println("Before only Second scenario ");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
	   
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
	   
	}

}
