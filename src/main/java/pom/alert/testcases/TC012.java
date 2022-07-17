package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="To verify the Prompt Alert validation";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	}
	
	@Test
	public void promptAlert() {
		
		 new AlertPage()
		.switchFrame()
		.clickOnTryIt()
		.enterPromptAlertText("Sudha")
		.clickOnAcceptAlert()
		.getPageAlertText()
		.verifyPromptOkAlertText("Hello Sudha! How are you today?")
		.pageRefresh()
		.switchFrame()
		.clickOnTryIt()
		.enterPromptAlertText("Sudha")
		.clickOnDismissAlert()
		.verifyPromptCancelAlertText("User cancelled the prompt.")
		.mainContent()
		.clickHome()
		.waitForPageLoad(2000);
	}

}
