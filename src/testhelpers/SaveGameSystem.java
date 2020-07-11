package testhelpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveGameSystem {
	
	public static void saveGameSetup(WebDriver driver,Robot robot)throws IOException, 
	AWTException, InterruptedException {
		//Opens Login Manager WTQA in a chrome window and logs in and then sets the save game
		String webURL = "https://wtqa1.office.jagex.com:11000/index";
		driver.get(webURL);
		
		SigninHelpers.modName(robot);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(50);
		SigninHelpers.modPass(robot);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(50);
		
		driver.findElement(By.xpath("/html/body/fieldset[11]/ul/li[6]/a")).click();
		Thread.sleep(50);
		driver.findElement(By.id("username")).sendKeys("gundam1");
		Thread.sleep(50);
		robot.mouseMove(170, 250);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
		robot.mouseMove(270, 65);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
		
		String location = "C:\\software";
        StringSelection stringSelection = new StringSelection(location);
		
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		Thread.sleep(1000);
       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

		robot.mouseMove(270, 490);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
		
		String filename = "gundam1.sav";
        stringSelection = new StringSelection(filename);
		
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		Thread.sleep(1000);
       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
		//DebugProcs.saveGame(robot);
		Thread.sleep(500);
		robot.mouseMove(130, 275);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
	}
	
	public static void saveGameSetupF2P(WebDriver driver,Robot robot)throws IOException, 
	AWTException, InterruptedException {
		//Opens Login Manager WTQA in a chrome window and logs in and then sets the save game
		String webURL = "https://wtqa1.office.jagex.com:11000/index";
		driver.get(webURL);
		
		SigninHelpers.modName(robot);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(50);
		SigninHelpers.modPass(robot);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(50);
		
		driver.findElement(By.xpath("/html/body/fieldset[11]/ul/li[6]/a")).click();
		Thread.sleep(50);
		driver.findElement(By.id("username")).sendKeys("exia0");
		Thread.sleep(50);
		robot.mouseMove(170, 250);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
		robot.mouseMove(270, 65);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
		
		String location = "C:\\software";
        StringSelection stringSelection = new StringSelection(location);
		
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		Thread.sleep(1000);
       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

		robot.mouseMove(270, 490);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
		
		String filename = "exia0.sav";
        stringSelection = new StringSelection(filename);
		
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		Thread.sleep(1000);
       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
		//DebugProcs.saveGame(robot);
		Thread.sleep(500);
		robot.mouseMove(130, 275);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
	}
	
}

