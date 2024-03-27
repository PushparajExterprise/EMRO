package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Dashboard extends BaseClass {
	
	public Dashboard () {
		PageFactory.initElements(driver, this);	
	}
	
	
//	@FindBy(xpath = "//input[contains(@id,'mainForm:j_idt4')]")
	@FindBy(xpath = "//label[contains(text(),'User')]//..//..//following-sibling::div//input")
	public WebElement username;
	
//	@FindBy(xpath = "//input[contains(@id,'mainForm:j_idt91')]")
	@FindBy(xpath = "//label[contains(text(),'Password')]//..//input")
	public WebElement password;
	
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	public WebElement submit;
	
	@FindBy(xpath = "//ul[@id='mainForm:cmenu']//span[text()='Modules']")
	public WebElement modules;
	
	@FindBy(xpath = "//span[text()='Engineering']")
	public WebElement engineering;
	
	@FindBy(xpath = "//img[@class='loadingGif']")
	public WebElement loadingSpinner;
	
	@FindBy(xpath = "//span[text()='Settings']")
	public WebElement settingMod;

	@FindBy(xpath = "//span[text()='System Administration']")
	public WebElement systemAdmin;
	
	@FindBy(xpath = "//span[text()='System Administration']//..//..//li//span[text()='UPDATE']")
	public WebElement systemAdminUpdate;
	
	@FindBy(xpath = "//span[text()='System Administration']//..//..//li//span[text()='EXPLORER']")
	public WebElement systemAdminExplorer;
	
	@FindBy(xpath = "//span[text()='System Administration']//..//..//li//span[text()='Security Explorer']")
	public WebElement systemAdminSecurityExplorerMod;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	public WebElement logOut;
	
	public WebElement getSystemAdminExplorer() {
		return systemAdminExplorer;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getSystemAdminSecurityExplorerMod() {
		return systemAdminSecurityExplorerMod;
	}

	public WebElement getSystemAdminUpdate() {
		return systemAdminUpdate;
	}

	public WebElement getSystemAdmin() {
		return systemAdmin;
	}
	
	public WebElement getSettingMod() {
		return settingMod;
	}


	public WebElement getUsername() {
		return username;
	}

	public WebElement getLoadingSpinner() {
		return loadingSpinner;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getModules() {
		return modules;
	}
	public WebElement getEngineering() {
	
		return engineering;
	}


	
	

	
	
	
	
	

}
