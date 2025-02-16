package RunnerClasses;

import genaricLib.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "FeatureFiles",
		glue={"stepdefs","Hooks"},
		tags="@smoke",
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class Runner extends BaseClass{

}
