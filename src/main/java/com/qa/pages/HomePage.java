package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage extends BaseClass{

	  @FindBy(xpath="//div[@class='profileImg']")
	  WebElement clickUpdateProfile;
	  
	  @FindBy(xpath="//a[text()='Profile']")
	  WebElement clickOnProfile;
	  
	  public HomePage() 
	  {
		  
		  PageFactory.initElements(driver, this);
	  }
	  
	  public String validateLoginPageTitle()
	   {
			
		   return driver.getTitle();
		}
	  
	  
	  public void clickOnUpdateProfile() 
	  {
		  
		  clickUpdateProfile.click();
	  }
	  
	  public void clickOnProfile() 
	  {
		  clickOnProfile.click();
	  }
}
