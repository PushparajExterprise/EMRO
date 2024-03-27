package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="emrosamplestepdefenition",dryRun = false, monochrome = true
,plugin= {"pretty","json:target/cucumber-report/cucumber.json"})


public class TestRunner {

	
	@AfterClass
	public static void report() throws InterruptedException {	
		BaseClass.generateJvmReport("target/cucumber-report/cucumber.json");
	}
	
}
