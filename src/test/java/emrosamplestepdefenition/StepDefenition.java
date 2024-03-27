package emrosamplestepdefenition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.Dashboard;
import org.pom.Engineering;
import org.pom.SettingUpdate;
import org.pom.SystemAdminSecurityExplorer;
import org.pom.settingUpdateEmployee;
import org.utility.BaseClass;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefenition extends BaseClass {
	
	public static Dashboard  db;
	public static Engineering  engg;
	public static SettingUpdate su;
	public static settingUpdateEmployee sue;
	public static SystemAdminSecurityExplorer SaSe;
	public static String EmpName;
	
	
	@Given("launch the browser and navigate to EMRO homepage")
	public void launch_the_browser() {
	   ChromeOptions option= new ChromeOptions();
	   option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RLDC\\Downloads\\OldFiles\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://emro-rc.trax.aero/emro/Home.trax");
		
	}

	@When("user give valid username and password")
	public void user_give_valid_username_and_password() throws Throwable {
//	    Thread.sleep(3000);
	    
	    try {
	    	BaseClass.waitTillVisible("(//a[contains(@onclick,'cookiesButton')])[1]");
	    	 driver.findElement(By.xpath("(//a[contains(@onclick,'cookiesButton')])[1]")).click();
	    }
	   catch (Exception e) {
		
	    }
	    BaseClass.Takescreenshot("EMRO_HOME_PAGE");
		  
	   db=new Dashboard();
	    Thread.sleep(1000);
	   db.getUsername().sendKeys("ADM");
	   db.getPassword().sendKeys("trax");
//	 String d="6+4-4*5/5";   
	    
	}

	@When("click login button")
	public void click_login_button() throws Throwable {
		 db=new Dashboard();
		BaseClass.Takescreenshot("LOGIN");
		db.getSubmit().click();
		waitForPageLoad();
		BaseClass.waitTillVisible("(//span[contains(text(),'Dashboard')])[4]");
//		Thread.sleep(1500);
	}
	
	@When("navigate to Engg control shop")
	public void navigate_to_Engg_control_shop() throws Throwable {
		 db=new Dashboard();		 
		engg=new Engineering();		
		
		db.getModules().click();
		db.getEngineering().click();
		Thread.sleep(500);
		BaseClass.scrollInView(engg.getUpdate());
		engg.getUpdate().click();
		Thread.sleep(500);
		BaseClass.scrollInView(engg.getEngineeringControlShop());
	    engg.getEngineeringControlShop().click();
	    waitForPageLoad();
//		Thread.sleep(3500);

	}

	@Then("check whether the user navigated to the home page")
	public void check_whether_the_user_navigated_to_the_home_page() throws Throwable {
		System.out.println(driver.getTitle());
//	    Assert.assertFalse(driver.getTitle().contains("Home"));
		BaseClass.Takescreenshot("Dashboard");
		driver.close();
		}
	
	public static void waitForPageLoad() {
		BaseClass.waitTillInVisible("//img[@class='loadingGif']");
	}

	@When("navigate to Employee profile creation page")
	public void navigate_to_Employee_profile_creation_page() throws Throwable {
		 db=new Dashboard();		 
		su=new SettingUpdate();		
		
		db.getModules().click();
		Thread.sleep(500);
		waitForPageLoad();
		BaseClass.scrollInView(db.getSettingMod());
		Thread.sleep(500);
		db.getSettingMod().click();
		Thread.sleep(500);
		BaseClass.scrollInView(su.getSettingUpdate());
		su.getSettingUpdate().click();
		Thread.sleep(500);
		BaseClass.scrollInView(su.getEmployeeMod());
	    su.getEmployeeMod().click();
	    waitForPageLoad();
	    BaseClass.Takescreenshot("Employee_Profile_Creation_Page");
//		Thread.sleep(3500);

	}
	
	
	@When("create Employee profile by giving required details")
	public void createEmployeeprofilebygivingrequireddetails(DataTable value) throws Throwable {
	  List<String>	li=value.asList(String.class);
	  EmpName=li.get(0);
		sue=new settingUpdateEmployee();
		
		 sue.getNewButton().click();
		 waitForPageLoad();
		 sue.getEmployyeNameInutBox().sendKeys(li.get(0));
		 sue.getStatusActiveRadiobutton().click();
		 sue.getCategoryText().click();
		 waitForPageLoad();
		 sue.getCategoryCodeinputSearchBox().sendKeys("AIREXP");
		 BaseClass.Takescreenshot("CategoryCodeSelection");
		 Thread.sleep(1500);
		 waitForPageLoad();
		 sue.getCategoryCodeSelectButton().click();
		 waitForPageLoad();
		 
		 sue.getNameInputBox().sendKeys(li.get(0));
		 BaseClass.scrollInView(sue.getFirstNameInputBox());
		 sue.getFirstNameInputBox().sendKeys(li.get(0));
		 sue.getLastNameInputBox().sendKeys("Mr");
		 sue.getLocationText().click();
		 waitForPageLoad();
		 sue.getLocationSerachinputBox().sendKeys("MIA");
		 waitForPageLoad();
		 sue.getLocationSelectButton().click();
		 BaseClass.Takescreenshot("LocationSelection");
		 waitForPageLoad();
		 
		 sue.getSiteText().click();
		 waitForPageLoad();
		 sue.getSiteSerachinputBox().sendKeys("LINE");
		 Thread.sleep(1500);
		 waitForPageLoad();
		 sue.getLocationSelectButton().click();
		 waitForPageLoad();
		 BaseClass.Takescreenshot("CredentialsProvided");
		 sue.getInspectorStampTextBox().sendKeys("INSPECTOR");
		 
		 BaseClass.scrollInViewUP(sue.getOptionalTab());
		 Thread.sleep(500);
		 sue.getOptionalTab().click();
		 waitForPageLoad();
		 
		 sue.getDateHiredInputBox().click();
		 sue.getCurrentDate().click();
		 BaseClass.Takescreenshot("OptionalTab");
		 
		 sue.getCompany().click();
		 waitForPageLoad();
		 sue.getCompanySerachinputBox().sendKeys("TRAX");
		 waitForPageLoad();
		 BaseClass.Takescreenshot("CompanySelection");
		 sue.getLocationSelectButton().click();
		 waitForPageLoad();
		 sue.getSaveButton().click();
		 waitForPageLoad();
		 Thread.sleep(1500);
		 BaseClass.Takescreenshot("ProfileCreationResponse");
		 
	}
	
	
	@Then("setup the Employee credentials")
	public void setuptheEmployeecredentials() throws Throwable {
		 db=new Dashboard();	
		 SaSe=new SystemAdminSecurityExplorer();
		 
		 BaseClass.scrollInView(db.getSystemAdmin());
		 db.getSystemAdmin().click();
		 Thread.sleep(500);
		 db.getSystemAdminExplorer().click();
		 Thread.sleep(500);
		 db.getSystemAdminSecurityExplorerMod().click();
		 waitForPageLoad();
		 BaseClass.waitTillVisible("//span[contains(@class,'toolbar')]//following-sibling::span[text()='New User']");
		 
		 SaSe.getNewUser().click();
		 waitForPageLoad();
		 
		 SaSe.getUserInputBox().clear();
		 SaSe.getUserInputBox().sendKeys(EmpName);
		 SaSe.getPassInputBox().clear();
		 SaSe.getPassInputBox().sendKeys("trax");
		 SaSe.getConfirmPassInputBox().sendKeys("trax");
		 BaseClass.Takescreenshot("CredentialsSetup");
		 SaSe.getAllowPAsswordRecoveryChkBox().click();
//		 SaSe.getAllowWallPAsswordChangeChkBox().click();
		 
		 SaSe.getEmployeeText().click();
		 waitForPageLoad();
		 SaSe.getEmployeeNameSerachinputBox().sendKeys(EmpName);
		 Thread.sleep(2000);
		 BaseClass.Takescreenshot("EmployeeNameSelection");
		 waitForPageLoad();
		 SaSe.getEmployeeNameSelectButton().click();
		 waitForPageLoad();
		 SaSe.getSaveButton().click();
		 waitForPageLoad();
		 BaseClass.Takescreenshot("UserCredentialsSetupResponse");
		 
		 SaSe.getUserNameSearchBox().sendKeys(EmpName);
		 waitForPageLoad();
		 BaseClass.waitTillVisible("//td[@role='gridcell']/span[contains(text(),'"+EmpName+"')]");
		 Thread.sleep(2000);
         WebElement username=driver.findElement(By.xpath("//td[@role='gridcell']/span[contains(text(),'"+EmpName+"')]"));
         username.click();
		 waitForPageLoad();
		 
		 SaSe.getCopySecurity().click();
		 waitForPageLoad();
		 BaseClass.Takescreenshot("Access_Copy");
		 SaSe.getFromUSerCopy().sendKeys("BAS");
		 SaSe.getAddRadioButton().click();
		 SaSe.getAddRadioButton().click();
		 SaSe.getCopyIcon().click();
		 waitForPageLoad();
		 BaseClass.Takescreenshot("Access_Copied");
		}
	
	@Then("logout the application")
	public void logouttheapplication() throws Throwable {
		 db=new Dashboard();	
		 db.getLogOut().click();
		 BaseClass.Takescreenshot("Logout");
		 waitForPageLoad();
		 
	}
	
	@Then("login the Application with new user")
	public void logintheApplicationwithnewuser() throws Throwable {
		 db=new Dashboard();	
		 db.getUsername().sendKeys(EmpName);
		 db.getPassword().sendKeys("trax");
		 waitForPageLoad();
		 BaseClass.Takescreenshot("NewUSerLogin");
		 db.getSubmit().click();
	     waitForPageLoad();
	     BaseClass.waitTillVisible("(//span[contains(text(),'Dashboard')])[4]");
	     BaseClass.Takescreenshot("DashboardforNewUSerLogin");
		 
	}
	
}
