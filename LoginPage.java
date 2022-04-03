package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class LoginPage  extends ProjectSpecificMethods {
			public LoginPage(RemoteWebDriver driver) {
				this.driver = driver;
			}
			
			//2.Dynamic data we passing from ReadExcel sheet and project specific methods
			//1.Without using username directly give value that is called static "Demosaleamanager"
			//3. return this page has two option
			 // 3.1 it should be in same page or it navigate another page
			//4. LoginPage lpage = new LoginPage();
			//return new LoginPage();
			//.5. Now we need to create  a new testcase for create lead,@Beforetest,@Test.
			
			public LoginPage enterUserName(String username) {
				driver.findElement(By.id("username")).sendKeys(username);
				return this;
				
			}
			
			public LoginPage enterPassword(String pwd) {
				driver.findElement(By.id("password")).sendKeys(pwd);
				return this;
			}

			public WelcomePage clickLoginButton_positive() {
				driver.findElement(By.className("decorativeSubmit")).click();
				return new WelcomePage(driver);
			}

			public LoginPage clickLoginButton_negative() {
				driver.findElement(By.className("decorativeSubmit")).click();
				return this;
			}
}
