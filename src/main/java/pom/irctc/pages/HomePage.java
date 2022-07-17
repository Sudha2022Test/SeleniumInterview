package pom.irctc.pages;

import wrappers.GenericWrappers;


public class HomePage extends GenericWrappers {
	
	public RegistrationPage clickOnRegister() {
		clickByXpath("//a[text()=' REGISTER ']");
		return new RegistrationPage();
	}

	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXPath("//a[text()=' HOLIDAYS ']");
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXPath("//span[text()='Stays']");
		return this;
	}
	
	
	public AccommodationPage clickOnLounge() {
		clickByXpath("//span[text()='Lounge']");
		return new AccommodationPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
