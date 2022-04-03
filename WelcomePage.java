package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
		public WelcomePage(RemoteWebDriver driver) {
			this.driver = driver;
			
		}
		
		public HomePage clickCRMSFA(){
			driver.findElement(By.linkText("CRM/SFA")).click();	
			return new HomePage(driver);
		}
}
