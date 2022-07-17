package pom.irctc.pages;

import org.openqa.selenium.Keys;

import wrappers.GenericWrappers;

public class FTRRegistrationPage extends GenericWrappers {
	
	public FTRRegistrationPage enterUserId(String userId) {
		enterByXpath("//input[@id='userId']", userId);
		return this;
	}
	
	public FTRRegistrationPage enterPassword(String pswd) {
		enterByXpath("//input[@id='password']", pswd);
		return this;
	}
	
	public FTRRegistrationPage enterCnfrmPassword(String cnfrmPswd) {
		enterByXpath("//input[@id='cnfPassword']", cnfrmPswd);
		return this;
	}
	
	public FTRRegistrationPage selSecQues(String selQues) {
		selectVisibileTextXPath("//select[@id='secQstn']", selQues);
		return this;
	}
	
	public FTRRegistrationPage secAnswer(String secAns) {
		enterByXpath("//input[@id='secAnswer']", secAns);
		return this;
	}
	
	public FTRRegistrationPage enterDOB(String DOB) {
		enterByXpath("//input[@id='dateOfBirth']", DOB +Keys.TAB);
		return this;
	}
	
	public FTRRegistrationPage clickGender() {
		clickByXpath("//input[@id='gender1']");
		return this;
	}
	
	public FTRRegistrationPage clickMaritalStatus() {
		clickByXpath("//input[@id='maritalStatus0']");
		return this;
	}
	
	public FTRRegistrationPage enterEmail(String email) {
		enterByXpath("//input[@id='email']",email);
		return this;
	}
	
	public FTRRegistrationPage selOccupation(String occupation) {
		selectVisibileTextXPath("//select[@id='occupation']", occupation);
		return this;
	}
	
	public FTRRegistrationPage enterFName(String fName) {
		enterByXpath("//input[@id='fname']", fName);
		return this;
	}
	
	public FTRRegistrationPage enterMName(String mName) {
		enterByXpath("//input[@id='mname']", mName);
		return this;
	}
	
	public FTRRegistrationPage enterLName(String lName) {
		enterByXpath("//input[@id='lname']", lName);
		return this;
	}
	
	public FTRRegistrationPage selNationality(String nationality) {
		selectVisibileTextXPath("//select[@id='natinality']", nationality);
		return this;
	}
	
	public FTRRegistrationPage enterAddr1(String addr1) {
		enterByXpath("//input[@id='flatNo']", addr1);
		return this;
	}
	
	public FTRRegistrationPage enterAddr2(String addr2) {
		enterByXpath("//input[@id='street']", addr2);
		return this;
	}
	
	public FTRRegistrationPage enterAddr3(String addr3) {
		enterByXpath("//input[@id='area']", addr3);
		return this;
	}
	
	public FTRRegistrationPage selCountry(String country) {
		selectVisibileTextXPath("//select[@id='country']", country);
		return this;
	}
	
	public FTRRegistrationPage enterMobile(String mobile) {
		enterByXpath("//input[@id='mobile']", mobile);
		return this;
	}
	
	public FTRRegistrationPage enterPincode(String pincode) {
		enterByXpath("//input[@id='pincode']", pincode);
		return this;
	}
	
	public FTRRegistrationPage selPO(String postOffice) {
		selectVisibileTextXPath("//select[@id='postOffice']", postOffice);
		return this;
	}
	
	public FTRRegistrationPage clickCommunication() {
		clickByXpath("//input[@id='sameAddresses1']");
		return this;
	}
	
	public FTRRegistrationPage enterOfzAddr1(String offAddr1) {
		enterByXpath("//input[@id='flatNoOffice']", offAddr1);
		return this;
	}
	
	public FTRRegistrationPage enterOfzAddr2(String offAddr2) {
		enterByXpath("//input[@id='streetOffice']", offAddr2);
		return this;
	}
	
	public FTRRegistrationPage enterOfzAddr3(String offAddr3) {
		enterByXpath("//input[@id='areaOffice']", offAddr3);
		return this;
	}
	
	public FTRRegistrationPage selOfzCountry(String offCountry) {
		selectVisibileTextXPath("//select[@id='countryOffice']", offCountry);
		return this;
	}
	
	public FTRRegistrationPage enterOfzMobile(String ofzMobile) {
		enterByXpath("//input[@id='mobileOffice']", ofzMobile);
		return this;
	}
	
	public FTRRegistrationPage enterOfzPincode(String ofzPincode) {
		enterByXpath("//input[@id='pincodeOffice']", ofzPincode);
		return this;
	}
	
	public FTRRegistrationPage selOfzPO(String ofzPO) {
		selectVisibileTextXPath("//select[@id='postOfficeOffice']", ofzPO);
		return this;
	}
	
	public FTRRegistrationPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public FTRRegistrationPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}
	
	public FTRRegistrationPage scrollPageDown() {
		pageDown();
		return this;
	}

}
