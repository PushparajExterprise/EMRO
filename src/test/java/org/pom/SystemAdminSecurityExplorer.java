package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class SystemAdminSecurityExplorer extends BaseClass {
	public SystemAdminSecurityExplorer () {
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//span[contains(@class,'toolbar')]//following-sibling::span[text()='New User']")
	public WebElement newUser;
	
	
	@FindBy(xpath = "//label[text()='User']//..//..//following-sibling::div//input")
	public WebElement userInputBox;
	
	@FindBy(xpath = "//label[text()='Password']//..//..//following-sibling::div//input")
	public WebElement passInputBox;
	
	
	@FindBy(xpath = "(//label[text()='Confirm Password']//..//..//following-sibling::div//input)[1]")
	public WebElement confirmPassInputBox;
	
	@FindBy(xpath = "(//label[text()='Employee'])[3]")
	public WebElement EmployeeText;
	
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-8 col-md-4']//input")
	public WebElement EmployeeNameSerachinputBox;
	
	
	@FindBy(xpath = "(//span[text()='Select'])[1]//..//..//button")
	public WebElement EmployeeNameSelectButton;
	
	@FindBy(xpath = "//span[text()='Allow Password Recovery']//..//span[contains(@class,'chkbox-icon')]")
	public WebElement AllowPAsswordRecoveryChkBox;
	
	@FindBy(xpath = "//span[contains(text(),'Allow Wall Password')]//..//span[contains(@class,'chkbox-icon')]")
	public WebElement AllowWallPAsswordChangeChkBox;
	
	@FindBy(xpath = "//span[contains(@class,'toolbar')]//following-sibling::span[text()='Save']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//span[text()='User']/following-sibling::input")
	public WebElement UserNameSearchBox;
	
	@FindBy(xpath = "//td[@role='gridcell']/span[contains(text(),'\"+EmpName+\"')]")
	public WebElement UserNameSearchResult;
	
	public WebElement getUserNameSearchResult() {
		return UserNameSearchResult;
	}


	@FindBy(xpath = "//span[text()='Copy Security']")
	public WebElement CopySecurity;
	
	@FindBy(xpath = "(//label[text()='From User']//..//..//following-sibling::div//input)[1]")
	public WebElement FromUSerCopy;
	
	@FindBy(xpath = "//label[text()='Add']//..//div[contains(@class,'radiobutton-box')]")
	public WebElement AddRadioButton;
	
	@FindBy(xpath = "//span[text()='Copy']")
	public WebElement copyIcon;
	

	public WebElement getFromUSerCopy() {
		return FromUSerCopy;
	}

	public WebElement getAddRadioButton() {
		return AddRadioButton;
	}

	public WebElement getCopyIcon() {
		return copyIcon;
	}

	public WebElement getCopySecurity() {
		return CopySecurity;
	}

	public WebElement getUserNameSearchBox() {
		return UserNameSearchBox;
	}

	public WebElement getNewUser() {
		return newUser;
	}

	public WebElement getUserInputBox() {
		return userInputBox;
	}

	public WebElement getPassInputBox() {
		return passInputBox;
	}

	public WebElement getConfirmPassInputBox() {
		return confirmPassInputBox;
	}

	public WebElement getEmployeeText() {
		return EmployeeText;
	}

	public WebElement getEmployeeNameSerachinputBox() {
		return EmployeeNameSerachinputBox;
	}

	public WebElement getEmployeeNameSelectButton() {
		return EmployeeNameSelectButton;
	}

	public WebElement getAllowPAsswordRecoveryChkBox() {
		return AllowPAsswordRecoveryChkBox;
	}

	public WebElement getAllowWallPAsswordChangeChkBox() {
		return AllowWallPAsswordChangeChkBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	
	
	
	
	
	
	
	
}
