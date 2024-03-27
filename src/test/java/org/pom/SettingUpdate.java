package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class SettingUpdate extends BaseClass{

	public SettingUpdate () {
		PageFactory.initElements(driver, this);	
	}
	

	
	@FindBy(xpath = "//span[text()='Settings']//..//..//li//span[text()='UPDATE']")
	public WebElement settingUpdate;
	
	
	@FindBy(xpath = "//span[text()='Settings']//..//..//li//span[text()='Employee']")
	public WebElement EmployeeMod;
	
	
	public WebElement getSettingUpdate() {
		return settingUpdate;
	}
	public WebElement getEmployeeMod() {
		return EmployeeMod;
	}

	
	
	
	
	
	
	
	
	
}
