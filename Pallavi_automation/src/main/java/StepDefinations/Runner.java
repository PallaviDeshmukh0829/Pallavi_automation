package StepDefinations;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="CucumberFeatures",glue= {"StepDefinations"})
public class Runner {
	 
}
