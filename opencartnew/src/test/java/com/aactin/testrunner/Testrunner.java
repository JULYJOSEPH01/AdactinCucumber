


package com.aactin.testrunner;
import java.io.IOException;
import java.sql.Driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.utils.Cucumberjvmreport;
import com.adactin.utils.Loadproperty;
import com.baseclass.adactin.Baseadactin;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( plugin= {"pretty","json:src/test/resource/com/adactin/report/cucumber-report1.json",
		"junit:src/test/resource/com/adactin/report/cucumber-report1.xml",
		"html:src/test/resource/com/adactin/report/cucumber-report1.html"
		},
		
 
		features="src\\test\\java\\com\\opencart\\feature\\Adactin.feature",
		glue= {"com.adactin.stepdefinition", "com.adactin.hook"},
 tags= "@Sc11"		
		)
public class Testrunner  extends Baseadactin{
	public static WebDriver driver1;
	@BeforeClass
	public static void initialization() throws Exception {
		Loadproperty lp=new Loadproperty();

driver1=getBrowser(lp.getBrowserName());
getUrl(lp.getURL());
	}	
@AfterClass
public static void driverquit() {
	driver1.quit();
	Cucumberjvmreport.getReport();
}
}