package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FormCPage extends GenericWrappers{

	public FormCRegistrationPage clickOnSignUpReg() {
		clickByXpath("//a[text()='Sign Up (Registration)']");
		return new FormCRegistrationPage();
	}
	
	public FormCRegistrationPage waitForPageLoad(long time) {
		waitProperty(time);
		return new FormCRegistrationPage();
	}
	
}
