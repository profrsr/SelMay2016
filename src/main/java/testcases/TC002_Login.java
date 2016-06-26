package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.OpentapsWrappers;

public class TC002_Login extends OpentapsWrappers{

	@BeforeClass
	public void setData(){
		testCaseName = "TC002 - Login (Negative)";
		testDescription = "Login to OpenTaps(Negative)";
		browserName = "chrome";
		dataSheetName = "TC002";

	}

	@Test(dataProvider="fetchData")
	public void loginSuccess(String userName, String password, String text){

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginForFailure()
		.verifyErrorMsg(text);
	}
}




















