package pom.fb.pages;

import wrappers.GenericWrappers;

public class CreateFBSignUpPage extends GenericWrappers {
	
	public CreateFBSignUpPage enterFirstName(String fName) {
		enterByXpath(prop.getProperty("CreateFBSignUpPage.FirstName.XPath"), fName);
		return this;
	}
	
	public CreateFBSignUpPage enterLastName(String lName) {
		enterByXpath(prop.getProperty("CreateFBSignUpPage.LastName.XPath"), lName);
		return this;
	}
	
	public CreateFBSignUpPage enterEMail(String email) {
		enterByXpath("//input[@name='reg_email__']", email);
		return this;
	}
	
	public CreateFBSignUpPage entercnfrmEmail(String cnfrmEmail) {
		enterByXpath("//input[@name='reg_email_confirmation__']", cnfrmEmail);
		return this;
	}
	
	public CreateFBSignUpPage enterPassword(String password) {
		enterByXpath("//input[@name='reg_passwd__']", password);
		return this;
	}
	
	public CreateFBSignUpPage selectDay(String day) {
		selectVisibileTextXPath("//select[@name='birthday_day']", day);
		return this;
	}
	
	public CreateFBSignUpPage selectMonth(String month) {
		selectVisibileTextXPath("//select[@name='birthday_month']", month);
		return this;
	}
	
	public CreateFBSignUpPage selectYear(String year) {
		selectVisibileTextXPath("//select[@name='birthday_year']", year);
		return this;
	}
	
	public CreateFBSignUpPage clickOnGender(String gender) {
		clickByXpath("//label[text()='"+gender+"']/following-sibling::input");
		return this;
	}
	

}
