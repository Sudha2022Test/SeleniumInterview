package pom.panappln.testcases;

import pom.panappln.pages.PANPage;

public class TC008 {
	
	public void PANApplication() {
		
		new PANPage()
		.selectName("MRS.")
		.enterFName("Sudha")
		.enterMName("S")
		.enterLName("Sethuraman")
		.enterFatherFName("Sethuraman")
		.enterFatherMName("V")
		.enterFatherLName("Vaidyanathan")
		.enterMobile("7824010991")
		.enterEmail("sudhasthrmn2@gmail.com")
		.selectIncome("Salary")
		.clickCommunication()
		.enterDOB("16081986")
		.enterResAdr1("Munusamy Street")
		.enterResAdr2("Sathish Builders")
		.enterResCity("Chennai")
		.selectResState("Tamil Nadu")
		.enterResPincode("600044")
		.selectResCountry("INDIA")
		.enterOfficeName("OPSERA")
		.enterOfzAdr1("Perungudi")
		.enterOfzAdr2("Indiqube")
		.enterOfzCity("Chennai")
		.selectOfzState("Tamil Nadu")
		.enterOfzPincode("600015")
		.selectOfzCountry("INDIA")
		.selectIDProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAddrProof("PASSPORT (In Copy)")
		.selectDOBProof("Driving License (In Copy)")
		.selectAadharProof("Copy of Aadhaar Card / Letter")
		.selectOfzAddrProof("Employer Certificate carrying Office Address")
		.clickSource()
		.closeBrowser();
				
		
		
	}

}
