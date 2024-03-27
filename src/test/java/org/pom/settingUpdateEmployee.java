package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class settingUpdateEmployee extends BaseClass{
	public settingUpdateEmployee () {
		PageFactory.initElements(driver, this);	
	}
	

	
	@FindBy(xpath = "//span[contains(@class,'toolbar')]//following-sibling::span[text()='New']")
	public WebElement newButton;
	
	@FindBy(xpath = "//span[contains(@class,'toolbar')]//following-sibling::span[text()='Save']")
	public WebElement saveButton;
	
	

	@FindBy(xpath = "(//label[text()='Employee'])[2]//..//..//following-sibling::div//input")
	public WebElement employyeNameInutBox;
	
	@FindBy(xpath = "//label[text()='Active']//..//div[contains(@class,'radiobutton-box')]")
	public WebElement statusActiveRadiobutton;
	
	@FindBy(xpath = "//label[text()='Category']")
	public WebElement categoryText;
	
	@FindBy(xpath = "//span[text()='Show Inactives']//..//..//..//..//..//input[@aria-disabled='false']")
	public WebElement categoryCodeinputSearchBox;
	
	
	@FindBy(xpath = "(//span[text()='Select'])[1]//..//..//button")
	public WebElement categoryCodeSelectButton;
	
	@FindBy(xpath = "//label[text()='Name']//..//..//following-sibling::div//input")
	public WebElement nameInputBox;
	
	@FindBy(xpath = "//div[contains(@id,'first_name')]//input")
	public WebElement FirstNameInputBox;
	
	@FindBy(xpath = "//div[contains(@id,'last_name')]//input")
	public WebElement lastNameInputBox;
	
	@FindBy(xpath = "//label[text()='Location']")
	public WebElement LocationText;
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-8 col-md-4']//input")
	public WebElement LocationSerachinputBox;
	
	@FindBy(xpath = "(//span[text()='Select'])[1]//..//..//button")
	public WebElement locationSelectButton;
	
	@FindBy(xpath = "//label[text()='Site']")
	public WebElement siteText;
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-8 col-md-4']//input")
	public WebElement siteSerachinputBox;
	
	
	@FindBy(xpath = "//label[text()='Inspector Stamp']//..//..//following-sibling::div//input")
	public WebElement inspectorStampTextBox;
	
	@FindBy(xpath = "//span[text()='Optional']")
	public WebElement optionalTab;
	
	@FindBy(xpath = "//label[text()='Date Hired']//..//..//following-sibling::div//input")
	public WebElement dateHiredInputBox;
	
	@FindBy(xpath = "//a[contains(@class,'state-highlight')]")
	public WebElement currentDate;
	
	
	@FindBy(xpath = "//label[text()='Company']")
	public WebElement company;
	
	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-8 col-md-4']//input")
	public WebElement companySerachinputBox;
	
	
	


	public WebElement getEmployyeNameInutBox() {
		return employyeNameInutBox;
	}


	public WebElement getStatusActiveRadiobutton() {
		return statusActiveRadiobutton;
	}


	public WebElement getCategoryText() {
		return categoryText;
	}


	public WebElement getCategoryCodeinputSearchBox() {
		return categoryCodeinputSearchBox;
	}


	public WebElement getCategoryCodeSelectButton() {
		return categoryCodeSelectButton;
	}


	public WebElement getNameInputBox() {
		return nameInputBox;
	}


	public WebElement getFirstNameInputBox() {
		return FirstNameInputBox;
	}


	public WebElement getLastNameInputBox() {
		return lastNameInputBox;
	}


	public WebElement getLocationText() {
		return LocationText;
	}


	public WebElement getLocationSerachinputBox() {
		return LocationSerachinputBox;
	}


	public WebElement getLocationSelectButton() {
		return locationSelectButton;
	}


	public WebElement getSiteText() {
		return siteText;
	}


	public WebElement getSiteSerachinputBox() {
		return siteSerachinputBox;
	}


	public WebElement getInspectorStampTextBox() {
		return inspectorStampTextBox;
	}


	public WebElement getOptionalTab() {
		return optionalTab;
	}


	public WebElement getDateHiredInputBox() {
		return dateHiredInputBox;
	}


	public WebElement getCurrentDate() {
		return currentDate;
	}


	public WebElement getCompany() {
		return company;
	}


	public WebElement getCompanySerachinputBox() {
		return companySerachinputBox;
	}


	public WebElement getNewButton() {
	
		return newButton;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}


	
	
	
	
	
}
