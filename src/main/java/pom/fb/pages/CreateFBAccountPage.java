package pom.fb.pages;

import wrappers.GenericWrappers;

public class CreateFBAccountPage extends GenericWrappers{
	
	public CreateFBSignUpPage clickOnCreateAcct() {
		System.out.println(prop.getProperty("CreateFBAccountPage.CreateAccount.XPath"));
		clickByXpath(prop.getProperty("CreateFBAccountPage.CreateAccount.XPath"));
		return new CreateFBSignUpPage();
	}
	
	public CreateFBSignUpPage waitForPageLoad(long time) {
		waitProperty(time);
		return new CreateFBSignUpPage();
	}
	
}
