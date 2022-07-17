package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FormCRegistrationPage extends GenericWrappers{
	
	public FormCRegistrationPage enterUserId(String uID) {
		enterByXpath("//input[@name='u_id']", uID);
		return this;
	}
	
	public FormCRegistrationPage enterUserPswd(String pswd) {
		enterByXpath("//input[@name='u_pwd']", pswd);
		return this;
	}
	
	public FormCRegistrationPage enterUserCnfPswd(String cnfPswd) {
		enterByXpath("//input[@name='u_repwd']", cnfPswd);
		return this;
	}
	
	public FormCRegistrationPage selSecQues(String secQues) {
		selectVisibileTextXPath("//select[@name='u_secques']", secQues);
		return this;
	}
	
	public FormCRegistrationPage enterSecAns(String secAns) {
		enterByXpath("//input[@name='u_secans']", secAns);
		return this;
	}
	
	public FormCRegistrationPage enterName(String name) {
		enterByXpath("//input[@name='u_name']", name);
		return this;
	}
	
	public FormCRegistrationPage selGender(String gender) {
		selectVisibileTextXPath("//select[@name='u_gender']", gender);
		return this;
	}
	
	public FormCRegistrationPage enterDOB(String DOB) {
		enterByXpath("//input[@name='u_dob']", DOB);
		return this;
	}
	
	public FormCRegistrationPage enterDesignation(String Designation) {
		enterByXpath("//input[@name='u_designation']", Designation);
		return this;
	}
	
	public FormCRegistrationPage enterEmailId(String emailID) {
		enterByXpath("//input[@name='u_emailid']", emailID);
		return this;
	}
	
	public FormCRegistrationPage enterMobile(String mob) {
		enterByXpath("//input[@name='u_mobile']", mob);
		return this;
	}
	
	public FormCRegistrationPage enterPhoneNumber(String phone) {
		enterByXpath("//input[@name='u_phone']", phone);
		return this;
	}
	
	public FormCRegistrationPage selNationality(String nationality) {
		selectVisibileTextXPath("//select[@name='u_nationality']", nationality);
		return this;
	}
	
	public FormCRegistrationPage enterHotelName(String hotelName) {
		enterByXpath("//input[@id='name']", hotelName);
		return this;
	}
	
	public FormCRegistrationPage enterCapacity(String capacity) {
		enterByXpath("//input[@id='capacity']", capacity);
		return this;
	}
	
	public FormCRegistrationPage enterHotelAddress(String hotelAddr) {
		enterByXpath("//textarea[@id='address']", hotelAddr);
		return this;
	}
	
	public FormCRegistrationPage selHotelState(String hotelState) {
		selectVisibileTextXPath("//select[@id='state']", hotelState);
		return this;
	}
	
	public FormCRegistrationPage selHotelCity(String hotelCity) {
		selectVisibileTextXPath("//select[@id='city_distr']", hotelCity);
		return this;
	}
	
	public FormCRegistrationPage selAccoType(String accoType) {
		selectVisibileTextXPath("//select[@id='acco_type']", accoType);
		return this;
	}
	
	public FormCRegistrationPage selAccoGrade(String accoGrade) {
		selectVisibileTextXPath("//select[@id='star_rat']", accoGrade);
		return this;
	}
	
	public FormCRegistrationPage enterHotelEmail(String hotelEmail) {
		enterByXpath("//input[@id='email']", hotelEmail);
		return this;
	}
	
	public FormCRegistrationPage enterHotelMobile(String hotelMobile) {
		enterByXpath("//input[@id='mcontact']", hotelMobile);
		return this;
	}
	
	public FormCRegistrationPage enterHotelPhone(String hotelPhone) {
		enterByXpath("//input[@id='contact']", hotelPhone);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerName(String ownerName) {
		enterByXpath("//input[@name='name_o']", ownerName);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerAddress(String ownerAddress) {
		enterByXpath("//input[@name='address_o']", ownerAddress);
		return this;
	}
	
	public FormCRegistrationPage selOwnerState(String ownerState) {
		selectVisibileTextXPath("//select[@id='state_o']", ownerState);
		return this;
	}
	
	public FormCRegistrationPage selOwnerCity(String ownerCity) {
		selectVisibileTextXPath("//select[@id='citydistr_o']", ownerCity);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerEmail(String ownerEmail) {
		enterByXpath("//input[@name='emailid_o']", ownerEmail);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerPhone(String ownerPhone) {
		enterByXpath("//input[@name='phoneno_o']", ownerPhone);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerMobile(String ownerMobile) {
		enterByXpath("//input[@name='mobile_o']", ownerMobile);
		return this;
	}
	
	public FormCRegistrationPage waitForPageLoad(long time) {
		waitProperty(time);
		return new FormCRegistrationPage();
	}
	

}
