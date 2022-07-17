package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify if user is able to Book hotels using GST validation";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://www.irctc.co.in";
	}
	
	@Test
	public void BookHotelsGSTValidation() {
		
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.currentWindowNavigation()
		.waitForPageLoad(1000)
		.clickOnHotels()
		.currentWindowNavigation()
		.waitForPageLoad(1000)
		.clickOnLogin()
		.waitForPageLoad(2000)
		.currentWindowNavigation()
		.clickOnGuestLogin()
		.enterEmail("sudhasthrmn2@gmail.com")
		.enterMobile("7824010991")
		.clickOnLogin2()
		.currentWindowNavigation()
		.waitForPageLoad(1000)
		.enterCity("Hyderabad")
		.clickCity()
		.waitForPageLoad(2000)
		.clickCheckInCalendar()
		.waitForPageLoad(1000)
		.clickCheckInDateMenu()
		.waitForPageLoad(1000)
		.clickCheckInYear("2022")
		.waitForPageLoad(1000)
		.clickCheckInMonth("Jul")
		.waitForPageLoad(1000)
		.clickCheckInDay("18")
		.waitForPageLoad(1000)
		.clickCheckOutCalendar()
		.waitForPageLoad(1000)
		.clickCheckOutDateMenu()
		.waitForPageLoad(1000)
		.clickCheckOutYear("2022")
		.waitForPageLoad(1000)
		.clickCheckOutMonth("Jul")
		.waitForPageLoad(1000)
		.clickCheckOutDay("25")
		.clickGuest()
		.waitForPageLoad(2000)
		.selectAdult("3")
		.clickDone()
		.clickOnFindHotel()
		.currentWindowNavigation()
		.getHotelName()
		.getHotelPrice()
		.waitForPageLoad(2000)
		.clickOnFirstHotel()
		.currentWindowNavigation()
		.clickOnContinueToBook()
		.currentWindowNavigation()
		.selectTitle("Mrs")
		.enterFName("Sudha")
		.enterLName("Sethuraman")
		.selectState("TAMIL NADU")
		.selGST("Yes")
		.enterCompanyName("Opsera")
		.enterCompanyAddress("Chennai")
		.clickOnContinueNew()
		.verifyGSTMessage("gstNumber is required.");
	}

}
