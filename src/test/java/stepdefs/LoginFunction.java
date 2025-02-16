package stepdefs;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;

import genaricLib.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import jdbcConnectBasic.EmpNameCaller;
import pageObjects.LoginPage;

public class LoginFunction extends BaseClass {
	LoginPage lp=new LoginPage(driver);
	
	@Given("User navigate to Login screen")
	public void user_navigate_to_login_screen() {
	   Assert.assertEquals(lp.tileOfLoginscreen(),"OrangeHRM");
//	   System.out.println("Ename column1 = "+ EmpNameCaller.callEmpOne().getEmpno());
//	   System.out.println("Ename column1 = "+ EmpNameCaller.callEmpOne().getEmpno());
	 
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
	
	
	
	
	@When("User enter invalid username {string} and valid password {string}")
	public void user_enter_invalid_username_and_valid_password(String username, String password) throws IOException {

     lp.enterUsernameManual(username);
     lp.enterPasswordManual(password);
	}

	@Then("User gives error")
	public void user_gives_error() {
	    
	}
	
	
	
	@When("User enter username and password")
	public void user_enter_username_and_password(DataTable dataTable) throws IOException, InterruptedException {
      List<List<String>> data=dataTable.asLists();
      
//      lp.enterUsernameManual(data.get(0).get(0));
//      lp.enterPasswordManual(data.get(0).get(1));

      
      for(List<String> ndata:data) {
    	  lp.enterUsernameManual(ndata.get(0)); 
    	  lp.enterPasswordManual(ndata.get(1));
      }
      
      Thread.sleep(10000);
      
      
      

	}





}
