package testhelpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

//Class that holds all the mouse movement methods to be used in tests
public class MouseMovements {
	
	public static void loginPrev(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to Login Previous Button and presses it
		robot.mouseMove(1660, 110);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void logOut(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to Logout Button and presses it
		robot.mouseMove(1650, 125);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void stopLogout(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to Stop Logout Button and presses it
		robot.mouseMove(1660, 100);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void allowLogout(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to Stop Logout Button and presses it
		robot.mouseMove(1755, 110);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void treasureHunterMenu(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to Treasure Hunter Interface Button and presses it
		robot.mouseMove(1850, 1025);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void playerWardrobe(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to Wardrobe Interface Button and presses it
		robot.mouseMove(950, 1050);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void yakTrack(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to YakTrack Interface Button and presses it
		robot.mouseMove(750, 490);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);  
	}
	
	public static void chestInterface(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to TH Chest opening Interface Button and presses it
		robot.mouseMove(750, 690);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void setRibbon(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to Ribbon settings button and sets up ribbon and presses it
		robot.mouseMove(750, 690);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void closeRune(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to close Runescape
		robot.mouseMove(1900,10);
        Thread.sleep(50);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
   
	}
	
	public static void closeInterface(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to TH Chest opening Interface Button and presses it
		robot.mouseMove(1340, 265);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void setInventory(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to Ribbon settings button and sets up ribbon and presses it
		robot.mouseMove(1730, 650);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void skipTrhTutorial(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
		robot.mouseMove(1000, 800);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		/*        
		robot.mouseMove(900, 520);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);*/
	}
	
	public static void closeChat(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to Chat boxes and closes them
		robot.mouseMove(515, 820);
		
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
       		
        Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
       		
        Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
      		
        Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        		
        Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
      		
        Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
       		
        Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
      		
        Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
}
