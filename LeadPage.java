package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class LeadPage extends ProjectSpecificMethods{
		public LeadPage(RemoteWebDriver driver) {
			this.driver =driver;
		}
		
		public CreateLeadPage clickCreateLeadPage() {
			driver.findElement(By.linkText("Create Lead")).click();
			return new CreateLeadPage(driver);
		}
}
