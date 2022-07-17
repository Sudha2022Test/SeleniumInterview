package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify the Simple Alert validation";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	
	@Test
	public void simpleAlert() {
		
		new AlertPage()
		.switchFrame()
		.clickOnTryIt()
		.alertText()
		.clickOnAcceptAlert()
		.mainContent()
		.clickHome()
		.waitForPageLoad(2000);
	}

}
