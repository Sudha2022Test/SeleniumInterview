package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To verify the Confirmation Alert validation";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}
	
	@Test
	public void cnfrmtnAlert() {
		
		 new AlertPage()
		.switchFrame()
		.clickOnTryIt()
		.alertText()
		.clickOnAcceptAlert()
		.getPageAlertText()
		.verifyCnfrmOkAlertText("You pressed OK!")
		.pageRefresh()
		.mainContent()
		.switchFrame()
		.clickOnTryIt()
		.alertText()
		.clickOnDismissAlert()
		.verifyCnfrmCancelAlertText("You pressed Cancel!")
		.mainContent()
		.clickHome()
		.waitForPageLoad(2000);
		}

}
