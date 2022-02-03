package com.Copla.pageObjects;

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

public class DeliverymodelConfiguration extends BaseClass {

	public WebDriver driver;
	public WebDriverWait wait;

	public DeliverymodelConfiguration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15000);
	}

	@FindBy(xpath = "//*[@id='DeliveryModel-dropdown-button']")
	WebElement deliverymodel;

	@FindBy(xpath = "//*[@id='navigationBar']/div[2]/div[1]/ul/li[1]/navdropdownitem/div")
	WebElement deliverymodelconfig;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div[2]/div[2]/button/span/label")
	WebElement add;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[1]/div[1]")
	WebElement name;

	@FindBy(xpath = "//*[@id='deliveryModelConfigType']")
	WebElement modeltype;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[1]/div[2]/div/div/div/ul/li")
	WebElement emdselect;

	@FindBy(xpath = "//*[@id='deliveryModelConfigCycleCount']")
	WebElement cyclecountclick;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[1]/div[3]/div/div/div/ul/li[4]")
	WebElement cyclecount;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkbox;

	@FindBy(xpath = "//*[@id='1Monday']")
	WebElement cyclepattern;

	@FindBy(xpath = "//*[@id='3Saturday']")
	WebElement cyclepattern1;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[3]/div[1]/div/div[1]/textarea")
	WebElement description;

	@FindBy(xpath = "//*[@id='startDate']/input")
	WebElement startdate;

	@FindBy(xpath = "//div[@class='p-datepicker-calendar-container']/table/tbody/tr[3]/td[1]/span")
	WebElement selectstartdate;

	@FindBy(xpath = "//*[@id='endDate']")
	WebElement enddate;

	@FindBy(xpath = "//span[@class='p-datepicker-next-icon pi pi-chevron-right']")
	WebElement enddatearrow;

	@FindBy(xpath = "//div[@class='p-datepicker-calendar-container']/table/tbody/tr[4]/td[7]/span")
	WebElement selectenddate;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div[4]/button")
	WebElement save;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div/div/span")
	WebElement savemessage;

	/**** Click on Delivery model dropdown ****/
	public void deliverymodelclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(deliverymodel));
			Thread.sleep(10000);
			act.moveToElement(deliverymodel).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on Delivery mbdel configuration from the dropdown ****/
	public void deliverymodelconfig() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(deliverymodelconfig));
			Thread.sleep(10000);
			act.moveToElement(deliverymodelconfig).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on add button ****/
	public void adddeliverymodel() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(add));
			Thread.sleep(10000);
			act.moveToElement(add).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on delivery model name an enter name ****/
	public void adddeliveryname() {
		try {
			Actions act = new Actions(driver);
			String random = randomstring("abc");
			wait.until(ExpectedConditions.elementToBeClickable(name));
			act.moveToElement(name).click().sendKeys(random).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on model type ****/
	public void adddeliverymodeltype() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(modeltype));
			act.moveToElement(modeltype).click().build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(emdselect));
			emdselect.click();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on cyclce count and select count ****/
	public void cyclecountselect() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(cyclecountclick));
			act.moveToElement(cyclecountclick).click().build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(cyclecount));
			act.moveToElement(cyclecount).click().build().perform();

			if (checkbox.isEnabled()) {
				cyclepattern.click();
				cyclepattern1.click();
			} else {
				System.out.println("Cycle pattern is disabled");
			}
		} catch (

		Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Add description ****/
	public void adddescription() {
		try {
			Actions act = new Actions(driver);
			String random = randomstring("abc");
			wait.until(ExpectedConditions.elementToBeClickable(description));
			act.moveToElement(description).click().sendKeys(random).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on start date and select date ****/
	public void startdateclick() {
		try {
			startdate.click();
			JavascriptExecutor executor = (JavascriptExecutor) driver;

			if (selectstartdate.isEnabled()) {
				Thread.sleep(3000);
				executor.executeScript("arguments[0].click();", selectstartdate);
			} else {
				System.out.println("Date is disabled");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on end date calendar and select end date ****/
	public void enddate() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(enddate));
			if (enddate.isEnabled()) {
				act.moveToElement(enddate).click().build().perform();
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				Thread.sleep(4000);
				executor.executeScript("arguments[0].click();", enddatearrow);
				Thread.sleep(4000);
				executor.executeScript("arguments[0].click();", selectenddate);
			} else {
				System.out.println("Date is disabled");
				Assert.assertTrue(false);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on save ****/
	public void save() {
		try {
			save.click();
			String message = savemessage.getText();
			System.out.println(message);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

}
