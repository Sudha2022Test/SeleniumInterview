package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FormCPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify if user is able to Sign up using FormC registration page";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
	}
	
	@Test
	public void formCRegistration() {
		
		new FormCPage()
		.clickOnSignUpReg()
		.waitForPageLoad(2000)
		.enterUserId("sudhasthrmn2")
		.enterUserPswd("Sudha2022@")
		.enterUserCnfPswd("Sudha2022@")
		.waitForPageLoad(3000)
		.selSecQues("where did you meet your spouse?")
		.enterSecAns("Chennai")
		.enterName("Sudha")
		.waitForPageLoad(2000)
		.selGender("Female")
		.enterDOB("16/08/1986")
		.enterDesignation("Software")
		.enterEmailId("sudhasthrmn2@gmail.com")
		.enterMobile("7824010991")
		.enterPhoneNumber("9443116140")
		.waitForPageLoad(2000)
		.selNationality("INDIA")
		.enterHotelName("Sheraton")
		.enterCapacity("6")
		.enterHotelAddress("Kilpauk")
		.waitForPageLoad(1000)
		.selHotelState("TAMIL NADU")
		.waitForPageLoad(2000)
		.selHotelCity("CHENNAI")
		.waitForPageLoad(2000)
		.selAccoType("Guest House")
		.selAccoGrade("Five Star")
		.enterHotelEmail("sudhasthrmn2@gmail.com")
		.enterHotelMobile("8765432891")
		.enterHotelPhone("9176928434")
		.enterOwnerName("Deepa")
		.waitForPageLoad(3000)
		.enterOwnerAddress("Mylapore")
		.waitForPageLoad(2000)
		.selOwnerState("TAMIL NADU")
		.waitForPageLoad(2000)
		.selOwnerCity("CHENNAI")
		.enterOwnerEmail("deepa@gmail.com")
		.enterOwnerPhone("9176928434")
		.enterOwnerMobile("9094760719");
	}

}
