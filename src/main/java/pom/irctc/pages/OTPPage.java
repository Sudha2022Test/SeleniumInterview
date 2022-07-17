package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OTPPage extends GenericWrappers{
	
	public OTPPage clickOnVerify() {
		clickByXpath("//button[text()='Verify']");
		return this;
	}
	
	public OTPPage verifyOtpMessage(String otpMessage) {
		verifyTextByXpath("//span[text()='otp is required.']", otpMessage);
		return this;
	}
	
	public OTPPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public OTPPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}


}
