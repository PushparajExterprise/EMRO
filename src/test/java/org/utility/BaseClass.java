package org.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class BaseClass {
	private static final String TakeScreenshot = null;
	public static WebDriver driver;
	public static void waitTillVisible(String element) {
		WebDriverWait wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
	}
	
	public static void waitTillInVisible(String element) {
		WebDriverWait wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
		
	}
	

	
	public static void scrollInView(WebElement update) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", update);
		
		
	}
	
	public static void scrollInViewUP(WebElement update) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", update);
		
		
	}
	
	public static void Takescreenshot(String name) throws Throwable {
		TakesScreenshot tk=(TakesScreenshot) driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\RLDC\\eclipse-workspace\\emrosample\\target\\cucumber-report\\"+name+".png");
	    FileUtils.copyFile(src, des);
		
	}
	
	public static void generateJvmReport(String json) {
		File f =new File("C:\\Users\\RLDC\\eclipse-workspace\\emrosample\\Jvm");
		Configuration con = new Configuration(f, "EMRO");
		con.addClassifications("Project", "EMRO");
		con.addClassifications("sprint", "5");
		
		List<String> li= new ArrayList<String>();
		li.add(json);
		
		ReportBuilder rb=new ReportBuilder(li, con);
		rb.generateReports();
	}


	
	

}
