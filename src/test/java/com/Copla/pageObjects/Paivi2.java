package com.Copla.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paivi2 {

	public WebDriver driver;
	public WebDriverWait wait;

	public Paivi2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15000);

	}

	@FindBy(xpath = "//*[@id='Data-dropdown-button']")
	WebElement data;

	@FindBy(xpath = "//*[@id='navigationBar']/div[2]/div[3]/ul/li[2]")
	WebElement paivi;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/button[1]/span/label")
	WebElement addfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/button")
	WebElement selectfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/ul/li[2]/span/div")
	WebElement sortingcode;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/button")
	WebElement operator;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/ul/li[2]/span/div")
	WebElement selectoperator;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[3]/div/div/div[1]/div/input")
	WebElement textbox;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/button[1]/span/label")
	WebElement addnewfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/button")
	WebElement selectnewfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/ul/li[3]/span/div")
	WebElement street;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[2]/div/div/div/button")
	WebElement clickoperator;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[2]/div/div/div/ul/li/span/div")
	WebElement likeoperator;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[3]/div/div/div[1]/div/input")
	WebElement textboxvalue;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[4]")
	WebElement deletefilter;

	@FindBy(xpath ="/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/button[2]/span/label")
	WebElement applyfilter;

	/**** Click on Data tab ****/
	public void datamenuclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(data));
			act.moveToElement(data).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Select Paivi2 screen from the dropdown ****/
	public void paiviscreenclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(paivi));
			act.moveToElement(paivi).click().build().perform();
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

	/**** Click on sortingcode ****/
	public void sortingcode() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(sortingcode));
			act.moveToElement(sortingcode).click().build().perform();
			operator.click();
			wait.until(ExpectedConditions.elementToBeClickable(selectoperator));
			selectoperator.click();
			if (textbox.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(textbox));
				act.moveToElement(textbox).click().sendKeys("401").build().perform();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on streetfilter ****/
	public void filterselection() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(addnewfilter));
			act.moveToElement(addnewfilter).click().build().perform();
			street.click();
			wait.until(ExpectedConditions.elementToBeClickable(clickoperator));
			clickoperator.click();
			likeoperator.click();
			if (textboxvalue.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(textboxvalue));
				act.moveToElement(textboxvalue).click().sendKeys("kat").build().perform();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on deletefilter ****/
	public void deletefilter() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(deletefilter));
			act.moveToElement(deletefilter).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception

		}
	}

	/**** Click on applyfilter ****/
	public void applyfilter() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(applyfilter));
			act.moveToElement(applyfilter).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception

		}
	}
}
