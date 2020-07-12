package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationTests.SGSTool;
import skills.*;
import testhelpers.*;

public class MouseTestRunner {

	public static void main(String[] args) throws IOException, 
	AWTException, InterruptedException, AddressException, MessagingException{
				
		WebDriver driver;
		Robot robot = new Robot(); 
			
		//Opens the browser 
		//driver = DriverFactory.open("chrome");
		
		//Opens the browser 
		//driver = DriverFactory.open("chrome");
		
		Thread.sleep(5000);
		
		//Leave above as time to get setup
		     
		int testrun = 2;
		int numChestsRun = 2;
		String emailS = "ben.clark@jagex.com";
		String skillName = "thieving";
		String pLevel = "99";
		int taskNum = 45;
		String yakTaskSelection = "getvar runepass_task_progress_0";
		String yakTaskQuantity = "getvar runepass_task_progress_0";

/*
		SGSTool.wtqaHomePage(driver, robot);
		SGSTool.sgsHomePage(driver, robot);
		String runeCoin;
		
		
		
		driver.findElement(By.xpath("//*[@id=\"itemContent\"]/article[1]/div[2]/a/span")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[2]/section/article/div[3]/div[1]/div/a/span")).click();
		Thread.sleep(500);
		runeCoin = driver.findElement(By.xpath("//*[@id=\"balance\"]/li[2]/div[1]/p")).getText();
		
	*/
		
		
		DebugProcs.setYakRecipe(robot, "Fletching Shortbow");
		Thread.sleep(500);
		Fletching.shortbow(robot);
		
		
		
		
		
		
		
		
		
       
        
        
       
		
		/*robot.mouseMove(625, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
       
		
		*/
		
		
	}

}
