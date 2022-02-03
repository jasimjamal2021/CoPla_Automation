package com.Copla.pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SmallParcel {

	public WebDriver driver;
	public WebDriverWait wait;

	public SmallParcel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15000);
	}

	@FindBy(xpath = "//*[@id='Configuration-dropdown-button']")
	WebElement admin;

	@FindBy(xpath = "//*[@id='navigationBar']/div[2]/div[4]/ul/li[2]/navdropdownitem/div")
	WebElement smallparcel;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/div[4]/div/div/div/input")
	// List<WebElement> statusclick;
	WebElement statusclick;

	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div/div/div/span")
	WebElement message;

	@FindBy(xpath = "//*[@id='contents']/div/div/div[2]/div/p")
	WebElement productcodes;

	/**** Click on Admin tab ****/
	public void adminclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(admin));
			Thread.sleep(10000);
			act.moveToElement(admin).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Select Smallparcel screen from the dropdown ****/
	public void smallparcelscreenclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(smallparcel));
			act.moveToElement(smallparcel).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on status ****/
	public void statusclick() {
		try {
			/*
			 * for (int i = 0; i < statusclick.size(); i++) { 
			 * String values=statusclick.get(i).getAttribute("sc-1pnbgxk-2 egVyNS");
			 * System.out.println(values); 
			 * if (values.contains("checked")) {
			 * statusclick.get(i).click(); 
			 * thread.sleep(5000); 
			 * break; } 
			 * else {
			 * System.out.println("Error"); } }
			 */
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			Thread.sleep(3000);
			executor.executeScript("arguments[0].click();", statusclick);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Message is showing after update ****/
	public void messageshow() {
		try {
			String s = message.getText();
			System.out.println(s);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Showind product codes in console ****/
	public void productcodes() {
		try {
			String s = productcodes.getText();
			System.out.println("The product codes are " + s);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}
}
