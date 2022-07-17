package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SelectedHotelPage extends GenericWrappers{
	
	public BookingHotelPage clickOnContinueToBook() {
		clickByXpath("//b[text()='Continue to Book']");
		return new BookingHotelPage();
	}
	
	public SelectedHotelPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public SelectedHotelPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}

}
