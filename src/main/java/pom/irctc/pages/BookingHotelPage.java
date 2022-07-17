package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookingHotelPage extends GenericWrappers{
	
	public BookingHotelPage selectTitle(String title) {
		selectVisibileTextXPath("//select[@name='title']", title);
		return this;
	}
	
	public BookingHotelPage enterFName(String fName) {
		enterByXpath("//input[@name='firstName']", fName);
		return this;
	}
	
	public BookingHotelPage enterLName(String lName) {
		enterByXpath("//input[@name='lastName']", lName);
		return this;
	}
	
	public BookingHotelPage selectState(String state) {
		selectVisibileTextXPath("//select[@name='state']", state);
		return this;
	}
	
	public BookingHotelPage selGST(String gst) {
		selectVisibileTextXPath("//select[@name='gst']", gst);
		return this;
	}
	
	public BookingHotelPage enterCompanyName(String companyName) {
		enterByXpath("//input[@name='companyName']", companyName);
		return this;
	}
	
	public BookingHotelPage enterCompanyAddress(String companyAddress) {
		enterByXpath("//input[@name='companyAddress']", companyAddress);
		return this;
	}
	
	public BookingHotelPage clickOnContinueNew() {
		clickByXpath("//button[text()='Continue']");
		return this;
	}
	
	public BookingHotelPage verifyGSTMessage(String gstMessage) {
		verifyTextByXpath("//span[text()='gstNumber is required.']", gstMessage);
		return this;
	}
	
	public BookingHotelPage verifyHotelName(String hotelName) {
		verifyTextByXpath("//div[@class='mid-searchpack']//child::h5", hotelName);
		return this;
	}
	
	public BookingHotelPage verifyHotelPrice(String hotelPrice) {
		verifyTextByXpath("//div[@class='faredetails-in faredetails-in-total']//child::strong", hotelPrice);
		return this;
	}
	
	
	public MakePaymentPage clickOnContinue() {
		clickByXpath("//button[text()='Continue']");
		return new MakePaymentPage();
	}
	
	public BookingHotelPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}

	public BookingHotelPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}

}
