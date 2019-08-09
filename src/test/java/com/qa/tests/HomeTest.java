package com.qa.tests;

 import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

  public class HomeTest extends BaseClass {
	
	    HomePage homePage;
		LoginPage loginPage;
		
		
		public HomeTest()
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
		 
		/*   @Test(priority=1)
			public void verifyLoginPageTitle() 
			{
				
			
			    Assert.assertEquals("NGO Website", homePage.validateLoginPageTitle());
			    
			}
		   */
		   
		   @Test(priority=1)
		   public void verifyUpdateProfile() throws Exception 
		   {
			   System.out.println("befor update");
			   Thread.sleep(4000);
			   homePage.clickOnUpdateProfile();
			   System.out.println("after update");
		   }
           
		/*   @Test(priority=3)
		   public void verifyProfile() 
		   {
			   homePage.clickOnProfile();
		   }
		   */
		  /* @AfterMethod
		   public void tearDown() 
		   {
			driver.close();   
		   }*/
}
