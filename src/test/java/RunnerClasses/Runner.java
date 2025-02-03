package RunnerClasses;

import genaricLib.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "FeatureFiles",
		glue="stepdefs")
public class Runner extends BaseClass{

}
