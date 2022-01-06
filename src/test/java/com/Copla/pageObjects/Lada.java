package com.Copla.pageObjects;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Lada extends BaseClass {

	public WebDriver driver;
	public WebDriverWait wait;

	public Lada(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15000);
	}

	@FindBy(xpath = "//*[@id='Data-dropdown-button']")
	WebElement data;

	@FindBy(xpath = "//*[@id='navigationBar']/div[2]/div[3]/ul/li[1]")
	WebElement lada;

	@FindBy(xpath = "//*[@id='addFilterButton']/span/label")
	WebElement addfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/button")
	WebElement selectfilter;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/ul/li")
	List<WebElement> dropdownvalues;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/ul/li[3]/span/div")
	WebElement sortingcode;
	
	@FindBy(xpath ="/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/ul/li[4]/span/div")
	WebElement sortingprocess;


	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/button")
	WebElement operator;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/ul/li[2]")
	WebElement operatorselection;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[3]/div/div/div[1]/div/input")
	WebElement operatortextbox;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/button[2]/span/label")
	WebElement applyfilter;

	@FindBy(xpath = "//*[@id='makePreference']")
	WebElement preferencecheckbox;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div[2]/div[1]/div/div[4]/div[3]/div[1]/div/div[1]/div/label/div")
	WebElement preferencename;

	@FindBy(xpath = "//*[@id='savePreference']")
	WebElement savepreferencename;

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

	/**** Select Lada screen from dropdown ****/
	public void ladascreenclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(lada));
			act.moveToElement(lada).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/****Click on Add filter button ****/
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

	/**** Select values from dropdown ****/
	/*
	 * public void selectingdropdownvalues() { try { for (int i = 0; i <
	 * dropdownvalues.size(); i++) { String values =
	 * dropdownvalues.get(i).getAttribute("Sorting Code");
	 * System.out.println(values); if (values.contains("Sorting Code")) {
	 * dropdownvalues.get(i).click(); break; } else { System.out.println("Error"); }
	 * }
	 * 
	 * } catch (Exception e) { System.out.println(e.getMessage().toString()); //
	 * TODO: handle exception } }
	 */
	/**** Select sorting code ****/
	public void selectsortingcode() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", sortingcode);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on operator ****/
	public void operatorclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(operator));
			act.moveToElement(operator).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Select operator from the dropdown ****/
	public void selectoperator() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			wait.until(ExpectedConditions.elementToBeClickable(operatorselection));
			executor.executeScript("arguments[0].click();", operatorselection);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Enter values in textbox and click apply filter ****/
	public void textboxvalue() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(operatortextbox));
			act.moveToElement(operatortextbox).click().sendKeys("0027").build().perform();
			if (applyfilter.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(applyfilter));
				applyfilter.click();
			} else {
				System.out.println("Not selected");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Select preference checkbox ****/
	public void preferencecheckbox() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", preferencecheckbox);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Add preference name ****/
	public void preferencename() {
		try {
			Actions act = new Actions(driver);
			String random = randomstring("abc");
			wait.until(ExpectedConditions.elementToBeClickable(preferencename));
			act.moveToElement(preferencename).click().sendKeys(random).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Save preference ****/
	public void savepreference() {
		try {
			if (savepreferencename.isEnabled()) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				wait.until(ExpectedConditions.elementToBeClickable(savepreferencename));
				executor.executeScript("arguments[0].click();", savepreferencename);
			}
			/*
			 * else { System.out.println("Failed"); Assert.assertTrue(false); }
			 */
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

}
