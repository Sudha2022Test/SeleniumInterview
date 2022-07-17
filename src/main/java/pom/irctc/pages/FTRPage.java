package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRPage extends GenericWrappers{
	

	public FTRRegistrationPage clickOnNewUser() {
		clickByXpath("//a[text()='New User? Signup']");
		return new FTRRegistrationPage();
	}	
	
	public FTRPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public FTRPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}
	
}
