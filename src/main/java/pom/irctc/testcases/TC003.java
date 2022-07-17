package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify if user is able to do the Saloon mandatory check";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void saloonMandatoryCheck() {
		
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.currentWindowNavigation()
		.clickMenu()
		.clickOnCharter()
		.currentWindowNavigation()
		.clickOnEnquiryForm()
		.currentWindowNavigation()
		.enterName("Sudha")
		.enterOrganisation("Opsera")
		.enterAddress("Munusamy Street")
		.enterMobile("782401099")
		.enterEmail("sudhasthrmn2@gmail.com")
		.selReq("Saloon Charter")
		.enterSource("Chennai")
		.enterDest("Hyderabad")
		.waitForPageLoad(2000)
		.clickCheckInDate()
		.selCheckInDate("18")
		.waitForPageLoad(3000)
		.clickCheckOutDate()
		.selCheckOutDate("25")
		.waitForPageLoad(1000)
		.enterDays("10")
		.enterCoachType("A1")
		.enterNoPassenger("6")
		.waitForPageLoad(2000)
		.enterPurpose("Vacation")
		.enterServices("CAB")
		.clickSubmit()
		.waitForPageLoad(2000);
		
	}

}
