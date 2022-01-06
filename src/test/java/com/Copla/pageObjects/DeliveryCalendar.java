package com.Copla.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryCalendar {

	public WebDriver driver;

	public DeliveryCalendar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id='Calendar-dropdown-button']")
	WebElement calenderclick;

	@FindBy(xpath = "//*[@id='navigationBar']/div[2]/div[2]/ul/li[2]/navdropdownitem/div")
	WebElement deliverycalendarclick;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div/div[1]/div/div/div/div/button")
	WebElement year;

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div/div[1]/div/div/div/div/ul/li[1]")
	WebElement yearselection;

	// *[@id="root"]/div[1]/div[2]/div/div[1]/div/div/div/div/ul/li

	@FindBy(xpath = "//*[@id='showCalendar']")
	WebElement calendar;

	@FindBy(xpath = "/html/body/div/div[1]/div[3]/div/div/div[2]/table[2]/tbody/tr[3]/td[5]/label/i")
	WebElement dayselected;

	@FindBy(xpath = "//*[@id='2022-02-04']/i")
	WebElement popupselected;

	@FindBy(xpath = "//*[@id='dialogForAddEdit']/div/div/div[3]/button[2]")
	WebElement dayreset;

	@FindBy(xpath = "//*[@id='resetDeliveryDates']/span/label")
	WebElement reset;

	// ****Click on Calendar Page****//
	public void calendarclick() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(calenderclick).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	// ****Click on Delivery Calendar Page****//
	public void deliverycalendarclick() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(deliverycalendarclick).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	// ****Click on Year****//
	public void yearclick() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(year).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	// ****Select year from the dropdown****//
	public void yearselect() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", yearselection);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	// ****Click on calendar****//
	public void showcalendar() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", calendar);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	// ****Click on day****//
	public void day() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(dayselected).click().doubleClick().perform();
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	// ****Click on popup****//
	public void popup() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(popupselected).doubleClick().build().perform();
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	// ****Click on calendar for changing the date****//
	public void save() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(dayreset).doubleClick().build().perform();
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	// ****Click on calendar for changing the date****//
	public void reset() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(reset).doubleClick().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

}
