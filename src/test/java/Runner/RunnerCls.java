package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\HP\\eclipse-workspace\\DemoLearn\\src\\test\\java\\Features\\"
		,glue="Stepdef",
		plugin= {"html:Report/HtmlReport1.html","junit:Report/xmlReport1.Xmp","json:Report/JsonReport1.json"}
)

public class RunnerCls {

	
}
