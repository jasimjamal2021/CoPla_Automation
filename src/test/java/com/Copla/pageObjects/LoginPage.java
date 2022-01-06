package com.Copla.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@FindBy(id = "i0116")
	WebElement txtusername;

	@FindBy(id = "idSIButton9")
	WebElement buttonclick;

	@FindBy(xpath = "//input[@id='passwordInput']")
	WebElement txtpassword;

	@FindBy(xpath = "//span[@id='submitButton']")
	WebElement submit;

	@FindBy(id = "KmsiCheckboxField")
	WebElement checkbox;

	@FindBy(id = "idSIButton9")
	WebElement id;

	//****Enter username****//
	public void setUserName(String username) {
		try {
			txtusername.sendKeys(username);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}

	}

	//****Button click****//
	public void clickbutton() {
		try {
			buttonclick.click();

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}

	//****Entering Password****//
	public void setPassword(String password) {
		try {
			txtpassword.sendKeys(password);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}

	//****Click on submit****//
	public void submit() {
		try {
			submit.click();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}


	//****Click on checkbox****//
	public void checkbox() {
		try {
			checkbox.click();
		}

		catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}


	//****Click on buttonid****//
	public void clickbuttonid() {
		try {
			id.click();

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}

}
