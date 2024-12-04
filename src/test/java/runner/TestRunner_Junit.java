package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"src\\test\\resources\\Features\\OrangeHRM_Login.feature"},
		glue = {"com.qa.stepdefinition"},
		dryRun=false,
		plugin={"pretty", "html:target/cuucmber-reports/cucumber-reports.html",
				"json:target/cuucmber-reports/cucumber-reports.json",
				"junit:target/cuucmber-reports/cucumber-reports.xml"},
		tags = ("@reg or @sanity"),
		monochrome=true
		
		)

public class TestRunner_Junit {

}
