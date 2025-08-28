package com.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_elements {
	WebDriver driver;

	@FindBy(id="ap_email_login") public WebElement login;
	@FindBy(id="continue") public WebElement Continue;
	@FindBy(id="ap_password") public WebElement password;
	@FindBy(id="signInSubmit") public WebElement submit;
	public Amazon_elements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}
	
}
