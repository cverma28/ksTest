package runnerFile;
 

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/HomePage", glue="", plugin={"pretty","html:ReportsFolder"})
public class HomeRunnerTest {

}