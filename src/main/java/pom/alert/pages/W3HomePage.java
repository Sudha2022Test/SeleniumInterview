package pom.alert.pages;

import wrappers.GenericWrappers;

public class W3HomePage extends GenericWrappers{
	
	public W3HomePage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}

}
