package pom.irctc.pages;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers {
	
	public EnquiryFormPage enterName(String name) {
		enterByXpath("//input[@name='name']", name);
		return this;
	}
	
	public EnquiryFormPage enterOrganisation(String organisation) {
		enterByXpath("//input[@name='organization']", organisation);
		return this;
	}

	public EnquiryFormPage enterAddress(String address) {
		enterByXpath("//input[@name='address']", address);
		return this;
	}

	public EnquiryFormPage enterMobile(String mobile) {
		enterByXpath("//input[@name='mobile']", mobile);
		return this;
	}

	public EnquiryFormPage enterEmail(String email) {
		enterByXpath("//input[@name='email']", email);
		return this;
	}
	
	public EnquiryFormPage selReq(String request) {
		selectVisibileTextXPath("//select[@name='requestFor']", request);
		return this;
	}
	
	public EnquiryFormPage enterSource(String source) {
		enterByXpath("//input[@name='originStation']", source);
		return this;
	}
	
	public EnquiryFormPage enterDest(String destination) {
		enterByXpath("//input[@name='destnStation']", destination);
		return this;
	}
	
	public EnquiryFormPage clickCheckInDate() {
		clickByXpath("//input[@name='checkInDate']");
		return this;
	}
	
	public EnquiryFormPage selCheckInDate(String srcDate) {
		clickByXpath("//span[text()='"+srcDate+"']");
		return this;
	}
	
	public EnquiryFormPage clickCheckOutDate() {
		clickByXpath("//input[@name='checkOutDate']");
		return this;
	}
	
	public EnquiryFormPage selCheckOutDate(String destDate) {
		clickByXpath("(//span[text()='"+destDate+"'])[2]");
		return this;
	}
	
	public EnquiryFormPage enterDays(String days) {
		enterByXpath("//input[@name='durationPeriod']", days);
		return this;
	}
	
	public EnquiryFormPage enterCoachType(String coach) {
		enterByXpath("//input[@name='coachDetails']", coach);
		return this;
	}

	public EnquiryFormPage enterNoPassenger(String passengers) {
		enterByXpath("//input[@name='numPassenger']", passengers);
		return this;
	}

	public EnquiryFormPage enterPurpose(String purpose) {
		enterByXpath("//textarea[@name='charterPurpose']", purpose);
		return this;
	}

	public EnquiryFormPage enterServices(String service) {
		enterByXpath("//textarea[@name='services']", service);
		return this;
	}	
	
	public EnquiryFormPage clickSubmit() {
		clickByXpath("//button[@type='Submit']");
		return this;
	}

	public EnquiryFormPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}
	
	public EnquiryFormPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}

}
