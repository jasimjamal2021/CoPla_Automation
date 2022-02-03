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

public class UnProcessedRecords extends BaseClass {

	public WebDriver driver;
	public WebDriverWait wait;

	public UnProcessedRecords(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15000);

	}

	@FindBy(xpath = "/html/body/div/nav/div[2]/div[3]/button")
	WebElement data;

	@FindBy(xpath = "//*[@id='navigationBar']/div[2]/div[3]/ul/li[5]")
	WebElement unprocessed;

	@FindBy(xpath = "//*[@id='sortingProcessFilter']")
	WebElement sorting;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div/div[2]/div[2]/div[1]/div/div/div/ul/li/span/div")
	List<WebElement> sortingfilters;

	@FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div/div/ul/li[4]/span/div")
	WebElement cams;

	@FindBy(xpath = "//*[@id='filterStartDate']/input")
	WebElement startdate;

	@FindBy(xpath = "//table[@class='p-datepicker-calendar']/tbody/tr/td")
	List<WebElement> totaldays;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/span")
	WebElement todaystartdate;

	@FindBy(xpath = "//*[@id='filterEndDate']/button")
	WebElement enddate;

	@FindBy(xpath = "//td[@class='p-datepicker-today']")
	WebElement todaysenddate;

	@FindBy(xpath = "//*[@id='root']/div[1]/div/div/div[2]/div[3]/div/button[1]")
	WebElement applyfilter;

	@FindBy(xpath = "//tbody[@class='d3njkh-0 hrNpFH']/tr")
	List<WebElement> table;

	@FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div[3]/div/button[2]/span/label")
	WebElement clearfilter;

	@FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div/div/ul/li[3]/span/div")
	WebElement msm;

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

	/**** Select Unprocessed records screen from dropdown ****/
	public void unprocessedscreenclick() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(unprocessed));
			act.moveToElement(unprocessed).click().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on sorting process ****/
	public void sortingrprocessclick() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", sorting);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on sorting process ****/
	public void selectsortingrprocessclick() {
		try {
			for (int i = 0; i < sortingfilters.size(); i++) {
				System.out.println(sortingfilters.size());
				String values = sortingfilters.get(i).getAttribute("sc-1ypvmfj-0 cABBSz");
				if (values.contains("MSM")) {
					sortingfilters.get(i).click();
					break;
				} else {
					System.out.println("Error");
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on CAMS ****/
	public void selectcams() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(cams));
			act.moveToElement(cams).click().build().perform();

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on start date ****/

	public void startdateclick() {
		try {
			startdate.click();
			/*
			 * for (int i = 0; i < totaldays.size(); i++) { String val =
			 * totaldays.get(i).getAttribute("p-datepicker-calendar"); if
			 * (val.contains("18")) { totaldays.get(i).click(); break; } else {
			 * System.out.println("Error"); } }
			 */
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on Todaysdays ****/
	public void todaysdays() {
		try {
			todaystartdate.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on end date calendar ****/
	public void enddate() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(enddate));
			act.moveToElement(enddate).click().build().perform();

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on end date as today ****/
	public void todaysenddate() {
		try {
			todaysenddate.click();

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on applytfilter ****/
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

	/**** Verify table contain any data ****/
	public void tableisemptyornot() {
		try {
			if (table.isEmpty()) {
				logger.info("Checking table is empty or not");

			} else {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(3000);
				System.out.println("Table contains data");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on cleartfilter ****/
	public void clearfilter() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(clearfilter));
			act.moveToElement(clearfilter).click().build().perform();

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

	/**** Click on MSM ****/
	public void selectmsm() {
		try {
			Actions act = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(msm));
			act.moveToElement(msm).click().build().perform();

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			// TODO: handle exception
		}
	}

}
