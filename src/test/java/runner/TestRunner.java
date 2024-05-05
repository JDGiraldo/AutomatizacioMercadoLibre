package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources", //Directory Archives Feature
    glue = "steps", //Donde tenemos definidos los Steps
    plugin = { "pretty","html:target/cucumber-reports" }
 )

public class TestRunner {
    public static void cleanDriver(){
                BasePage.closeBrowser();
        }
}
