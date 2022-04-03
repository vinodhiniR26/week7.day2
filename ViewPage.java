package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class ViewPage extends ProjectSpecificMethods{
		public ViewPage(RemoteWebDriver driver) {
			this.driver = driver;
		}
		
		public ViewPage  verifyViewLeadID() {
			 String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			 return this;
		}
}
