package pom.irctc.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify if the user is able to Book the coach";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void bookYourCoach() {
		
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.currentWindowNavigation()
		.waitForPageLoad(2000)
		.clickMenu()
		.clickOnBookYourCoach()
		.currentWindowNavigation()
		.waitForPageLoad(3000)
		.clickOnNewUser()
		.currentWindowNavigation()
		.enterUserId("sudhasthrmn2")
		.enterPassword("Sudha2022@")
		.enterCnfrmPassword("Sudha2022@")
		.waitForPageLoad(2000)
		.selSecQues("What is your pet name?")
		.secAnswer("Sudha")
		.waitForPageLoad(3000)
		.enterDOB("16/08/1986"+Keys.TAB)
		.waitForPageLoad(2000)
		.clickGender()
		.waitForPageLoad(1000)
		.clickMaritalStatus()
		.enterEmail("sudhasthrmn2@gmail.com")
		.waitForPageLoad(2000)
		.selOccupation("Professional")
		.enterFName("Sudha")
		.enterMName("S")
		.enterLName("Sethuraman")
		.selNationality("Indian")
		.enterAddr1("Sathish Builders")
		.enterAddr2("Munusamy Street")
		.enterAddr3("Chrompet")
		.selCountry("India")
		.enterMobile("7824010991")
		.enterPincode("600044"+Keys.TAB)
		.selPO("Ganapathipuram(CMT) S.O")
		.scrollPageDown()
		.waitForPageLoad(2000)
		.clickCommunication()
		.enterOfzAddr1("Sathish Builders")
		.enterOfzAddr2("Munusamy Street")
		.enterOfzAddr3("Chrompet")
		.waitForPageLoad(2000)
		.selOfzCountry("India")
		.enterOfzMobile("7824010991")
		.enterOfzPincode("600044"+Keys.TAB)
		.selOfzPO("Ganapathipuram(CMT) S.O");
	}

}
