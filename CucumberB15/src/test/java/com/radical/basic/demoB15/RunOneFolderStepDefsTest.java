package com.radical.basic.demoB15;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		features = {"src/test/resources/demoB15/"},
		glue = {"com/radical/basic/demoB15/"}
		
		
		)


public class RunOneFolderStepDefsTest {
	
}
