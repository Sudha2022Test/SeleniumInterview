package pom.php.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.php.pages.PHPPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify PHP Sign up for the new user registration";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://www.phptravels.org";
	}
	
	@Test
	public void PHPCreateAcct() {
		
		new PHPPage()
		.clickOnCreateAcct()
		.waitForPageLoad(3000)
		.enterFirstName("Sudha")
		.enterLastName("Sethuraman")
		.enterEmail("sudhasthrmn2@gmail.com")
		.enterPhoneNum("7824010991")
		.enterCompanyName("Opsera")
		.enterAddress1("Munusamy Street")
		.enterAddress2("Chrompet")
		.enterCity("Chennai")
		.enterState("TamilNadu")
		.enterPostalCode("600044")
		.entercustomField("7824010991")
		.enterPassword("Sudha2022@")
		.entercnfrmPassword("Sudha2022@");
		
	}

}
