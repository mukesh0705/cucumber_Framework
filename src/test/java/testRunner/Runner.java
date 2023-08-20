package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile/AddSuppliers.feature",glue= "stepDefinition", dryRun=false)

public class Runner {
	//Cucumber is a framework which support 
	//BDD-Behavior Driven Development:-
	//In BDD Automation programs are created based on the behavior of Application.
	//Here the automation programs are written based on a file called feature file.
	// Feature file have it's own language called Gherkin,in this language we use simple 
	//English with some predefined keywords like.... Feature:,scenario:,Example:,Given,When,And,Then etc.
	

}

