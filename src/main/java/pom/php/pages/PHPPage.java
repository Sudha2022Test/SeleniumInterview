package pom.php.pages;


import wrappers.GenericWrappers;

public class PHPPage extends GenericWrappers {
	
	public PHPRegistrationPage clickOnCreateAcct() {
		clickByXpath("//a[text()='Create account']");
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage waitForPageLoad(long time) {
		waitProperty(time);
		return new PHPRegistrationPage();
	}
	

}
