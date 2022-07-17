package pom.irctc.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC0012 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify IRCTC Sign up for the new user registration";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void irctcRegistration() {
		
		new CovidAlertPage()
		.clickOnOk()
		.clickOnRegister()
		.enterUserName("Sudhasthrmn2")
		.enterPassword("Sudha2022@")
		.cnfrmPassword("Sudha2022@")
		.language()
		.selectlanguage("English")
		.waitForPageLoad(2000)
		.secQues()
		.selectsecQues("What is your pet name?")
		.enterSecAns("Sudha")
		.clickContinue()
		.enterFirstName("Sudha")
		.enterMiddleName("S")
		.enterLastName("Sethuraman")
		.clickOcc()
		.selOcc("PROFESSIONAL")
		.enterDOB("16-08-1986")
		.maritalStatus()
		.selCountry("India")
		.clickGender("Female")
		.enterEmail("sudhasthrmn2@gmail.com")
		.enterMobile("7824010991")
		.selNationality("India")
		.clickContinue()
		.enterResAddress1("Munusamy Street")
		.enterResAddress2("Sathish Builders")
		.enterResAddress3("Ganapathipuram")
		.enterResPincode("600044"+Keys.TAB)
		.waitForPageLoad(3000)
		.selResCity("Kanchipuram")
		.waitForPageLoad(2000)
		.selResPostOffice("Ganapathipuram(CMT) S.O")
		.enterResPhone("7824010991")
		.copyAddr()
		.enterOfzAddress1("Munusamy Street")
		.enterOfzAddress2("Sathish Builders")
		.enterOfzAddress3("Ganapathipuram")
		.clickCountry()
		.selOfzCountry("India")
		.enterOfzPincode("600044")
		.enterOfzState("TAMILNADU")
		.enterOfzCity("Chennai")
		.enterOfzPostOffice("Gnapathipuram")
		.enterOfzPhone("7824010991");
		
		}

	

}
