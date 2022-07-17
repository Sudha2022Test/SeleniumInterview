package pom.panappln.pages;

import wrappers.GenericWrappers;

public class PANPage extends GenericWrappers{
	
	public PANPage selectName(String title) {
		selectVisibileTextXPath("//select[@name='pan_title']", title);
		return this;
		}
	
	public PANPage enterFName(String fName) {
		enterByXpath("//input[@name='pan_firstname']", fName);
		return this;
		}
	
	public PANPage enterMName(String mName) {
		enterByXpath("//input[@name='pan_middlename']", mName);
		return this;
		}

	public PANPage enterLName(String lName) {
		enterByXpath("//input[@name='pan_lastname']", lName);
		return this;
		}
	
	public PANPage enterFatherFName(String fatherFName) {
		enterByXpath("//input[@name='pan_fatherfirstname']", fatherFName);
		return this;
		}
	
	public PANPage enterFatherMName(String fatherMName) {
		enterByXpath("//input[@name='pan_fathermiddlename']", fatherMName);
		return this;
		}

	public PANPage enterFatherLName(String fatherLName) {
		enterByXpath("//input[@name='pan_fatherlastname']", fatherLName);
		return this;
		}
	
	public PANPage enterMobile(String mobile) {
		enterByXpath("//input[@name='pan_mobilenumber']", mobile);
		return this;
		}

	public PANPage enterEmail(String email) {
		enterByXpath("//input[@name='pan_email']", email);
		return this;
		}
	
	public PANPage selectIncome(String income) {
		selectVisibileTextXPath("//select[@name='pan_sourceofincome']", income);
		return this;
		}
	
	public PANPage clickCommunication() {
		clickByXpath("//input[@id='office']");
		return this;
		}
	
	public PANPage enterDOB(String DOB) {
		enterByXpath("//input[@id='pan_dob']", DOB);
		return this;
		}
	
	public PANPage enterResAdr1(String resAddr1) {
		enterByXpath("//input[@id='pan_addressline1']", resAddr1);
		return this;
		}
	
	public PANPage enterResAdr2(String resAddr2) {
		enterByXpath("//input[@id='pan_addressline2']", resAddr2);
		return this;
		}

	public PANPage enterResCity(String resAddr3) {
		enterByXpath("//input[@id='pan_cityname']", resAddr3);
		return this;
		}
	
	public PANPage selectResState(String resState) {
		selectVisibileTextXPath("//select[@id='pan_state']", resState);
		return this;
		}
	
	public PANPage enterResPincode(String resPincode) {
		enterByXpath("//input[@id='pan_pincode']", resPincode);
		return this;
		}
	
	public PANPage selectResCountry(String resCountry) {
		selectVisibileTextXPath("//select[@id='pan_country']", resCountry);
		return this;
		}
	
	public PANPage enterOfficeName(String ofzName) {
		enterByXpath("//input[@id='pan_officename']", ofzName);
		return this;
		}
	
	public PANPage enterOfzAdr1(String ofzAdr1) {
		enterByXpath("//input[@id='pan_officeaddressline1']", ofzAdr1);
		return this;
		}
	
	public PANPage enterOfzAdr2(String ofzAdr2) {
		enterByXpath("//input[@id='pan_officeaddressline2']", ofzAdr2);
		return this;
		}

	public PANPage enterOfzCity(String ofzCity) {
		enterByXpath("//input[@id='pan_officecityname']", ofzCity);
		return this;
		}
	
	public PANPage selectOfzState(String ofzState) {
		selectVisibileTextXPath("//select[@id='pan_officestate']", ofzState);
		return this;
		}
	
	public PANPage enterOfzPincode(String ofzPinCode) {
		enterByXpath("//input[@id='pan_officepincode']", ofzPinCode);
		return this;
		}
	
	public PANPage selectOfzCountry(String ofzCountry) {
		selectVisibileTextXPath("//select[@id='pan_officecountry']", ofzCountry);
		return this;
		}
	
	public PANPage selectIDProof(String IDProof) {
		selectVisibileTextXPath("//select[@id='pan_identityproof']", IDProof);
		return this;
		}
	
	public PANPage selectAddrProof(String AddrProof) {
		selectVisibileTextXPath("//select[@id='pan_addressproof']", AddrProof);
		return this;
		}
	
	public PANPage selectDOBProof(String DOBProof) {
		selectVisibileTextXPath("//select[@id='pan_DOBproof']", DOBProof);
		return this;
		}
	
	public PANPage selectAadharProof(String AadharProof) {
		selectVisibileTextXPath("//select[@id='pan_aadhaarproof']", AadharProof);
		return this;
		}
	
	public PANPage selectOfzAddrProof(String ofzAddrProof) {
		selectVisibileTextXPath("//select[@id='pan_officeaddressproof']", ofzAddrProof);
		return this;
		}
	
	public PANPage clickSource() {
		clickByXpath("//input[@id='pan_source']");
		return this;
		}
	
	
	

}
