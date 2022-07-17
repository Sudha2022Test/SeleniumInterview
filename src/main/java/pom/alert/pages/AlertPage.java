package pom.alert.pages;


import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers {
	
	public AlertPage switchFrame() {
		switchtoFrameByXpath("//iframe[@id='iframeResult']");
		return this;
	}
	
	public AlertPage clickOnTryIt() {
		clickByXpath("//button[@onclick='myFunction()']");
		return this;
	}
	
	public AlertPage alertText() {
		getAlertText();	
		return this;
	}
	
	public AlertPage clickOnAcceptAlert() {
		acceptAlert();
		return this;
	}
	
	public AlertPage getPageAlertText() {
		getTextByXpath("//p[@id='demo']");
		return this;
	}
	
	public AlertPage verifyCnfrmOkAlertText(String cnfrmOk) {
		verifyTextByXpath("//p[@id='demo']", cnfrmOk);
		return this;
	}
	
	public AlertPage verifyCnfrmCancelAlertText(String cnfrmCancel) {
		verifyTextByXpath("//p[@id='demo']", cnfrmCancel);
		return this;
	}
	
	public AlertPage verifyPromptOkAlertText(String promptOk) {
		verifyTextByXpath("//p[@id='demo']", promptOk);
		return this;
	}
	
	public AlertPage verifyPromptCancelAlertText(String promptCancel) {
		verifyTextByXpath("//p[@id='demo']", promptCancel);
		return this;
	}
	
	public AlertPage enterPromptAlertText(String prmptAlertText) {
		enterAlertText(prmptAlertText);
		return this;
	}
	
	public AlertPage pageRefresh() {
		refresh();
		return this;
	}
	
	public AlertPage clickOnDismissAlert() {
		dismissAlert();
		return this;
		}
	
	public AlertPage mainContent() {
		defaultContent();
		return this;
	}
	
	public AlertPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public W3HomePage clickHome() {
		clickByXpath("//a[@id='tryhome']");
		return new W3HomePage();
	}
	
}
