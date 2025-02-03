package stepdefs;

import java.io.IOException;

import org.testng.Assert;

import genaricLib.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginFunction extends BaseClass {
	LoginPage lp=new LoginPage(driver);
	
	@Given("User navigate to Login screen")
	public void user_navigate_to_login_screen() {
	   Assert.assertEquals(lp.tileOfLoginscreen(),"OrangeHRM");
	}

	@When("User enter vlid username and valid password")
	public void user_enter_vlid_username_and_valid_password() throws IOException {
		lp.enterUsername();
		lp.enterPassword();
	   
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		lp.clickOnLoginBtn();
	    
	}
	@Then("User navigate to home screen")
	public void user_navigate_to_home_screen() {
		
	}




}
