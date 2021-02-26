package com.vanran.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basepk.BaseClass;
import com.objects.CheckPriority;
import com.objects.CustomerDetailView;
import com.objects.Login;

public class CustomerDetailViewTest extends BaseClass  {
	
	

		@Test(priority = 0)
		public void verifyLogin() throws InterruptedException {

			Login login1 = PageFactory.initElements(driver, Login.class);
			login1.login();

		}
		@Test(priority=1)
		public void verifyclickOnApplicationSetting() throws InterruptedException
		{
			CustomerDetailView p=PageFactory.initElements(driver, CustomerDetailView.class);
			p.clickOnApplicationSetting();
		}
		
		@Test(priority=2)
		public void verifyclickOnCustomerDetailView()
		{
			CustomerDetailView p=PageFactory.initElements(driver, CustomerDetailView.class);
			p.clickOnCustomerDetailView();
		}
		@Test(priority=3)
		public void verifyclickOnAddNew() throws InterruptedException
		{
			CustomerDetailView p=PageFactory.initElements(driver, CustomerDetailView.class);
			p.clickOnAddNew();
		}
		
		@Test(priority=4)
		public void enterCustomer() throws InterruptedException
		{
			CustomerDetailView p=PageFactory.initElements(driver, CustomerDetailView.class);
			p.enterCustomer();
		}
		
}
