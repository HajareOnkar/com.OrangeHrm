package Hooks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import genaricLib.BaseClass;
import genaricLib.PropertyFile;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookclass extends BaseClass {

	//Scenario sc;

	PropertyFile pdata = new PropertyFile();

	@Before()
	public void brforeHook() throws IOException {
		driver.get(pdata.getPropertyFile("URL"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}

	@AfterStep
	public void afterstepTakeScreenshot(Scenario s) throws InterruptedException {
		if(s.isFailed()) {
         Thread.sleep(100);
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] pic = ts.getScreenshotAs(OutputType.BYTES);
		s.attach(pic, "image/png", "screenshot");}

	}

}
