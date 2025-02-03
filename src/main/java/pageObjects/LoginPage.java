package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricLib.PropertyFile;

public class LoginPage {
	WebDriver driver;
	PropertyFile pdata=new PropertyFile();
	
	@FindBy(name = "username")
	private WebElement UsernameTb;

	@FindBy(name = "password")
	private WebElement PasswordTb;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginBtn;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void enterUsername() throws IOException {
		UsernameTb.sendKeys(pdata.getPropertyFile("Username"));
	}
	public void enterPassword() throws IOException {
		PasswordTb.sendKeys(pdata.getPropertyFile("Password"));
	}
	public void clickOnLoginBtn() {
		LoginBtn.click();
		
	}
	public String tileOfLoginscreen() {
		String LoginPageTitle=driver.getTitle();
		return LoginPageTitle;
	}

}
