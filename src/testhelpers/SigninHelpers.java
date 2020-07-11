package testhelpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

//Class that handles the sign in details to access the Rental Manager page, and the login setting for RS
public class SigninHelpers {
	
	public static void modName(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Types the mod sign in into a window
		robot.keyPress(KeyEvent.VK_M); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_O); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_D); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_M); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_A); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_K); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_K); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_A); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_R); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_I); 
        Thread.sleep(50);
	}
	
	public static void modPass(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Types the mod sign in password into a window
		robot.keyPress(KeyEvent.VK_SHIFT); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_S); 
        Thread.sleep(50);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_H); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_A); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_R); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_P); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_I); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_E); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_1); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_2); 
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_3); 
        Thread.sleep(50); 
	}
	
	public static void rsLogIn(Robot robot)throws IOException, 
	AWTException, InterruptedException{
		//Sets output and logs in using the login previous mouse movements
		Thread.sleep(15000);
		DebugProcs.setOutAH(robot);
        Thread.sleep(2000);
        
        String login = "dl gundam1 tester";
        StringSelection stringSelection = new StringSelection(login);
		
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        MouseMovements.loginPrev(robot);
        Thread.sleep(2000);
        MouseMovements.loginPrev(robot);
        Thread.sleep(2000);
        MouseMovements.loginPrev(robot);
        Thread.sleep(2000);
        MouseMovements.loginPrev(robot);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        Thread.sleep(2000);
	}
	
	public static void rsLogInF2P(Robot robot)throws IOException, 
	AWTException, InterruptedException{
		//Sets output and logs in using the login previous mouse movements
		Thread.sleep(15000);
		DebugProcs.setOutAH(robot);
        Thread.sleep(2000);
        
        String login = "dl exia0 tester";
        StringSelection stringSelection = new StringSelection(login);
		
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        MouseMovements.loginPrev(robot);
        Thread.sleep(2000);
        MouseMovements.loginPrev(robot);
        Thread.sleep(2000);
        MouseMovements.loginPrev(robot);
        Thread.sleep(2000);
        MouseMovements.loginPrev(robot);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        Thread.sleep(2000);
	}
}
