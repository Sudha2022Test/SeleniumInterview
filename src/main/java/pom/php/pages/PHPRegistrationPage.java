package pom.php.pages;

import wrappers.GenericWrappers;

public class PHPRegistrationPage extends GenericWrappers {
	
	public PHPRegistrationPage enterFirstName(String fName) {
		enterByXpath("//input[@id='inputFirstName']", fName);
		return this;
	}
	
	public PHPRegistrationPage enterLastName(String lName) {
		enterByXpath("//input[@id='inputLastName']", lName);
		return this;
	}

	public PHPRegistrationPage enterEmail(String email) {
		enterByXpath("//input[@id='inputEmail']", email);
		return this;
	}

	public PHPRegistrationPage enterPhoneNum(String phone) {
		enterByXpath("//input[@id='inputPhone']", phone);
		return this;
	}
	
	public PHPRegistrationPage enterCompanyName(String company) {
		enterByXpath("//input[@id='inputCompanyName']", company);
		return this;
	}
	
	public PHPRegistrationPage enterAddress1(String addr1) {
		enterByXpath("//input[@id='inputAddress1']", addr1);
		return this;
	}
	
	public PHPRegistrationPage enterAddress2(String addr2) {
		enterByXpath("//input[@id='inputAddress2']", addr2);
		return this;
	}
	
	public PHPRegistrationPage enterCity(String city) {
		enterByXpath("//input[@id='inputCity']",city);
		return this;
	}
	
	public PHPRegistrationPage enterState(String state) {
		enterByXpath("//input[@id='stateinput']", state);
		return this;
	}
	
	public PHPRegistrationPage enterPostalCode(String pincode) {
		enterByXpath("//input[@id='inputPostcode']", pincode);
		return this;
	}
	
	public PHPRegistrationPage entercustomField(String mobile) {
		enterByXpath("//input[@id='customfield2']", mobile);
		return this;
	}
	
	public PHPRegistrationPage enterPassword(String pswd) {
		enterByXpath("//input[@id='inputNewPassword1']", pswd);
		return this;
	}
	
	public PHPRegistrationPage entercnfrmPassword(String cnfrmPswd) {
		enterByXpath("//input[@id='inputNewPassword2']", cnfrmPswd);
		return this;
	}
	
	public PHPRegistrationPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	

}
