package com.Copla.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Prio extends BaseClass {

	public WebDriver driver;
	public WebDriverWait wait;

	public Prio(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15000);

	}

	@FindBy(xpath = "/html/body/div/nav/div[2]/div[3]/button")
	WebElement data;

	@FindBy(xpath = "//*[@id='navigationBar']/div[2]/div[3]/ul/li[4]")
	WebElement prio;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/button[1]")
	WebElement addfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/button")
	WebElement selectfilter;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/ul/li[1]/span/div")
	WebElement filter1;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/button")
	WebElement operator1;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/ul/li[2]")
	WebElement selectoperator1;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[3]/div[3]/div/div/div[1]/div")
	WebElement textbox1;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/button[2]/span/label")
	WebElement applyfilter2;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/button[1]/span/label")
	WebElement addfilterbutton;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/button")
	WebElement selectfilter2;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/ul/li[2]/span/div")
	WebElement filter2;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[2]/div/div/div/button")
	WebElement operator2;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[2]/div/div/div/ul/li[2]/span/div")
	WebElement selectoperator2;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[4]/div[3]/div/div/div[1]/div/input")
	WebElement textbox2;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/div/div[5]/div[1]/button[2]/span/label")
	WebElement applyfilter3;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/ul/li[3]/span/div")
	WebElement filter3;

	@FindBy(xpath = "//*[@id='navigationBar']/div[1]/div/div[2]/div/div/div[2]/button/span/label")
	WebElement logout;

	@FindBy(xpath = "//*[@id='makePreference']")
	WebElement preferencecheckbox;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div[2]/div[1]/div/div[5]/div[3]/div[1]/div/div[1]/div/label")
	WebElement preferencename;

	@FindBy(xpath = "//*[@id='savePreference']")
	WebElement savepreferencename;

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

	/**** Select Prio screen from the dropdown ****/
	public void prioscreenclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(prio));
			act.moveToElement(prio).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on Add filter button ****/
	public void addfilterclick() {
		try {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			if (addfilter.isEnabled()) {
				executor.executeScript("arguments[0].click();", addfilter);
			} else {
				Assert.assertTrue(false);
			}
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

	/**** Click on add add filter select first filter options and apply filter ****/
	public void filter1() {
		try {

			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(filter1));
			act.moveToElement(filter1).click().build().perform();
			act.moveToElement(operator1).click().build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(selectoperator1));
			act.moveToElement(selectoperator1).click().build().perform();

			if (textbox1.isEnabled())
				act.moveToElement(textbox1).click().sendKeys("59").build().perform();

			act.moveToElement(applyfilter2).click().build().perform();
			Thread.sleep(15000);

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	//

	/**** Click on Add filter button2 and select filter ****/
	public void addfilter2click() {
		try {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			if (addfilterbutton.isEnabled()) {
				executor.executeScript("arguments[0].click();", addfilterbutton);
				selectfilter2.click();
			} else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Select filter2 ****/
	public void filter2() {
		try {

			Actions act = new Actions(driver);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", filter2);

			act.moveToElement(operator2).click().build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(selectoperator2));
			act.moveToElement(selectoperator2).click().build().perform();

			if (textbox2.isEnabled())
				act.moveToElement(textbox2).click().sendKeys("209").build().perform();

			wait.until(ExpectedConditions.elementToBeClickable(applyfilter3));
			act.moveToElement(applyfilter3).click().build().perform();
			Thread.sleep(15000);

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception

		}

	}

	/**** Click on logout ****/
	public void logout() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(logout));
			act.moveToElement(logout).click().build().perform();
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
				Thread.sleep(5000);
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
