package pom.irctc.pages;

import wrappers.GenericWrappers;

public class MenuPage extends GenericWrappers{
	
	public FTRPage clickOnBookYourCoach() {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new FTRPage();
		
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath("//a[text()='Charter']");
		return new CharterPage();
	}
	
	
	public MenuPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}

}
