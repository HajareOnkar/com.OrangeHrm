package genaricLib;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {
public static WebDriver driver;
PropertyFile pdata=new PropertyFile();


	@BeforeMethod
	public void openBrowser() throws IOException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\onkar\\Downloads\\chromedriver-win64");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get(pdata.getPropertyFile("URL"));
//		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));


	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
