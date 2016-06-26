package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LoginPage extends OpentapsWrappers{

	public LoginPage(){

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			Reporter.reportStep("This is not the Login Page", "FAIL");
		}

	}

	public LoginPage enterUserName(String data){
		enterById("username", data);
		return this;

	}

	public LoginPage enterPassword(String data){
		enterById("password", data);
		return this;

	}

	public HomePage clickLoginForSuccess(){
		clickByClassName("decorativeSubmit");
		return new HomePage();
	}
	
	public LoginPage clickLoginForFailure(){
		clickByClassName("decorativeSubmit");
		return this;
	}

	public LoginPage verifyErrorMsg(String text){
		verifyTextContainsById("errorDiv", text);
		return this;

	}


























}





















