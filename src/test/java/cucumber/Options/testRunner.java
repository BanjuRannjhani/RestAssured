package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features" , 
		glue={"stepdef"} ,
		plugin = { 
				//"pretty", "json:target/cucumber-reports/Cucumber.json",
                 "junit:target/cucumber-reports/Cucumber.xml",
                 "html:target/cucumber-reports/html" ,
                 "html:target/output/html"
		} ,
//				, publish = true 
		 tags = "@regression" 
//		, monochrome = true 
		)
public class testRunner {

}
