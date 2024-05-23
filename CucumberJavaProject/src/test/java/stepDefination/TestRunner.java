package stepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/contact.feature",glue = {"stepDefination"},
//@CucumberOptions(features = "src/test/resources/features/HRMLogin.feature",glue = { "stepDefination"},
dryRun=false,
monochrome=true,


plugin={"pretty","html:CucumberJavaProject/ALL_Reports/HTMLReports/cucumber.html",
		"json:CucumberJavaProject/ALL_Reports/JSONreports/cucumber.json",
		"junit:CucumberJavaProject/ALL_Reports/JUnitReports/cucumber.xml"}
//tags="@RegTest"

		)

public class TestRunner 
{

}
