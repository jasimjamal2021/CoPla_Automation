package com.Copla.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delivery {

	public WebDriver driver;
	public WebDriverWait wait;

	public Delivery(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15000);

	}

	@FindBy(xpath = "/html/body/div/nav/div[2]/div[3]/button")
	WebElement data;

	@FindBy(xpath = "//*[@id='navigationBar']/div[2]/div[3]/ul/li[3]")
	WebElement delivery;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/button[1]/span/label")
	WebElement addfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/button")
	WebElement selectfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/ul/li[2]/span/div")
	WebElement productcode;;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/button")
	WebElement operator;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/ul/li/span/div")
	WebElement selectoperator;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[3]/div/div/div/button")
	WebElement postalcode;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[3]/div/div/div/ul/li[3]/span/div")
	WebElement value;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/button[2]/span/label")
	WebElement applyfilter;

	/**** Click on Data tab ****/
	public void datamenuclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(data));
			Thread.sleep(10000);
			act.moveToElement(data).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Select Delivery screen from the dropdown ****/
	public void deliveryscreenclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(delivery));
			act.moveToElement(delivery).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on Add filter button ****/
	public void addfilterclick() {
		try {
			/*
			 * JavascriptExecutor executor = (JavascriptExecutor) driver;
			 * executor.executeScript("arguments[0].click();", addfilter);
			 */
			Actions act = new Actions(driver);
			act.moveToElement(addfilter).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on selectfilter ****/
	public void selectfilters() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(selectfilter));
			act.moveToElement(selectfilter).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Select postal code filter and click apply filter ****/
	public void selectpostalcodefilters() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(productcode));
			act.moveToElement(productcode).click().build().perform();
			Thread.sleep(3000);
			operator.click();
			wait.until(ExpectedConditions.elementToBeClickable(selectoperator));
			selectoperator.click();
			wait.until(ExpectedConditions.elementToBeClickable(postalcode));
			postalcode.click();
			value.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(applyfilter));
			applyfilter.click();
			Thread.sleep(15000);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

}
