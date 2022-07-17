package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers{
	
	public LoginPage clickOnLogin() {
		clickByXpath("//a[text()='Login']");
		return new LoginPage();
	}
	
	public HotelsPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public HotelsPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}

}
