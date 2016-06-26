package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers{
	
	public HomePage(){
		
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			Reporter.reportStep("This is not the Home Page", "FAIL");
		}
		
	}
		
	public LoginPage clickLogOut(){
		clickByClassName("decorativeSubmit");
		return new LoginPage();
		
	}
	
	public HomePage verifyWelcomeMsg(String text){
		verifyTextContainsByXpath("//*[@id='form']/h2", text);
		return this;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





















