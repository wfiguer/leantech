package com.leantech.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/java/com/leantech/features",glue={""})	
public class Runner {
    
}
