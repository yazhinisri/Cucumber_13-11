package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDef {
	@Given("Launch Chrome and get into FB Home page")
	public void launch_chrome_and_get_into_fb_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\HP\\Drivers\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	  
	        // Maximize the browser
	        driver.manage().window().maximize();
	  
	        // Launch Website
	        driver.get("https://www.geeksforgeeks.org/");
	    
	  //  throw new io.cucumber.java.PendingException();
	}
/*
	@Given("Enter Username and Password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click submit button")
	public void click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify Logging Success and get into Home page")
	public void verify_logging_success_and_get_into_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

*/
}
