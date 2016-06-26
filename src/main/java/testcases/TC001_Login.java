package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.OpentapsWrappers;

public class TC001_Login extends OpentapsWrappers{
	
	@BeforeClass
	public void setData(){
		testCaseName = "TC001-login";
		testDescription = "login to OpenTaps(Positive)";
		browserName = "chrome";
		dataSheetName = "TC001";
		
	}

	@Test(dataProvider="fetchData")
	public void loginSuccess(String userName, String password, String text){
		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginForSuccess()
		.verifyWelcomeMsg(text)
		.clickLogOut();
		
		
	}
}




















