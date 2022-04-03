package com.leaftaps.ui.test;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.LoginPage;

import base.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData(){
		excelfilepath = "./testdata/createLeadPOM.xlsx";	
	
	}
	
	@Test(dataProvider="CreateLeadData")
	public void tc001(String username,String pwd,String cname,String fname,String lname) {
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassword(pwd)
		.clickLoginButton_positive()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeadPage()
		.entercompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLeadButton()
		.verifyViewLeadID();
		
		//in First time it run without driver so we use project specific methods - public static RemoteWebDriver driver;  
		//@Test - before projects driver is in @Test but here no driver inside in tc001 . so we use static keyword in PSM()
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * LoginPage page = new LoginPage(); LoginPage enterUsername =
		 * page.enterUsername(username); LoginPage enterPassword =
		 * page.enterPassword(password); WelcomePage clickLoginButton_positive =
		 * page.clickLoginButton_positive();
		 * 
		 * WelcomePage page1 = new WelcomePage(); page1.clickCRMSFA();
		 */
	}
	
}
