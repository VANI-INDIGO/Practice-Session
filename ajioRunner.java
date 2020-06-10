package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "/D:/TESTLEAF/Maven/Cucumber_90/src/test/java/feature/ajio.feature" , 
					glue="steps",
					//snippets = SnippetType.CAMELCASE,
					monochrome=true)
public class ajioRunner extends AbstractTestNGCucumberTests {

}
