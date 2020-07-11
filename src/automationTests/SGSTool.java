package automationTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import testhelpers.ArraySetupSystems;
import utilities.ChestInventory;
import utilities.InventoryResults;
import utilities.OutfitArray;
import utilities.sgsArray;



public class SGSTool {
	
	public static void wtqaHomePage(WebDriver driver,Robot robot)throws IOException, 
	AWTException, InterruptedException {
		
		//Logs into main WTQA portal of Runescape
		String webURL = "https://www-wtqa.runescape.com/community";
		driver.get(webURL);
		driver.findElement(By.xpath("//*[@id=\"header-login\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("warhound1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("tester");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"rs-login-submit\"]")).click();
		Thread.sleep(1000);
		
	}
	
	public static void sgsHomePage(WebDriver driver,Robot robot)throws IOException, 
	AWTException, InterruptedException {
		
		String numPages;
		int pageNums;
		//Logs into SGS store
		String webURL = "https://www-wtqa.runescape.com/c=vJcmNy7k2y4/solomons-store";
		driver.get(webURL);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"info-template\"]/div/div[2]/main/section[1]/div/div/div/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("warhound1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("tester");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"du-login-submit\"]")).click();
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[4]")).click();
		Thread.sleep(5000);
		
		numPages = driver.findElement(By.xpath("//*[@id=\"pageNumbers\"]/li[7]/a")).getText();		
			
		pageNums = Integer.parseInt(numPages);
		Thread.sleep(1000);
		SGSTool.sgsItemLoop(driver, robot, pageNums);
		
				
	}
	
	public static void sgsItemLoop(WebDriver driver,Robot robot, int pageNums)throws IOException, 
	AWTException, InterruptedException {
		int fullPages = pageNums-1;
		int i = 0;
				
		while(i < fullPages) {
			SGSTool.sgsItem1(driver, robot);
			Thread.sleep(500);
						
			if(i == 0) {
				driver.findElement(By.xpath("//*[@id=\"pageControl\"]/div/div[1]/div/a")).click();
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"pageControl\"]/div/div[1]/div/a[2]")).click();
			}
			
			Thread.sleep(3000);
			i++;
			
			
		}
		
	}
	
	public static void sgsItem1(WebDriver driver,Robot robot)throws IOException, 
	AWTException, InterruptedException {
		
		String itemName ="";
		String initCost ="0";
		String memDiscount = "0";
		String saleDiscount = "0";
		String finCost = "0";
		String discountType = "0";
		int i = 1;
		
		//Selects item
		driver.findElement(By.xpath("//*[@id=\"itemContent\"]/article[1]/div[2]/a/span")).click();
		Thread.sleep(1000);
		//Item Name
		itemName = driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[2]/section/article/h2")).getText();		
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"popupContainer\"]/div/div[2]/section/article/div[2]/table/tbody/tr"));
		int count = rows.size();
		
		//Works through the rows in the table grabbing the data
		for(i=1;i<=count;i++)
		{
			discountType = driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[2]/section/article/div[2]/table/tbody/tr["+i+"]/td[1]")).getText();
			if(discountType.equalsIgnoreCase("Base Cost")) {
				initCost = driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[2]/section/article/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();		
			}
			else if(discountType.equalsIgnoreCase("Promotional Discount (50%)")){		
				saleDiscount = driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[2]/section/article/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();		
			}
			else if(discountType.equalsIgnoreCase("Member's Discount (10%)")){
				memDiscount = driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[2]/section/article/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();		
			}
			else if(discountType.equalsIgnoreCase("Final Cost")){
				finCost = driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[2]/section/article/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();		
			}
		}
		
		System.out.println(itemName + " " + initCost + " " + memDiscount + " " + saleDiscount  + " " + finCost);	
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[1]/a")).click();	
	}
	
	

}
