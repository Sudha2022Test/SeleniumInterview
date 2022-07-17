package pom.irctc.pages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers{
	
	public LoginPage clickOnGuestLogin() {
		clickByXpath("//a[text()='Guest User Login ']");
		return this;
	}

	public LoginPage enterEmail(String email) {
		enterByXpath("//input[@name='email']", email);
		return this;
	}
	
	public LoginPage enterMobile(String mobile) {
		enterByXpath("//input[@name='mobileNo']", mobile);
		return this;
	}
	
	public HotelSelectionPage clickOnLogin2() {
		clickByXpath("(//button[text()='Login'])[2]");
		return new HotelSelectionPage();
	}
	
	public LoginPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public LoginPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}

	
}
