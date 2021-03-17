package com.fresco.cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"pretty" , "html:target/reports", "json:target/reports/cucumber.json"}, 
features="src/test/resources")
public class CucumberRunner {

}
