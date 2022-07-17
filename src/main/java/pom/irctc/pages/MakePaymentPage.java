package pom.irctc.pages;

import wrappers.GenericWrappers;

public class MakePaymentPage extends GenericWrappers{
	
	
	public MakePaymentPage clickTerms() {
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	public OTPPage clickOnMakePayment() {
		clickByXpath("//button[text()='Make Payment']");
		return new OTPPage();
	}
	
	public MakePaymentPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public MakePaymentPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}

}
