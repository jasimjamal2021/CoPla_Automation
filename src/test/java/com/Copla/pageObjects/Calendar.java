package com.Copla.pageObjects;

import static org.testng.Assert.assertTrue;

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

public class Calendar {

	public WebDriver driver;
	public WebDriverWait wait;

	public Calendar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15000);

	}

	@FindBy(xpath = "//*[@id='Calendar-dropdown-button']")
	WebElement calendar;

	@FindBy(xpath = "//*[@id='navigationBar']/div[2]/div[2]/ul/li[1]/navdropdownitem/div")
	WebElement calendarclick;

	@FindBy(xpath = "//*[@id='years']")
	WebElement years;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/div/ul/li[1]")
	WebElement selectyears;

	@FindBy(xpath = "//*[@id='month']")
	WebElement month;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div/div/div/ul/li[2]")
	WebElement selectmonth;

	@FindBy(xpath = "//*[@id='deliveryType']")
	WebElement deliverytype;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[1]/div[5]/div/div/div/ul/li[1]")
	WebElement basic;

	@FindBy(xpath = "//*[@id='deliveryOffice']")
	WebElement deliveryoffice;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div/div/div/ul/li[4]/span/div")
	WebElement selectdeliveryoffice;

	@FindBy(xpath = "//*[@id='route']")
	WebElement route;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div/ul/li[3]")
	WebElement routevalue;

	@FindBy(xpath = "//*[@id='module']")
	WebElement module;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[2]/div[3]/div/div/div/ul/li[7]/span/div")
	WebElement modulevalue;

	@FindBy(xpath = "//*[@id='area_level']")
	WebElement arealevel;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[4]")
	WebElement arealevelvalue;

	@FindBy(xpath = "//*[@id='sub-area_level']")
	WebElement subarealevel;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[3]/div[2]/div/div/div/ul/li[2]")
	WebElement subarealevelvalue;

	@FindBy(xpath = "//*[@id='Basic_costcenter_Area']")
	WebElement costcenter;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[3]/div[3]/div/div/div/ul/li[3]/span/div")
	WebElement costcentervalue;

	@FindBy(xpath = "//*[@id='[object Object]apply filter']/span/label")
	WebElement applyfilter;

	@FindBy(xpath = "//*[@id='[object Object]clear filter']")
	WebElement clearfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[1]/div[5]/div/div/div/ul/li[2]")
	WebElement early;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[2]/div[3]/div/div/div/ul/li[2]/span/div")
	WebElement routevalueearly;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div/ul/li[3]")
	WebElement modulevalueearly;

	@FindBy(xpath = "//*[@id='area_city']")
	WebElement deliveryarea;

	@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li/span/div")
	WebElement deliveryareavalue;

	@FindBy(xpath = "//*[@id='product']")
	WebElement product;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[3]/div[2]/div/div/div/ul/li[3]/span/div")
	WebElement productvalue;

	@FindBy(xpath = "//*[@id='costcenterArea']")
	WebElement costcenterearly;

	@FindBy(xpath = " /html/body/div/div[1]/div[2]/div[2]/div[3]/div[3]/div/div/div/ul/li ")
	WebElement costcenterearlyvalue;

	@FindBy(xpath = "//*[@id='reportingArea'] ")
	WebElement reporting;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div[5]/div[1]/div/div/div/ul/li/span/div ")
	WebElement reportingvalue;

	@FindBy(xpath = " //*[@id='customerArea']")
	WebElement customerarea;

	@FindBy(xpath = " /html/body/div/div[1]/div[2]/div[2]/div[5]/div[2]/div/div/div/ul/li[1]/span/div ")
	WebElement customerareavalue;

	@FindBy(xpath = " /html/body/div/div[1]/div[2]/div[2]/div[5]/div[3]/div/button[1]/span/label ")
	WebElement applyfilter1;

	/**** Click on Calendar Page ****/
	public void calendar() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(calendar).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on Calendar Page ****/
	public void calendarclick() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(calendarclick).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on month and selet month ****/
	public void monthclick() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(years).click().build().perform();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", selectyears);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on year and selet year ****/
	public void yearclick() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(month).click().build().perform();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			if (month.isEnabled()) {
				executor.executeScript("arguments[0].click();", selectmonth);
			} else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on delivery type ****/
	public void deliverytype() {
		try {
			deliverytype.click();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Select BASIC delivery type ****/
	public void basicdeliverytype() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", basic);
			Thread.sleep(6000);
			deliveryoffice.click();
			selectdeliveryoffice.click();
			Thread.sleep(3000);
			if (route.isEnabled()) {
				route.click();
			}
			routevalue.click();
			Thread.sleep(3000);
			if (module.isEnabled()) {
				module.click();
				modulevalue.click();

			}
			Thread.sleep(3000);
			if (arealevel.isEnabled()) {
				arealevel.click();
				arealevelvalue.click();

			}
			Thread.sleep(3000);
			if (subarealevel.isEnabled()) {
				subarealevel.click();
				subarealevelvalue.click();

			}

			Thread.sleep(3000);
			if (costcenter.isEnabled()) {
				costcenter.click();
				costcentervalue.click();
				Thread.sleep(3000);
			}
			/*
			 * for (int i = 0; i < selectdeliveryoffice.size(); i++) { String values =
			 * selectdeliveryoffice.get(i).getAttribute("class");
			 * System.out.println(values); if (values.contains("00100-HELSINKI 10")) {
			 * selectdeliveryoffice.get(i).click(); break; } else {
			 * Assert.assertTrue(false); } }
			 */
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on apply filter ****/
	public void applyfilter() {
		try {
			applyfilter.click();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on clear filter ****/
	public void clearfilter() {
		try {
			clearfilter.click();
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on Early delivery type filter ****/
	public void earlydeliveryfilter() {
		try {
			early.click();
			Thread.sleep(4000);
			deliveryoffice.click();
			selectdeliveryoffice.click();
			Thread.sleep(3000);
			if (route.isEnabled()) {
				route.click();
			}
			routevalueearly.click();
			Thread.sleep(3000);
			if (module.isEnabled()) {
				module.click();
				modulevalueearly.click();
			}
			Thread.sleep(3000);
			if (deliveryarea.isEnabled()) {
				deliveryarea.click();
				deliveryareavalue.click();
			}
			Thread.sleep(3000);
			if (product.isEnabled()) {
				product.click();
				productvalue.click();

			}
			Thread.sleep(3000);
			if (costcenterearly.isEnabled()) {
				costcenterearly.click();
				costcenterearlyvalue.click();

			}
			Thread.sleep(3000);
			if (reporting.isEnabled()) {
				reporting.click();
				reportingvalue.click();

			}
			Thread.sleep(3000);
			if (customerarea.isEnabled()) {
				customerarea.click();
				customerareavalue.click();
				applyfilter1.click();
				Thread.sleep(7000);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

}
