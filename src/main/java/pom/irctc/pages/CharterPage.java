package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public EnquiryFormPage clickOnEnquiryForm() {
		clickByXpath("//a[text()='Enquiry Form']");
		return new EnquiryFormPage();
	}
	
	public CharterPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}
	
	public CharterPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
}
