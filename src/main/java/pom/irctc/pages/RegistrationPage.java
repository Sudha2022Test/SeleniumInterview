package pom.irctc.pages;


import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	
	public RegistrationPage enterUserName(String userName) {
		enterByXpath("//input[@id='userName']", userName);
		return this;
	}
	
	public RegistrationPage enterPassword(String pswd) {
		enterByXpath("//input[@id='usrPwd']", pswd);
		return this;
	}
	
	public RegistrationPage cnfrmPassword(String cnfrmPswd) {
		enterByXpath("//input[@id='cnfUsrPwd']", cnfrmPswd);
		return this;
	}
	
	public RegistrationPage language() {
		clickByXpath("//p-dropdown[@formcontrolname='prefLang']");
		return this;
	}
	
	public RegistrationPage selectlanguage(String Language) {
		clickByXpath("//span[text()='"+Language+"']");
		return this;
	}
	
	public RegistrationPage secQues() {
		clickByXpath("//p-dropdown[@formcontrolname='secque']");
		return this;
	}
	
	public RegistrationPage selectsecQues(String secQues) {
		clickByXpath("//span[text()='"+secQues+"']");
		return this;
	}
	
	public RegistrationPage enterSecAns(String secAns) {
		enterByXpath("//input[@formcontrolname='secAns']", secAns);
		return this;
	}
	
	public RegistrationPage clickContinue() {
		clickByXpath("//button[@label='Continue']");
		return this;
	}
	
	public RegistrationPage enterFirstName(String fName) {
		enterByXpath("//input[@id='firstName']", fName);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String mName) {
		enterByXpath("//input[@id='middleName']",mName);
		return this;
	}
	
	public RegistrationPage enterLastName(String lName) {
		enterByXpath("//input[@id='lastname']", lName);
		return this;
	}
	
	public RegistrationPage clickOcc() {
		clickByXpath("//p-dropdown[@formcontrolname='occupation']");
		return this;
	}
	
	public RegistrationPage selOcc(String occupation) {
		clickByXpath("//span[text()='"+occupation+"']");
		return this;
	}
	
	public RegistrationPage enterDOB(String DOB) {
		enterByXpath("//input[@placeholder='Date Of Birth']", DOB);
		return this;
	}
	
	public RegistrationPage maritalStatus() {
		clickByXpath("(//div[@role='radio'])[1]");
		return this;
	}
	
	public RegistrationPage selCountry(String country) {
		selectVisibileTextXPath("//select[@formcontrolname='resCountry']", country);
		return this;
	}
	
	public RegistrationPage clickGender(String gender) {
		clickByXpath("//span[text()='"+gender+"']");
		return this;
	}
	
	public RegistrationPage enterEmail(String email) {
		enterByXpath("//input[@id='email']", email);
		return this;
	}
	
	public RegistrationPage enterMobile(String mobile) {
		enterByXpath("//input[@id='mobile']", mobile);
		return this;
	}
	
	public RegistrationPage selNationality(String Nationality) {
		selectVisibileTextXPath("//select[@formcontrolname='nationality']", Nationality);
		return this;
	}
	
	public RegistrationPage enterResAddress1(String resAddr1) {
		enterByXpath("//input[@id='resAddress1']", resAddr1);
		return this;
	}
	
	public RegistrationPage enterResAddress2(String resAddr2) {
		enterByXpath("//input[@id='resAddress2']", resAddr2);
		return this;
	}
	
	public RegistrationPage enterResAddress3(String resAddr3) {
		enterByXpath("//input[@id='resAddress3']", resAddr3);
		return this;
	}
	
	public RegistrationPage enterResPincode(String resPinCode) {
		enterByXpath("//input[@name='resPinCode']", resPinCode);
		return this;
	}
	
	public RegistrationPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public RegistrationPage selResCity(String resCity) {
		selectVisibileTextXPath("//select[@formcontrolname='resCity']", resCity);
		return this;
	}
	
	
	public RegistrationPage selResPostOffice(String resPO) {
		selectVisibileTextXPath("//select[@formcontrolname='resPostOff']", resPO);
		return this;
	}
	
	public RegistrationPage enterResPhone(String Phone) {
		enterByXpath("//input[@id='resPhone']", Phone);
		return this;
	}
	
	public RegistrationPage copyAddr() {
		clickByXpath("//label[text()='No']");
		return this;
	}
	
	public RegistrationPage enterOfzAddress1(String ofzAddr1) {
		enterByXpath("//input[@id='offAddress1']", ofzAddr1);
		return this;
	}
	
	public RegistrationPage enterOfzAddress2(String ofzAddr2) {
		enterByXpath("//input[@id='offAddress2']",ofzAddr2);
		return this;
	}
	
	public RegistrationPage enterOfzAddress3(String ofzAddr3) {
		enterByXpath("//input[@id='offAddress3']", ofzAddr3);
		return this;
	}
	
	public RegistrationPage clickCountry() {
		clickByXpath("//p-dropdown[@formcontrolname='offCountry']");
		return this;
	}
	
	public RegistrationPage selOfzCountry(String ofzCountry) {
		clickByXpath("//li[@aria-label='"+ofzCountry+"']");
		return this;
	}
	
	public RegistrationPage enterOfzPincode(String ofzPincode) {
		enterByXpath("//input[@name='offPinCode']", ofzPincode);
		return this;
	}
	
	public RegistrationPage enterOfzState(String ofzState) {
		enterByXpath("//input[@name='offState']", ofzState);
		return this;
	}
	
	public RegistrationPage enterOfzCity(String ofzCity) {
		enterByXpath("//input[@name='offCity']", ofzCity);
		return this;
	}
	
	public RegistrationPage enterOfzPostOffice(String ofzPO) {
		enterByXpath("//input[@name='offPostOff']", ofzPO);
		return this;
	}
	
	public RegistrationPage enterOfzPhone(String ofzPhone) {
		enterByXpath("//input[@name='offPhone']", ofzPhone);
		return this;
	}
	
	
	
	
}
