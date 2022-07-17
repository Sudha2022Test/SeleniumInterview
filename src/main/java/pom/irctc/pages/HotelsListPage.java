package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsListPage extends GenericWrappers {
	
	public HotelsListPage getHotelName() {
		getTextByXpath("(//div[@class='mid-searchpack']//child::h5)[1]");
		return this;
	}
	
	public HotelsListPage getHotelPrice() {
		getTextByXpath("(//div[@class='right-searchpack']//child::strong)[1]");
		return this;
	}
	
	public SelectedHotelPage clickOnFirstHotel() {
		clickByXpath("(//div[@class='col-12 col-md-6'])[1]");
		return new SelectedHotelPage();
	}
	
	public HotelsListPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}

	public HotelsListPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}
}
