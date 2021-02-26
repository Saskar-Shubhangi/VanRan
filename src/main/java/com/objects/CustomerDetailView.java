package com.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepk.BaseClass;

public class CustomerDetailView extends BaseClass {

	

	@FindBy(xpath="(//span[contains(text(),'Application setting')])[1]")
	WebElement ApplicationSetting;
	
	@FindBy(xpath="(//span[contains(text(),'Customer-Details-View')])[1]")
	WebElement CustomerDetailView;
	
	@FindBy(xpath="(//span[contains(text(),'ADD NEW')])[1]")
	WebElement AddNew;
	
	@FindBy(xpath="//input[@id='mat-input-14']")
	WebElement Customer;
	
	@FindBy(xpath="//input[@id='mat-input-15']")
	WebElement CustomerRootDomain;
	
	@FindBy(xpath="//input[@id='mat-input-16']")
	WebElement RootDomain;
	
	
	
	
	public void clickOnApplicationSetting() throws InterruptedException
	{
		ApplicationSetting.click();
		Thread.sleep(2000);
	}
	
	public void clickOnCustomerDetailView() 
	{
		
	       highlightElement(driver, CustomerDetailView);
	       CustomerDetailView.click();
	       //JavascriptExecutor js = (JavascriptExecutor)driver;
	        //js.executeScript("arguments[0].click()", CustomerDetailView);
		
	}
	
	public void clickOnAddNew() throws InterruptedException
	{
		
		AddNew.click();
		
		Thread.sleep(2000);
		
		
	}
	
	public void enterCustomer() throws InterruptedException
	{
		
		Customer.sendKeys("API Testing45");
		highlightElement(driver, Customer);
		Thread.sleep(2000);
		CustomerRootDomain.sendKeys("vrgsol.com");
		RootDomain.sendKeys("vrgsol.com1");
		
		
	}
	
}


