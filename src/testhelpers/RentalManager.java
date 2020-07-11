package testhelpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

//Class deals with opening the Rental manager, getting a new world and cancelling a world.
public class RentalManager {
	
	public static void rentalManager(WebDriver driver,Robot robot)throws IOException, 
	AWTException, InterruptedException {
		//Opens Rental Manager in a chrome window and logs in using the Mod_Makkari user
		String webURL = "https://tws13.office.jagex.com:10991/index.ws";
		driver.get(webURL);
		
		SigninHelpers.modName(robot);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(50);
		SigninHelpers.modPass(robot);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(50);
	}
	
	public static void contentBranch(String branchChoice, WebDriver driver, Robot robot)throws IOException, 
	AWTException, InterruptedException {
		//Sets perforce content branch to a user defined setting
		Select Branch = new Select(driver.findElement(By.id("content0")));
		Branch.selectByValue(branchChoice);
		//Sets perforce content branch to a user defined setting
		Select accType = new Select(driver.findElement(By.id("modeaccounttype")));
		accType.selectByValue("1");
		//Sets the inactivity timeout to 1 hour
		Select inactivity = new Select(driver.findElement(By.id("inactivity")));
		inactivity.selectByValue("2");
		
		//Clicks the Get New World Button
		driver.findElement(By.xpath("//*[@id=\"newrentaltable\"]/tbody/tr[19]/td[2]/input")).click();
		Thread.sleep(150000);
		driver.navigate().refresh();
		
		//Clicks the NXT Launcher link
		driver.findElement(By.xpath("/html/body/fieldset[1]/fieldset/table/tbody/tr[7]/td[2]/a[1]")).click();
		Thread.sleep(500);
		robot.mouseMove(530,220);
		Thread.sleep(50);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	
	public static void contentBranchF2P(String branchChoice, WebDriver driver, Robot robot)throws IOException, 
	AWTException, InterruptedException {
		//Sets perforce content branch to a user defined setting
		Select Branch = new Select(driver.findElement(By.id("content0")));
		Branch.selectByValue(branchChoice);
		//Sets perforce content branch to a user defined setting
		Select accType = new Select(driver.findElement(By.id("modeaccounttype")));
		accType.selectByValue("0");
		//Sets the inactivity timeout to 1 hour
		Select inactivity = new Select(driver.findElement(By.id("inactivity")));
		inactivity.selectByValue("2");
		
		//Clicks the Get New World Button
		driver.findElement(By.xpath("//*[@id=\"newrentaltable\"]/tbody/tr[19]/td[2]/input")).click();
		Thread.sleep(150000);
		driver.navigate().refresh();
		
		//Clicks the NXT Launcher link
		driver.findElement(By.xpath("/html/body/fieldset[1]/fieldset/table/tbody/tr[7]/td[2]/a[1]")).click();
		Thread.sleep(500);
		robot.mouseMove(530,220);
		Thread.sleep(50);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	
	public static void testCleanup(Robot robot)throws IOException, 
	AWTException, InterruptedException {
		//Hits the Cancel Rental button and closes the browser
		Thread.sleep(500);
		robot.mouseMove(730, 350);
		Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
		robot.mouseMove(660, 200);
		Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
		robot.mouseMove(930, 20);
		Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);	
	}

	
}
