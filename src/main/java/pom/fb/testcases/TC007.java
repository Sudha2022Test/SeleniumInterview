package pom.fb.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.fb.pages.CreateFBAccountPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify Facebook Sign up for the new user registration";
		author="Sudha";
		category="Smoke";
		browserName="Chrome";
		url="https://www.facebook.com";
		sheetName="TC007";
	}
	
	@Test(dataProvider="fetchData")
	public void createFBAccount(String FirstName, String LastName, String email, String emailcnfrmtn, String pswd, String day, String month, String year, String gender) {
		
		new CreateFBAccountPage()
		.clickOnCreateAcct()
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.enterEMail(email)
		.entercnfrmEmail(emailcnfrmtn)
		.enterPassword(pswd)
		.selectDay(day)
		.selectMonth(month)
		.selectYear(year)
		.clickOnGender(gender);
	}

}
