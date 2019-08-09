package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//a[text()='Join Us']")
	WebElement joinUsLink;
	
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	WebElement emailField;
	
	@FindBy(xpath="(//input[@name='password'])[1]")
	WebElement passwordField;
    
	@FindBy(xpath="//a[text()='Forgot your Password?' and @class='forgot']")
	WebElement forgotpassLink;
	
	@FindBy(xpath="(//button[text()='Submit'])[1]")
	WebElement submitBTN;
	
	@FindBy(xpath="//div[text()='Invalid Credentials!! ']")
	WebElement invalidText;
	
	@FindBy(xpath="//div[text()='Account deactivated!!']")
	WebElement accountDeactiveText;
	

	   public LoginPage()   { 
		PageFactory.initElements(driver, this);
	   }

	   public String validateLoginPageTitle()
	   {
			
		   return driver.getTitle();
		}
	   
	   public void clickOnJoinUsLink() 
	   {
		   joinUsLink.click();
	   }
	   
	   public HomePage loginCridential(String emid , String pwd) {
		   System.out.println("login.......");
		   emailField.clear();
		   emailField.sendKeys(emid);
		   
		   passwordField.clear();
		   passwordField.sendKeys(pwd);
		   
		   submitBTN.click();
		   
		  /* if(invalidText.isDisplayed()) {
			   System.out.println("Please give valid crediantial..");
		   }*/
		   return new HomePage();
	   }
}
