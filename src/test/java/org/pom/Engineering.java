package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Engineering extends BaseClass {
	public Engineering () {
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//span[text()='Engineering']//..//..//li//span[text()='UPDATE']")
	public WebElement update;
	
	@FindBy(xpath = "//span[text()='Engineering']//..//..//li//span[text()='Engineering Control Shop']")
	public WebElement EngineeringControlShop;
	

	public WebElement getEngineeringControlShop() {
		return EngineeringControlShop;
	}

	public WebElement getUpdate() {
		return update;
	}
	
	
}
