package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	 
    public 	LoginTest() 
    {
    	super();
    }
    
    
    @BeforeMethod
    public void setUP()
    {
    	initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
    }

/*    @Test(priority=1)
	public void verifyLoginPageTitle() 
	{
		
	
	    Assert.assertEquals("NGO Website", loginPage.validateLoginPageTitle());
	    
	}
	
    @Test(priority=2)
    public void verifyJoinUsLink() {
    	loginPage.clickOnJoinUsLink();
    }
    */
    @Test(priority=1)
    public void verifyLoginCridential() throws Exception 
    {
    	loginPage.clickOnJoinUsLink();
    	Thread.sleep(2000);
    	
    	try 
    	{ 
    	if(prop.getProperty("emailId").isEmpty() && prop.getProperty("password").isEmpty() )	{
    		System.out.println("Please Enter email id && password");
    	}
    	else {
    		Thread.sleep(2000);
    		System.out.println("else..........");
    		homePage=loginPage.loginCridential(prop.getProperty("emailId"), prop.getProperty("password"));
    		Thread.sleep(2000);
    		System.out.println("No..........");
    	}
    	}
    	catch(Exception e) {
    		System.out.println("Emaild not found: " + e.getMessage());
    	}
    }
   
    @AfterMethod
  	public void tearDown(){
  		driver.quit();
  	}
}
