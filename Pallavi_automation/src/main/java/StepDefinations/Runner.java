package StepDefinations;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="CucumberFeatures/toolshop_cust_reg.feature",glue= {"StepDefinations"})
public class Runner {
	 
}
