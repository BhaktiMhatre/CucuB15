package com.radical.basic.allfilesinsamefolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		features = {"src/test/java/com/radical/basic/"},
		glue = {"com/radical/basic/"}
		
		
		)


public class RunOneFolderStepDefsTest {
	
}
