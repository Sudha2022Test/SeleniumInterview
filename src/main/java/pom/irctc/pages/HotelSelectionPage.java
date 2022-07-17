package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelSelectionPage extends GenericWrappers {
	
	public HotelSelectionPage enterCity(String city) {
		enterByXpath("//input[@placeholder='Enter City or Hotel Name']", city);
		return this;
	}
	
	public HotelSelectionPage clickCity() {
		clickByXpath("//label[text()='Telangana']/parent::*");
		return this;
	}
	
	public HotelSelectionPage clickCheckInCalendar() {
		clickByXpath("(//div[@class='form-in-custom width-13'])[1]");
		return this;
	}
	
	public HotelSelectionPage clickCheckInDateMenu() {
		clickByXpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]");
		return this;
	}
	
	public HotelSelectionPage clickCheckInYear(String year) {
		clickByXpath("//span[text()='"+year+"']");
		return this;
	}
	
	public HotelSelectionPage clickCheckInMonth(String month) {
		clickByXpath("//span[text()='"+month+"']");
		return this;
	}
	
	public HotelSelectionPage clickCheckInDay(String day) {
		clickByXpath("//span[text()='"+day+"']");
		return this;
	}
	
	public HotelSelectionPage clickCheckOutCalendar() {
		clickByXpath("(//div[@class='form-in-custom width-13'])[2]");
		return this;
	}
	
	public HotelSelectionPage clickCheckOutDateMenu() {
		clickByXpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]");
		return this;
	}
	
	public HotelSelectionPage clickCheckOutYear(String year) {
		clickByXpath("//span[text()='"+year+"']");
		return this;
	}
	
	public HotelSelectionPage clickCheckOutMonth(String month) {
		clickByXpath("//span[text()='"+month+"']");
		return this;
	}
	
	public HotelSelectionPage clickCheckOutDay(String day) {
		clickByXpath("//span[text()='"+day+"']");
		return this;
	}
	
	public HotelSelectionPage clickGuest() {
		clickByXpath("//input[@name='guest']");
		return this;
	}
	
	public HotelSelectionPage selectAdult(String adult) {
		selectVisibileTextXPath("//select[@name='hotelAdult']", adult);
		return this;
	}
	
	public HotelSelectionPage clickDone() {
		clickByXpath("//button[text()='Done']");
		return this;
	}

	public HotelsListPage clickOnFindHotel() {
		clickByXpath("//button[@class='btn btn-md yellow-gradient home-btn']");
		return new HotelsListPage();
	}
	
	public HotelSelectionPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public HotelSelectionPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}
	
	public HotelSelectionPage scrollPageDown() {
		pageDown();
		return this;
	}
	

}
