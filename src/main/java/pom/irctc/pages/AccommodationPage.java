package pom.irctc.pages;


import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public MenuPage clickMenu() {
		clickByXpath("//a[@id='sidebarCollapse']");
		return new MenuPage();
	}
	
	
	public AccommodationPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	
	public HotelsPage clickOnHotels() {
		clickByXpath("//a[@href='https://www.hotel.irctctourism.com/']//child::img");
		return new HotelsPage();
	}
	

	public AccommodationPage currentWindowNavigation() {
		switchToLastWindow();
		return this;
	}
}
